
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
<div class="container">
    <div class="row">
        <div>
            <h1>Add Two Numbers</h1>
        </div>
        <form th:action="@{addtion}" th:object="${addtion}" method="post">
            <div>
                <label>Num1</label>
                <input type="text" id="num1" class="form-control" name="num1" >
            </div>
            <div>
                <label>Num2</label>
                <input type="text" id="num2" class="form-control" name="num2" >
            </div>
            </br>
            <div>
                <input type="submit" value="submit" />
            </div>
        </form>
    </div>
</div>
</body>
</html>