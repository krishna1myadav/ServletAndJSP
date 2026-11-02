<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
    <div class="container p-5" >
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-body">
                        <h1 class="text-center">Registration Form</h1>
                        <form method="post" action="register">
                            <div class="form-group">
                                <label>Enter Name</label>
                                <input type="text" name="userName" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Enter Email</label>
                                <input type="text" name="email" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Enter Password</label>
                                <input type="text" name="password" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Select Course</label>
                                <select class="form-control">
                                    <option>B.Tech</option>
                                    <option>M.Tech</option>
                                    <option>BCA</option>
                                    <option>BBA</option>
                                    <option>MCA</option>
                                    <option>BA</option>
                                    <option>B.Pharma</option>
                                </select>
                            </div>
                            <button class="btn btn-primary">Register</button>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>
</body>
</html>