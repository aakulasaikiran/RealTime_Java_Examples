package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadFile;

public class UplServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw = null;
		MultipartFormDataRequest nreq = null;
		UploadBean upb=null;
		Hashtable ht=null;
		Enumeration e=null;
		//generete settings
		pw=res.getWriter();
		res.setContentType("text/html");
try{
	nreq=new MultipartFormDataRequest(req);
	upb=new UploadBean();
	/*upb.setFolderstore("E:/STORE");
	upb.setOverwrite(false);*/
	
	res.addHeader("context-desposition","attachment;filename=info.xls");
	res.setContentType("application/ms-excel");
	upb.store(nreq);
	pw.println("<h1>THE UPLOADED FILES ARE </h1>");
    ht=nreq.getFiles();
    e=ht.elements();
    while(e.hasMoreElements()){
    	UploadFile file=(UploadFile) e.nextElement();
    	pw.println("<br>"+file.getFileName()+" "+file.getFileSize());
    }//while
}//try
catch (Exception ex) {
	ex.printStackTrace();
}
	}// do post

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doPost(req, res);
	}

}// class
