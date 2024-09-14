package index;

<!DOCTYPE html>
<html>
<head>
<title>Hall Ticket Generation</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Hall Ticket Generation System</h1>

    <!-- Add Student Form -->
    <form action="AddStudentServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="rollNumber">Roll Number:</label>
        <input type="text" id="rollNumber" name="rollNumber" required><br>

        <button type="submit">Add Student</button>
    </form>

    <!-- Generate Hall Ticket Form -->
    <form action="GenerateTicketServlet" method="post">
        <label for="studentId">Student ID:</label>
        <input type="number" id="studentId" name="studentId" required><br>

        <button type="submit">Generate Hall Ticket</button>
    </form>
</body>
</html>
