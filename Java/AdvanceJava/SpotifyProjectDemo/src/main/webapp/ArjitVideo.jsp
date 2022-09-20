<%@page import="DataBaseConnectionDAO.ConnectionProvider,java.io.IOException,java.sql.*"%>
<html>
<head></head>
<style>
    body{

      text-align: center;
          height: 94vh;
          background: url("https://media.istockphoto.com/photos/retro-music-background-picture-id887280896?b=1&k=20&m=887280896&s=170667a&w=0&h=X1uG68uZ9u8aUT4-ozTatcaKFMZOQPu69EG84W-pPtI=") center/cover no-repeat;
      }
         h2{
          color:black
          }
          main{
              background: rgba(255,255,255,0.5);
              margin: 2rem 8rem;
                          padding: 2rem;
              border: 0.2rem solid white;
              border-radius: 0.5rem;
              color: black;

              }
                  button{
              font-size:200%;}  a{
                  margin: 2rem;
                  padding: 2rem;
                  }
    </style>
<body>
<main>


<%
         HttpSession httpSession = request.getSession();
                if(!httpSession.isNew()){
         ResultSet resultSet = null;
         Connection connection = ConnectionProvider.getConnection();


         try{
             PreparedStatement preparedStatement = connection.prepareStatement("select * from arjit_video");
             resultSet = preparedStatement.executeQuery();
             while(resultSet.next()){
             %><h2><% out.println(resultSet.getString(1)); %></h2>
             <video width="320" height="240" controls>
               <source src=<% out.println(resultSet.getString(2)); %> type="video/mp4">
               </video><%
             }
         }catch (Exception e){
             e.printStackTrace();
         }
%>
</main>
<footer>
<a href="LogoutServlet"><button>Log Out</button></a>
</footer>
<%
}else{
%>
<h2>LOGIN AGAIN</h2>
<%}
%>
</body>
</html>