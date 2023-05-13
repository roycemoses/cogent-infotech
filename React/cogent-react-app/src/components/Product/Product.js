import React from 'react';
import './Product.css'
// function Product()
// {
//     return(
//         <div>
//             <div>Product #1001</div>
//             <div>Product name: Headphones</div>
//             <div>Product price: $40.00</div>
//         </div>
//     );
// }

const Product=(props)=>
{
    return(
        <div className="product-item">
            <div>Product #{props.itemNo}</div>
            <div>Product name: {props.itemName}</div>
            <div>Product price: ${props.itemPrice}</div>
            {'\n\n\n'}<br></br>
        </div>
    );
}

// class Product extends React.Component
// {
//     render()
//     {
//         return(
//             <div className="product-item">
//                 <font color="yellow">
//                 <div>Product #1001</div>
//                 <div>Product name: Headphones</div>
//                 <div>Product price: $99.00</div>
//                 </font>
//             </div>
//         )
//     }
// }

export default Product;
