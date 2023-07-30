const SignupErrorComponent = props => {
    return (
      <div className="form-state error-block">
        <div className="title">Failed to Sign up!</div>
        <div className="desc">Failed to sign up because of invalid inputs.</div>
      </div>
    );
}
export default SignupErrorComponent;