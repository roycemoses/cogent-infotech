// // COMPONENT LIFE-CYCLE
// import React from 'react';

// class App extends React.Component {
//     constructor (props) {
//         super(props);
//         this.state = { hello: "World" };
//     }

//     componentWillMount() {
//         console.log("componentWillMount()");
//     }

//     componentDidMount() {
//         console.log("componentDidMount()");
//     }

//     changeState() {
//         this.setState({ hello: "Royce" });
//     }

//     render() {
//         return (
//             <div>
//                 <h1>Hello, {this.state.hello}</h1>
//                 <button onClick={this.changeState.bind(this)}>Click here!</button>
//             </div>
//         );
//     }

//     shouldComponentUpdate(nextProps, nextState) {
//         console.log("shouldComponentUpdate()");
//         if (nextState.hello == this.state.hello)
//             return false;
//         else
//             return true;
//         // console.log(nextState.hello);
//         return true;
//     }

//     componentWillUpdate() {
//         console.log("componentWillUpdate()");
//     }

//     componentDidUpdate() {
//         console.log("componentDidUpdate()");
//     }
// }

// HOOKS
// export default App;

// import React from 'react';
// import { useState } from 'react';

// function App() {
//     const [name, setName] = useState("Royce");
//     const changeName = () => {
//         setName("Koko");
//     }

//     return (
//         <div>
//             <p>My name is {name}</p>
//             <button onClick={changeName}>Change name</button>
//         </div>
//     );
// }

// export default App;


// Broken time
// import React from 'react';
// // import { useState } from 'react';
// import Time from 'react';

// class App extends React.Component 
// {
//     getInitialState() {
//         return {
//           now: new Date(),
//         };
//         this.interval = null;
//       }
    
//       componentDidMount = () => {
//         const self = this;
//         self.interval = setInterval(function() {
//           self.setState({
//             now: new Date(),
//           });
//         }, 1000);
//       }
    
//       componentWillUnmount = () => {
//         clearInterval(this.interval);
//       }
    
//       render() {
//         return (
//         //   <div className="Menubar">
//         //     <ul className="Menubar-menu">
//         //       <div className="">
//         //         <li className="Menubar-name">login name</li>
//         //         <li className="Menubar-date"><Time value={this.state.now} format="DD/MM/YYYY" /></li>
//         //         <li className="Menubar-time"><Time value={this.state.now} format="HH:mm:ss" /></li>
//         //       </div>
//         //     </ul>
//         //   </div>
//         <div>
//             <Time value={this.state.now} format="DD/MM/YYYY" />
//             <Time value={this.state.now} format="HH:mm:ss" />
//         </div>
//         );
//       }

// }

// export default App;

// // Routing
// import {Routes, Route} from 'react-router-dom';
// import About from "./components/About";
// import Home from "./components/Home";
// import Blog from "./components/Blog";
// import Contact from "./components/Contact";
// import Navbar from './components/Navbar';

// function App() {
//     return (
//         <>
//         <Navbar />
//         <Routes>
//             <Route path="/" element={<Home/>} />
//             <Route path="/about" element={<About/>} />
//             <Route path="/blog" element={<Blog/>} />
//             <Route path="/contact" element={<Contact/>} />
//         </Routes>

//         </>
//     );
// }

// export default App;

import React from 'react';
import Webpages from './webpages/webpages';
function App()
{
    return (
        <div>
            <Webpages />
        </div>
    )
}

export default App;