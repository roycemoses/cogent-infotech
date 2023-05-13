import React from 'react';

const ATM=(props)=>
{
    return(
        <div className="product-item">
            <div>Enter your balance: </div>
            <label for="balance"></label>
            <input type="text" placeholder='Enter balance' onSubmit="updateBalance()">{props.balance}</input>
            <br></br>
            <div>Current Balance: </div>
            {'\n\n\n'}<br></br>
        </div>
    );
}

export default ATM; 