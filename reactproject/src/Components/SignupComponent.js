import { useState } from "react";
import "./SignupComponent.css";

import SignupSuccessComponent from "./SignupSuccessComponent";
import SignupErrorComponent from "./SignupErrorComponent";

const SignupComponent = props => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [password, setPassword] = useState("");
  const [mailId, setMailId] = useState("");
  const [phoneNumber, setPhoneNumber] = useState("");
  const [address, setAddress] = useState("");
  const [pincode, setPincode] = useState("");
  const [formState, setFormState] = useState(0);
  const handleSubmit = () =>
  {
    const url = "http://localhost:9966/api/user/signup"; // Replace with your endpoint URL

    const payload = {
      firstName: firstName,
      lastName: lastName,
      password: password,
      mailId: mailId,
      phoneNumber: phoneNumber,
      address: address,
      pincode: pincode
    };
  
    
    fetch(url, {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(payload)
      })
        .then((response) => response.json())
        .then((data) => {
          if(data.status === 200){
            console.log("Success");
            setFormState(200);
          }else{
            setFormState(500);
            console.log("Errossr");
          }
        })
        .catch((error) => {
          setFormState(500);
          console.log("Errorr");
        });
    };
  return (
    <div className="main-container">
      <label>First Name:</label>
      <input
        type="text"
        placeholder="First Name"
        value={firstName}
        required
        onChange={(e) => setFirstName(e.target.value)}
      />
      <label>Last Name:</label>
      <input
        type="text"
        placeholder="Last Name"
        value={lastName}
        onChange={(e) => setLastName(e.target.value)}
      />
      <label>Password:</label>
      <input
        type="password"
        placeholder="Password"
        value={password}
        required
        onChange={(e) => setPassword(e.target.value)}
      />
      <label>EmailId:</label>
      <input
        type="email"
        placeholder="Email"
        value={mailId}
        required
        onChange={(e) => setMailId(e.target.value)}
      />
      <label>Mobile Number:</label>
      <input
        type="text"
        placeholder="Mobile Number"
        value={phoneNumber}
        required
        onChange={(e) => setPhoneNumber(e.target.value)}
      />
      <label>Address:</label>
      <input
        type="text"
        placeholder="Address"
        value={address}
        onChange={(e) => setAddress(e.target.value)}
      />
      <label>Pincode:</label>
      <input
        type="text"
        placeholder="Pincode"
        value={pincode}
        required
        onChange={(e) => setPincode(e.target.value)}
      />
      <button onClick={handleSubmit}>Signup</button>
      {console.log(formState)}
      {(formState === 0) ? "" : ((formState === 500) ? <SignupErrorComponent /> : <SignupSuccessComponent />)}
    </div>
  );
}

export default SignupComponent;
