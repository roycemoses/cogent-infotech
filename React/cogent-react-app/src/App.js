import './App.css';
import React from 'react';
// import Product from './components/Product/Product';
// import ATM from './components/ATM/ATM';

// function App() {
//   return (
//     <p>Hello world</p>
//     <div>
//     <Product></Product>
//     </div>
//   );
// }

// const App=()=>{
//     const products = [
//         {
//             id:'1001',
//             name: 'Headphones',
//             price: '123'
//         },
//         {
//             id:'1002',
//             name: 'Keyboard',
//             price: '456'
//         },
//         {
//             id:'1003',
//             name: 'Mic',
//             price: '789'
//         },
//         {
//             id:'1004',
//             name: 'Webcam',
//             price: '100'
//         },
//         {
//             id:'1005',
//             name: 'Monitor 1',
//             price: '200'
//         },
//         {
//             id:'1006',
//             name: 'Monitor 2',
//             price: '300'
//         }
//     ]
//     return (
//         <div>
//             {/* <Product itemNo='1001' itemName='Headphones' itemPrice='123'></Product>
//             <Product itemNo='1002' itemName='Keyboard' itemPrice='456'></Product>
//             <Product itemNo='1003' itemName='Mic' itemPrice='789'></Product>
//             <Product itemNo='1004' itemName='Webcam' itemPrice='100'></Product>
//             <Product itemNo='1005' itemName='Monitor 1' itemPrice='200'></Product>
//             <Product itemNo='1006' itemName='Monitor 2' itemPrice='300'></Product> */}
//             <Product itemNo={products[0].id} itemName={products[0].name} itemPrice={products[0].price}></Product>
//             <Product itemNo={products[1].id} itemName={products[1].name} itemPrice={products[1].price}></Product>
//             <Product itemNo={products[2].id} itemName={products[2].name} itemPrice={products[2].price}></Product>
//             <Product itemNo={products[3].id} itemName={products[3].name} itemPrice={products[3].price}></Product>
//             <Product itemNo={products[4].id} itemName={products[4].name} itemPrice={products[4].price}></Product>
//             <Product itemNo={products[5].id} itemName={products[5].name} itemPrice={products[5].price}></Product>
//         </div>
//     )
// }


// Increment counter
// class App extends React.Component
// {
//     constructor(props)
//     {
//         super(props);
//         this.state = 
//         {
//             count:0
//         };
//     }
//     incrementCount=()=>{
//         this.setState({count:this.state.count+1});
//     }
//     render()
//     {
//         return (
//         <div>
//             <p>{this.state.count}</p>
//             <button onClick={this.incrementCount}>Increment Count</button>
//         </div>
//         )
//     }
// }

function App() {
  const [balance, setBalance] = React.useState('');
  const [lastName, setLastName] = React.useState('');
  const [message, setMessage] = React.useState('');

  const handleSubmit = (event) => {
    event.preventDefault();

    setMessage(`Current balance: ${balance}`);
    setBalance('');
    setLastName('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        id="balance"
        name="balance"
        value={balance}
        placeholder="Balance"
        onChange={(event) =>
          setBalance(event.target.value)
        }
      />

      <br />
      <br />

      <input
        type="text"
        id="lastName"
        name="lastName"
        value={lastName}
        placeholder="Last Name"
        onChange={(event) => {
          setLastName(event.target.value);
        }}
      />

      <br />
      <br />

      <button type="submit">Submit</button>

      <br />
      <br />

      <h2>{message}</h2>
    </form>
  );
}

export default App;
