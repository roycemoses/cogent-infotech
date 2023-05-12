import React, { useState, useEffect } from 'react';
import {Button, Table} from 'react-bootstrap';
import Form from 'react-bootstrap/Form';
import "bootstrap/dist/css/bootstrap.min.css";
import getUsers from './Users';
import { Link, useNavigate } from 'react-router-dom';

function Home() {

    const [Users, setUsers] = useState([]);
    const [query, setQuery] = useState('');

    useEffect(() => {
        setUsers(getUsers().then(response => setUsers((response))));
    }, [])

    let navigation = useNavigate();

    const handleDeleteUser = (id) => {
        let index = Users.map(function(e){
            return e.id;
        }).indexOf(id);
        Users.splice(index,1);        
        // console.log(id);

        fetch('http://localhost:8080/api/users/id='+id, { method: "DELETE"})
        .then(async response => {
            const data = await response.json();

            // check for error response
            if (!response.ok) {
                // get error message from body or default to response status
                const error = (data && data.message) || response.status;
                return Promise.reject(error);
            }

            alert('Delete successful! (id = ' + id + ')')
        })
        .catch(error => {
            console.error('There was an error!', error);
        });

        navigation('/');
    }

    const handleEditUser = (id, imageURL, firstName, lastName, email) => {
        localStorage.setItem('id', id);
        localStorage.setItem('imageURL', imageURL);
        localStorage.setItem('firstName', firstName);
        localStorage.setItem('lastName', lastName);
        localStorage.setItem('email', email);
    }

    return (
        <React.Fragment>
            <br />
            <h1>Welcome to Royce's User Management App!</h1>
            <br /><br />
            <Link className='d-grid gap-2' to={'/add'}>
                    <Button size="lg btn-success">Add user</Button>
            </Link>
            <br /><br /><br />
            <div style={{marginRight:"50rem", marginLeft:"15rem"}}>
                <Form className='d-grid gap-2'>
                <Form.Group className='mb-3' controlId='formFirstName'>
                    <Form.Control type='text' placeholder='Search' value={query} required onChange={(e) => setQuery(e.target.value)}>
                    </Form.Control>
                </Form.Group>
                </Form>
            </div>
            <div style={{margin:"10rem", marginTop:"2rem"}}>
                <Table striped bordered hover size="sm">
                    <thead>
                        <tr>
                            <th></th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                        <tbody>
                            {
                                Users && Users.length > 0 ?
                                Users.map((item) => {
                                    return(
                                        (item.firstName.includes(query) || item.lastName.includes(query)) &&
                                        <tr key={item.id}>
                                            <td>
                                                <div>
                                                    <img alt="not found" width={"250px"} src={item.imageURL} />
                                                </div>
                                            </td>
                                            <td>{item.firstName}</td>
                                            <td>{item.lastName}</td>
                                            <td>{item.email}</td>
                                            <td>
                                                <Link to={'/edit'}>
                                                    <Button className='px-4' onClick={() => handleEditUser(item.id, item.imageURL, item.firstName, item.lastName, item.email)}>Edit</Button> 
                                                </Link>
                                                &nbsp;
                                                <Button className='px-3 btn-danger' onClick={() => handleDeleteUser(item.id)}>Delete</Button>
                                            </td>
                                        </tr>
                                    )
                                })
                                :
                                <tr><td>No entries found</td></tr>
                            }
                        </tbody>
                </Table>
                <br />
            </div>
        </React.Fragment>
    )
}

export default Home; 