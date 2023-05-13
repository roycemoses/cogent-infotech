import React, { useState, useEffect }  from 'react';
import { useParams } from 'react-router-dom';
const User = () => {
    const params = useParams();
    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [user, setUser] = useState(null);
    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/users/" + params.id)
            .then(res => res.json())
            .then(
                (data) => {
                    setIsLoaded(true);
                    setUser(data);
                },
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
      }, [params.id])
      if (error) {
        return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
        return <div>Loading...</div>;
    } else {
        return (
            <div>
                <h1>ID#: {user.id}</h1>
                <h1>Name: {user.name}</h1>
            </div>
        );
    }
};

export default User;