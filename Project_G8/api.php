<?php
// Connect to the database
$conn = new mysqli("localhost", "	root", "password", "your_database_name");

// Handle the request
$action = $_GET['action'];

if ($action === 'getFood') {
    // Perform a SELECT query to retrieve food data
    // Convert the result to JSON and echo it
}

// Close the database connection
$conn->close();
?>
