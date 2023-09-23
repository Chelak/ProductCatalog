<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <a href="/"><h2 class="text-center text-dark mt-5">Registration Form</h2></a>
            <div class="card my-5">

                <form id="registrationForm" class="card-body cardbody-color p-lg-5">
                    <div class="mb-3">
                        <input name="firstName" type="text" class="form-control" id="FirstName" aria-describedby="User name" placeholder="Fist name">
                    </div>
                    <div class="mb-3">
                        <input name="lastName" type="text" class="form-control" id="LastName" aria-describedby="emailHelp" placeholder="Last name">
                    </div>
                    <div class="mb-3">
                        <input name="email" type="text" class="form-control" id="Username" aria-describedby="emailHelp" placeholder="Email">
                    </div>
                    <div class="mb-3">
                        <input name="password" type="password" class="form-control" id="password" placeholder="password">
                    </div>
                    <div class="mb-3">
                        <input name="passwordCheck" type="password" class="form-control" id="passwordCheck" placeholder="password">
                    </div>
                    <div class="text-center"><button type="submit" class="btn btn-primary px-5 mb-5 w-100">Create Account</button></div>
                    <div id="emailHelp" class="form-text mb-3 text-dark">
                        <div class="mb-2" >Go to login page ? <a href="/login.html" class="text-dark fw-bold">Login</a></div>
                        <div class="mb-2" >Forgot Password? <a href="/reset-password.html" class="text-dark fw-bold"> Reset Password</a></div>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>
<script src="js/registration.js"></script>