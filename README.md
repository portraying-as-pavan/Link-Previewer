<h1>Link Previewer</h1>
<p>This is a simple SpringBoot Application which takes a url and gives us it's preview in another webpage</p>
<h2>Tech Stack used</h2>
<ul>
<li>Spring Boot</li>
<li>PostgreSql</li>
<li>jQuery</li>
<li>Bootstrap</li>
</ul>
<h2>How to use</h2>
<p>Pre-Populate the user table with some values to login</p>
<p>Run the Application and hit <url>http://localhost:8080/home </url> in any browser</p>
<p>Spring security will automatically direct you to its login page</p>
<p>Use the prepopulated users details to login</p>
<p>Enter any Url to see it's Preview</p>
<h2> How it works</h2>
<p>we create Rest endpoints using spring boot and forms to take input using jsp</p>
<p> we then take help of jsoup to retrieve the information about the url and display it</p>
<p>Spring Security is configured to authenticate and jpa is used to store user details and link details</p>

<h6>Note</h6>
<p> This application is currently running on https://linkpreviewer.herokuapp.com/ </p>
