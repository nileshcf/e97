package com.cloudframe.app.cfif01.dto;

/**
*  The class Init is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Init extends InitSerialized { 
   

								@Getter @Setter private short dispNum;

						@Getter @Setter private char[] charWs = new char[1];

						@Getter @Setter private char[] char1 = new char[1];

								@Getter @Setter private int intWs;

						@Getter @Setter private char[] char2 = new char[5];
	
	/**
	* Constructor for Init
	**/
    public Init() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Init. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Init(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCharWs(("A").toCharArray());
								setChar1(("A").toCharArray());
								setIntWs(88);
								setChar2(String.join("", java.util.Collections.nCopies(5, "B")).toCharArray());
    } 



}
  
