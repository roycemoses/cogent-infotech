// const Users = [
//     {
//         id:"1",
//         firstName:"Royce",
//         lastName:"Moses",
//         email:"royce.kmoses@gmail.com"
//     },
//     {
//         id:"2",
//         firstName:"Chris",
//         lastName:"Evans",
//         email:"chris.evans@gmail.com"
//     },
//     {
//         id:"3",
//         firstName:"Scarlett",
//         lastName:"Johansson",
//         email:"scarlett.johansson@gmail.com"
//     }
// ]

// export default Users;

// import React, { useState, useEffect }  from 'react';
// import { useParams } from 'react-router-dom';
// const User = () => {
    // const params = useParams();
    // const [error, setError] = useState(null);
    // const [isLoaded, setIsLoaded] = useState(false);
    // const [Users, setUsers] = useState([]); // data
    // useEffect(() => {
    //     fetch("localhost:8080/users/")
    //         .then(res => res.json())
    //         .then(
    //             (data) => {
    //                 setIsLoaded(true);
    //                 setUsers(data);
    //             },
    //             (error) => {
    //                 setIsLoaded(true);
    //                 setError(error);
    //             }
    //         )
    //   }, [params.id])

    // getvals(){
    //     return fetch('https://jsonplaceholder.typicode.com/posts',
    //     {
    //         method: "GET",
    //       headers: {
    //         'Accept': 'application/json',
    //         'Content-Type': 'application/json',
    //       },
    //     })
    //     .then((response) => response.json())
    //     .then((responseData) => {
    //       console.log(responseData);
    //       return responseData;
    //     })
    //     .catch(error => console.warn(error));
    //   }
    
    // if (error) {
    //     return <div>Error: {error.message}</div>;
    // } else if (!isLoaded) {
    //     return <div>Loading...</div>;
    // } else {
    //     return (
    //         <div>
    //             <h1>ID#: {Users[0].id}</h1>
    //             <h1>Name: {Users[0].firstName}</h1>
    //         </div>
    //     );
    // }
// };

// export default User;

function getUsers(){
    return fetch('http://localhost:8080/api/users',
    {
    	method: "GET",
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
      },
    })
    .then((response) => response.json())
    .then((responseData) => {
    //   console.log(responseData);
      return responseData;
    })
    .catch(error => console.warn(error));
}

export default getUsers;