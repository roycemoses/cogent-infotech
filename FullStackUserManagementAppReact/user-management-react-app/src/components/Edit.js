import React, { useState, useEffect } from 'react';
// import { Button, Form } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import 'bootstrap/dist/css/bootstrap.min.css';
import getUsers from './Users';
// import { v4 as uuid } from 'uuid';
import { useNavigate } from 'react-router-dom';

function Edit()
{
    const[id, setId] = useState('');
    const[imageURL, setImageURL] = useState('');
    const[firstName, setFirstName] = useState('');
    const[lastName, setLastName] = useState('');
    const[email, setEmail] = useState('');
    const[Users, setUsers] = useState([]);

    useEffect(() => {
        setId(localStorage.getItem('id'));
        setImageURL(localStorage.getItem('imageURL'));
        setFirstName(localStorage.getItem('firstName'));
        setLastName(localStorage.getItem('lastName'));
        setEmail(localStorage.getItem('email'));
        setUsers(getUsers().then(response => setUsers((response))));
    }, [])

    let navigation = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault(); // hide other events

        let index = Users.map(function(e){
            return e.id;
        }).indexOf(id);
        console.log("index: " + index);

        let currentId = id;
        let a = firstName;
        let b = lastName;
        let c = email;
        let d = imageURL;

        // PUT request using fetch with error handling
        const requestOptions = {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ id: currentId, firstName: a, lastName: b, email: c, imageURL: d })
        };
        fetch('http://localhost:8080/api/users', requestOptions)
            .then(async response => {
                // const data = await response.json();

                // // check for error response
                // if (!response.ok) {
                //     // get error message from body or default to response status
                //     const error = (data && data.message) || response.status;
                //     return Promise.reject(error);
                // }

                // setPostId(data.id);
            })
            .catch(error => {
                console.error('There was an error!', error);
            });
        

        navigation("/");
    }

    return (
        <div>
            {/* {id}
            {errorMessage}
            {postId} */}
            <Form className='d-grid gap-2' style={{margin:"15rem"}}>
                <Form.Group className='mb-3' controlId='formImageURL'>
                    <Form.Control type='text' placeholder='Enter Image URL' value={imageURL} required onChange={(e) => setImageURL(e.target.value)}>
                    </Form.Control>
                </Form.Group>
                <Form.Group className='mb-3' controlId='formFirstName'>
                    <Form.Control type='text' placeholder='Enter First Name' value={firstName} required onChange={(e) => setFirstName(e.target.value)}>
                    </Form.Control>
                </Form.Group>
                <Form.Group className='mb-3' controlId='formLastName'>
                    <Form.Control type='text' placeholder='Enter Last Name' value={lastName} required onChange={(e) => setLastName(e.target.value)}>
                    </Form.Control>
                </Form.Group>
                <Form.Group className='mb-3' controlId='formEmail'>
                    <Form.Control type='text' placeholder='Enter Email' value={email} required onChange={(e) => setEmail(e.target.value)}>
                    </Form.Control>
                </Form.Group>
                <Button onClick={(e) => handleSubmit(e)} type='submit'>Update</Button>
            </Form>
        </div>
    );
}

export default Edit;