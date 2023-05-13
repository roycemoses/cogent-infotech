import React, { useState } from 'react';
// import { Button, Form } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import 'bootstrap/dist/css/bootstrap.min.css';
// import Users from './Users';
import { v4 as uuid } from 'uuid';
import { useNavigate } from 'react-router-dom';

function Add()
{
    const[imageURL, setImageURL] = useState('');
    const[firstName, setFirstName] = useState('');
    const[lastName, setLastName] = useState('');
    const[email, setEmail] = useState('');
    const[postId, setPostId] = useState(null);
    const[errorMessage, setErrorMessage] = useState(null);
    // this.state = {
    //     postId: null,
    //     errorMessage: null
    // };

    let navigation = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault(); // hide other events
        
        const ids = uuid(); // creating unique id
        let uniqueId = ids.slice(0,8);
        console.log(uniqueId);

        let a = firstName, b = lastName, c = email, d = imageURL; // taking form details and pushing it into the users array
        // Users.push({id : uniqueId, firstName : a, lastName : b, email : c});
        
        
        // POST request using fetch with error handling
        const requestOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ id: uniqueId, firstName: a, lastName: b, email: c, imageURL: d })
        };
        fetch('http://localhost:8080/api/users', requestOptions)
            .then(async response => {
                const isJson = response.headers.get('content-type')?.includes('application/json');
                const data = isJson && await response.json();

                // check for error response
                if (!response.ok) {
                    // get error message from body or default to response status
                    const error = (data && data.message) || response.status;
                    return Promise.reject(error);
                }

            setPostId(data.id);
        })
        .catch(error => {
            setErrorMessage(error.toString());
            console.error('There was an error!', error);
        });
        
        // fetch('http://localhost:8080/api/users/id='+id, { method: "DELETE"})
        //     .then(() => {setStatus('Delete successful')})

        navigation('/');
    }

    return (
            <div>
                {postId}
                {errorMessage}
                <Form className='d-grid gap-2' style={{margin:"15rem"}}>
                    <Form.Group className='mb-3' controlId='formImageURL'>
                        <Form.Control type='text' placeholder='Enter Image URL' value={imageURL} required onChange={(e) => setImageURL(e.target.value)}>
                        </Form.Control>
                    </Form.Group>
                    <Form.Group className='mb-3' controlId='formFirstName'>
                        <Form.Control type='text' placeholder='Enter First Name' required onChange={(e) => setFirstName(e.target.value)}>
                        </Form.Control>
                    </Form.Group>
                    <Form.Group className='mb-3' controlId='formLastName'>
                        <Form.Control type='text' placeholder='Enter Last Name' required onChange={(e) => setLastName(e.target.value)}>
                        </Form.Control>
                    </Form.Group>
                    <Form.Group className='mb-3' controlId='formEmail'>
                        <Form.Control type='text' placeholder='Enter Email' required onChange={(e) => setEmail(e.target.value)}>
                        </Form.Control>
                    </Form.Group>
                    <Button onClick={(e) => handleSubmit(e)} type='submit'>Submit</Button>
                </Form>
            </div>
    );
}

export default Add;
