<%@ page import="java.util.List" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%
    String location = request.getParameter("location");
    String keywords = request.getParameter("keywords");
    List<Listing> listings = getListings(location, keywords);
%>

<!DOCTYPE html>
<html>
<head>
  <title>Paying Guest System</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
  <header>
    <h1>Paying Guest System</h1>
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Search</a></li>
        <li><a href="#">Listings</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </nav>
  </header>
  
  <main>
    <section id="hero">
      <h2>Find your perfect paying guest accommodation</h2>
      <form>
        <input type="text" placeholder="Search by location or keywords">
        <button type="submit">Search</button>
      </form>
    </section>

    <section id="featured">
      <h2>Featured Listings</h2>
      <ul>
        <% for (Listing listing : listings) { %>
        <li>
          <h3><%= listing.

