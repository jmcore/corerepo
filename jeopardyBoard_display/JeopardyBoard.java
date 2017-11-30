/*
 * Team: Jeopardy Board Design
 * Emily, Matthew, Breana, Tatyana
*/

/**
 * this class generates the Jeopardy Board.
 */

import java.awt.Desktop;
import java.io.*;
import java.util.Formatter;
import randomSelectionButton;
//import getAnswer;
//import getQuestion;
//import getFromHTML;

public class JeopardyBoard {
    
    private String boardname;
    private String cssName;
    private String answerName;
    private String questionName;
	
    /**
    * constructor. 
    * @throws IOException 
    */
    public JeopardyBoard() {
        boardname = System.getProperty("user.dir"); //Gets the current directory
        cssName = System.getProperty("user.dir");
        answerName = System.getProperty("user.dir");
        questionName = System.getProperty("user.dir");
        
        GeneratehtmlTable(boardname); 
        GenerateCSS(cssName + "\\HTMLJeopardy"); 
        GenerateAnswers(answerName + "\\HTMLJeopardy"); 
        GenerateQuestions(questionName + "\\HTMLJeopardy"); 
    }

    /**
     * Generates index.html which is the Jeopardy Board template and team 
     * scoreboard. Random button selects random answer to go to.
     * Executes html file that is generated. 
     * @param tablename 
     */
    public void GeneratehtmlTable(String tablename){
        String table_dir = tablename;
        try{       
            File html_table = new File(table_dir, "index.html");
            if(!html_table.exists())
                html_table.createNewFile();
            try (Formatter html_table_io = new Formatter(html_table.getAbsolutePath())) {
                html_table_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                html_table_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                html_table_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                html_table_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title>Jeopardy Board</title>\n");
                html_table_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"HTMLJeopardy/default.css\" />\n");
                html_table_io.format("<style>\n table tr {background-color: #0000cc;} \n table tr {text-align: center;}\n table tr {color: white;}\n table tr {text-shadow: 3px 2px black;}\n </style>\n");
                html_table_io.format("</head>\n\n");
                html_table_io.format("<body>\n\n");
                html_table_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td>Category</td><td>Category</td><td>Category</td><td>Category</td><td>Category</td><td>Category</td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td><a id=\"value1x1\" href=\"HTMLJeopardy/answer1x1.html\">$200</a></td><td><a id=\"value1x2\" href=\"HTMLJeopardy/answer1x2.html\">$200</a></td><td><a id=\"value1x3\" href=\"HTMLJeopardy/answer1x3.html\">$200</a></td><td><a id=\"value1x4\" href=\"HTMLJeopardy/answer1x4.html\">$200</a></td><td><a id=\"value1x5\" href=\"HTMLJeopardy/answer1x5.html\">$200</a></td><td><a id=\"value1x6\" href=\"HTMLJeopardy/answer1x6.html\">$200</a></td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td><a id=\"value2x1\" href=\"HTMLJeopardy/answer2x1.html\">$400</a></td><td><a id=\"value2x2\" href=\"HTMLJeopardy/answer2x2.html\">$400</a></td><td><a id=\"value2x3\" href=\"HTMLJeopardy/answer2x3.html\">$400</a></td><td><a id=\"value2x4\" href=\"HTMLJeopardy/answer2x4.html\">$400</a></td><td><a id=\"value2x5\" href=\"HTMLJeopardy/answer2x5.html\">$400</a></td><td><a id=\"value2x6\" href=\"HTMLJeopardy/answer2x6.html\">$400</a></td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td><a id=\"value3x1\" href=\"HTMLJeopardy/answer3x1.html\">$600</a></td><td><a id=\"value3x2\" href=\"HTMLJeopardy/answer3x2.html\">$600</a></td><td><a id=\"value3x3\" href=\"HTMLJeopardy/answer3x3.html\">$600</a></td><td><a id=\"value3x4\" href=\"HTMLJeopardy/answer3x4.html\">$600</a></td><td><a id=\"value3x5\" href=\"HTMLJeopardy/answer3x5.html\">$600</a></td><td><a id=\"value3x6\" href=\"HTMLJeopardy/answer3x6.html\">$600</a></td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td><a id=\"value4x1\" href=\"HTMLJeopardy/answer4x1.html\">$800</a></td><td><a id=\"value4x2\" href=\"HTMLJeopardy/answer4x2.html\">$800</a></td><td><a id=\"value4x3\" href=\"HTMLJeopardy/answer4x3.html\">$800</a></td><td><a id=\"value4x4\" href=\"HTMLJeopardy/answer4x4.html\">$800</a></td><td><a id=\"value4x5\" href=\"HTMLJeopardy/answer4x5.html\">$800</a></td><td><a id=\"value1x6\" href=\"HTMLJeopardy/answer4x6.html\">$800</a></td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("<tr>\n");
                html_table_io.format("<td><a id=\"value5x1\" href=\"HTMLJeopardy/answer5x1.html\">$1000</a></td><td><a id=\"value5x2\" href=\"HTMLJeopardy/answer5x2.html\">$200</a></td><td><a id=\"value5x3\" href=\"HTMLJeopardy/answer5x3.html\">$1000</a></td><td><a id=\"value5x4\" href=\"HTMLJeopardy/answer5x4.html\">$1000</a></td><td><a id=\"value5x5\" href=\"HTMLJeopardy/answer5x5.html\">$1000</a></td><td><a id=\"value1x6\" href=\"HTMLJeopardy/answer5x6.html\">$1000</a></td>\n");
                html_table_io.format("</tr>\n");
                html_table_io.format("</table>\n\n");
                html_table_io.format("<table align=\"center\" border=“1” width=“300” height=“150\"> \n\n ");
                html_table_io.format("<table align=\"center\" border=“1” width=“300” height=“150\"> \n\n ");
                html_table_io.format("<tr>\n\n <td>Team 1</td><td>Team 2</td><td>Team 3</td><td>Team 4</td> \n\n </tr> \n\n <tr> \n\n <td>0</td><td>0</td><td>0</td><td>0</td> \n\n </tr>"); //getTeamScore() is called here
                html_table_io.format("</table>\n\n");
                html_table_io.format("<p align=\"center\"><a href="+ getHTML() + "><button class=\"button1\">Random</button></a></p>");
                html_table_io.format("</body>\n\n");
                html_table_io.format("</html>");
            } 
            Desktop.getDesktop().browse(html_table.toURI()); //opens html file
        }
        catch(IOException e){
            System.out.println("IOexception");
        }
    }

    /**
     * Generates css file
     * @param css  
     */
    public void GenerateCSS(String css){
        String question_dir = css;
        try{
            File modifications = new File(question_dir,"default.css");
            if(!modifications.exists())
                modifications.createNewFile();
            try (Formatter modifications_io = new Formatter(modifications.getAbsolutePath())) {
                modifications_io.format(".button1\n{\n background-color: #8A2BE2;\n border: none;color: white;");
                modifications_io.format("\n padding: 15px 32px;\n text-align: center;\n text-decoration: none;\n");
                modifications_io.format(" display: inline-block;\n font-size: 16px;\n font-weight: bold;\n border-radius: 6px; \n}\n");
                modifications_io.format(".button2\n{\n background-color: #4CAF50;\n border: none;color: white;");
                modifications_io.format("\n padding: 15px 32px;\n text-align: center;\n text-decoration: none;\n");
                modifications_io.format(" display: inline-block;\n font-size: 16px;\n font-weight: bold;\n border-radius: 6px; \n}\n");
                modifications_io.format(".button3\n{\n background-color: #800000;\n border: none;color: white;");
                modifications_io.format("\n padding: 15px 32px;\n text-align: center;\n text-decoration: none;\n");
                modifications_io.format(" display: inline-block;\n font-size: 16px;\n font-weight: bold;\n border-radius: 6px; \n}\n");
                modifications_io.format(".button4\n{\n background-color: #FF4500;\n border: none;color: white;");
                modifications_io.format("\n padding: 15px 32px;\n text-align: center;\n text-decoration: none;\n");
                modifications_io.format(" display: inline-block;\n font-size: 16px;\n font-weight: bold;\n border-radius: 6px; \n}\n\n");
                modifications_io.format("table\n{\n text-align:center;\n color:white;\n background-color:blue;\n }\n\n");
                modifications_io.format("#value1x1\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x1:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value1x2\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x2:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value1x3\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x3:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value1x4\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x4:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value1x5\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x5:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value1x6\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value1x6:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x1\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x1:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x2\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x2:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x3\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x3:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x4\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x4:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x5\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x5:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value2x6\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value2x6:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x1\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x1:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x2\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x2:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x3\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x3:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x4\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x4:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x5\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x5:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value3x6\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value3x6:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x1\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x1:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x2\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x2:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x3\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x3:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x4\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x4:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x5\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x5:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value4x6\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value4x6:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x1\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x1:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x2\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x2:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x3\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x3:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x4\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x4:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x5\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x5:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
                modifications_io.format("#value5x6\n {\n color:white;\n text-decoration:none;\n }\n\n");
                modifications_io.format("#value5x6:hover\n {\n color:yellow;\n font-weight:bold;\n }\n\n");
            }        
        }
        catch(IOException e){
            System.out.println("IOexception");
        }
    }
    /**
     * Generate answer HTML files.
     * @param answername 
     */
    public void GenerateAnswers(String answername) {
       try
       {
       String answer_dir = answername;
       
       //Creates HTML file attached to row 1 for Jeopardy Board
       for(int i=1; i<7; i++){
            String answer_file = "answer1x" + i + ".html";
            File answer = new File(answer_dir, answer_file);
                if(!answer.exists())
                    answer.createNewFile();
                Formatter answer_io = new Formatter(answer.getAbsolutePath());
                answer_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                answer_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                answer_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                answer_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                answer_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                answer_io.format("</head>\n\n");
                answer_io.format("<body>\n\n");
                answer_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                answer_io.format("<tr>\n");
                answer_io.format("<td id=\"answer1x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                answer_io.format("</tr>\n");
                answer_io.format("</table>\n\n");
                answer_io.format("<p align=\"center\"><a href=\"question1x" + i + ".html\"><button class=\"button2\">Question</button></a></p>\n\n\n");
                answer_io.format("</body>\n\n");	          
                answer_io.format("</html>");
                answer_io.close();
       }
       
       //Creates HTML file attached to row 2 for Jeopardy Board
       for(int i=1; i<7; i++){
            String answer_file = "answer2x" + i + ".html";
            File answer = new File(answer_dir, answer_file);
                if(!answer.exists())
                    answer.createNewFile();
                Formatter answer_io = new Formatter(answer.getAbsolutePath());
                answer_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                answer_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                answer_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                answer_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                answer_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                answer_io.format("</head>\n\n");
                answer_io.format("<body>\n\n");
                answer_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                answer_io.format("<tr>\n");
                answer_io.format("<td id=\"answer2x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                answer_io.format("</tr>\n");
                answer_io.format("</table>\n\n");
                answer_io.format("<p align=\"center\"><a href=\"question2x" + i + ".html\"><button class=\"button2\">Question</button></a></p>\n\n\n");
                answer_io.format("</body>\n\n");	          
                answer_io.format("</html>");
                answer_io.close();
       }
     
       //Creates HTML file attached to row 3 for Jeopardy Board
       for(int i=1; i<7; i++){
            String answer_file = "answer3x" + i + ".html";
            File answer = new File(answer_dir, answer_file);
                if(!answer.exists())
                    answer.createNewFile();
                Formatter answer_io = new Formatter(answer.getAbsolutePath());
                answer_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                answer_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                answer_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                answer_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                answer_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                answer_io.format("</head>\n\n");
                answer_io.format("<body>\n\n");
                answer_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                answer_io.format("<tr>\n");
                answer_io.format("<td id=\"answer3x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                answer_io.format("</tr>\n");
                answer_io.format("</table>\n\n");
                answer_io.format("<p align=\"center\"><a href=\"question3x" + i + ".html\"><button class=\"button2\">Question</button></a></p>\n\n\n");
                answer_io.format("</body>\n\n");	          
                answer_io.format("</html>");
                answer_io.close();
       }
     
       //Creates HTML file attached to row 4 for Jeopardy Board
       for(int i=1; i<7; i++){
            String answer_file = "answer4x" + i + ".html";
            File answer = new File(answer_dir, answer_file);
                if(!answer.exists())
                    answer.createNewFile();
                Formatter answer_io = new Formatter(answer.getAbsolutePath());
                answer_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                answer_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                answer_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                answer_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                answer_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                answer_io.format("</head>\n\n");
                answer_io.format("<body>\n\n");
                answer_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                answer_io.format("<tr>\n");
                answer_io.format("<td id=\"answer4x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                answer_io.format("</tr>\n");
                answer_io.format("</table>\n\n");
                answer_io.format("<p align=\"center\"><a href=\"question4x" + i + ".html\"><button class=\"button2\">Question</button></a></p>\n\n\n");
                answer_io.format("</body>\n\n");	          
                answer_io.format("</html>");
                answer_io.close();
       }
     
       //Creates HTML file attached to row 5 for Jeopardy Board
        for(int i=1; i<7; i++){
            String answer_file = "answer5x" + i + ".html";
            File answer = new File(answer_dir, answer_file);
                if(!answer.exists())
                    answer.createNewFile();
                Formatter answer_io = new Formatter(answer.getAbsolutePath());
                answer_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                answer_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                answer_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                answer_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                answer_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                answer_io.format("</head>\n\n");
                answer_io.format("<body>\n\n");
                answer_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                answer_io.format("<tr>\n");
                answer_io.format("<td id=\"answer5x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                answer_io.format("</tr>\n");
                answer_io.format("</table>\n\n");
                answer_io.format("<p align=\"center\"><a href=\"question5x" + i + ".html\"><button class=\"button2\">Question</button></a></p>\n\n\n");
                answer_io.format("</body>\n\n");	          
                answer_io.format("</html>");
                answer_io.close();
        }
        
       }
        catch(IOException e){
            System.out.println("IOexception");
            e.printStackTrace();
        } 
    }
    
    /**
     * Creates question HTML files.
     * @param questionname 
     */
    public void GenerateQuestions(String questionname){
        try {
	   String question_dir = questionname;
	   
            //Creates HTML file attached to row 1 for Jeopardy Board
            for(int i=1; i<7; i++){
                String question_file = "question1x" + i + ".html";
                File question = new File(question_dir, question_file);
                        if(!question.exists())
                                question.createNewFile();
                        Formatter question_io = new Formatter(question.getAbsolutePath());
                        question_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                        question_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                        question_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                        question_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                        question_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                        question_io.format("</head>\n\n");
                        question_io.format("<body>\n\n");
                        question_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                        question_io.format("<tr>\n");
                        question_io.format("<td id=\"question1x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                        question_io.format("</tr>\n");
                        question_io.format("</table>\n\n");
                         question_io.format("<p align=\"center\"><a href=\"../index.html \"><button class=\"button1\">Team 1</button></a><a href=\"../index.html \"><button class=\"button2\">Team 2 </button></a>");
                        question_io.format("<a href=\"../index.html \"><button class=\"button3\">Team 3 </button></a><a href=\"../index.html \"><button class=\"button4\">Team 4 </button></a></p>");
                        question_io.format("</body>\n\n");	          
                        question_io.format("</html>");
                        question_io.close();
            }
	   
            //Creates HTML file attached to row 2 for Jeopardy Board
            for(int i=1; i<7; i++){
                String question_file = "question2x" + i + ".html";
                File question = new File(question_dir, question_file);
                        if(!question.exists())
                                question.createNewFile();
                        Formatter question_io = new Formatter(question.getAbsolutePath());
                        question_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                        question_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                        question_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                        question_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                        question_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                        question_io.format("</head>\n\n");
                        question_io.format("<body>\n\n");
                        question_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                        question_io.format("<tr>\n");
                        question_io.format("<td id=\"question2x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                        question_io.format("</tr>\n");
                        question_io.format("</table>\n\n");
                        question_io.format("<p align=\"center\"><a href=\"../index.html \"><button class=\"button1\">Team 1</button></a><a href=\"../index.html \"><button class=\"button2\">Team 2 </button></a>");
                        question_io.format("<a href=\"../index.html \"><button class=\"button3\">Team 3 </button></a><a href=\"../index.html \"><button class=\"button4\">Team 4 </button></a></p>");
                        question_io.format("</body>\n\n");	          
                        question_io.format("</html>");
                        question_io.close();
	   }
	 
            //Creates HTML file attached to row 3 for Jeopardy Board
            for(int i=1; i<7; i++){
                String question_file = "question3x" + i + ".html";
                File question = new File(question_dir, question_file);
                        if(!question.exists())
                                question.createNewFile();
                        Formatter question_io = new Formatter(question.getAbsolutePath());
                        question_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                        question_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                        question_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                        question_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                        question_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                        question_io.format("</head>\n\n");
                        question_io.format("<body>\n\n");
                        question_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                        question_io.format("<tr>\n");
                        question_io.format("<td id=\"question3x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                        question_io.format("</tr>\n");
                        question_io.format("</table>\n\n");
                        question_io.format("<p align=\"center\"><a href=\"../index.html \"><button class=\"button1\">Team 1</button></a><a href=\"../index.html \"><button class=\"button2\">Team 2 </button></a>");
                        question_io.format("<a href=\"../index.html \"><button class=\"button3\">Team 3 </button></a><a href=\"../index.html \"><button class=\"button4\">Team 4 </button></a></p>");
                        question_io.format("</body>\n\n");	          
                        question_io.format("</html>");
                        question_io.close();
            }
	 
            //Creates HTML file attached to row 4 for Jeopardy Board
            for(int i=1; i<7; i++){
                String question_file = "question4x" + i + ".html";
                File question = new File(question_dir, question_file);
                        if(!question.exists())
                                question.createNewFile();
                        Formatter question_io = new Formatter(question.getAbsolutePath());
                        question_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                        question_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                        question_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                        question_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                        question_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                        question_io.format("</head>\n\n");
                        question_io.format("<body>\n\n");
                        question_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                        question_io.format("<tr>\n");
                        question_io.format("<td id=\"question4x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                        question_io.format("</tr>\n");
                        question_io.format("</table>\n\n");
                        question_io.format("<p align=\"center\"><a href=\"../index.html \"><button class=\"button1\">Team 1</button></a><a href=\"../index.html \"><button class=\"button2\">Team 2 </button></a>");
                        question_io.format("<a href=\"../index.html \"><button class=\"button3\">Team 3 </button></a><a href=\"../index.html \"><button class=\"button4\">Team 4 </button></a></p>");
                        question_io.format("</body>\n\n");	          
                        question_io.format("</html>");
                        question_io.close();
            }
	 
            //Creates HTML file attached to row 5 for Jeopardy Board
            for(int i=1; i<7; i++){
                String question_file = "question5x" + i + ".html";
                File question = new File(question_dir, question_file);
                        if(!question.exists())
                                question.createNewFile();
                        Formatter question_io = new Formatter(question.getAbsolutePath());
                        question_io.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\"\n");
                        question_io.format("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n\n");
                        question_io.format("<html xlms=\"http://www.w3.org/1999/xhtml\">\n\n");
                        question_io.format("<head>\n<meta http-equiv=\"Content-Type\" conetent=\"text/html; charset=utf-8\" />\n<title></title>\n");
                        question_io.format("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />");
                        question_io.format("</head>\n\n");
                        question_io.format("<body>\n\n");
                        question_io.format("<table align=\"center\" border=\"1\" width=\"600\" height=\"450\">\n");
                        question_io.format("<tr>\n");
                        question_io.format("<td id=\"question5x" + i + "\">" /*+fromList() is called here*/+"</td>\n");
                        question_io.format("</tr>\n");
                        question_io.format("</table>\n\n");
                        question_io.format("<p align=\"center\"><a href=\"../index.html \"><button class=\"button1\">Team 1</button></a><a href=\"../index.html \"><button class=\"button2\">Team 2 </button></a>");
                        question_io.format("<a href=\"../index.html \"><button class=\"button3\">Team 3 </button></a><a href=\"../index.html \"><button class=\"button4\">Team 4 </button></a></p>");
                        question_io.format("</body>\n\n");	          
                        question_io.format("</html>");
                        question_io.close();
            }	
        } catch(IOException e){
                System.out.println("IOexception");
                e.printStackTrace();
        }
    }
}
