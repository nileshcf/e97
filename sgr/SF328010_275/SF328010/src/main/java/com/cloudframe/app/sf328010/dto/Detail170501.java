package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail170501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Detail170501 extends Detail170501Serialized { 
   



						@Getter @Setter private char[] lserviceDate705 = new char[2];


						@Getter @Setter private char[] lserviceMonth705 = new char[3];


						@Getter @Setter private char[] lserviceCentury705 = new char[2];

						@Getter @Setter private char[] lserviceYear705 = new char[2];


						@Getter @Setter private char[] lserviceHh705 = new char[2];


						@Getter @Setter private char[] lserviceMins705 = new char[2];


						@Getter @Setter private char[] lserviceSec705 = new char[2];




						@Getter @Setter private char[] hserviceDate705 = new char[2];


						@Getter @Setter private char[] hserviceMonth705 = new char[3];


						@Getter @Setter private char[] hserviceCentury705 = new char[2];

						@Getter @Setter private char[] hserviceYear705 = new char[2];


						@Getter @Setter private char[] hserviceHh705 = new char[2];


						@Getter @Setter private char[] hserviceMins705 = new char[2];


						@Getter @Setter private char[] hserviceSec705 = new char[2];

	
	/**
	* Constructor for Detail170501
	**/
    public Detail170501() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Detail170501. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail170501(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("REPORT ACTIVITY DATE RANGE:").toCharArray()
             , getStartOffset() + 0
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 27
             ,2
             );
								setLserviceDate705(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 31
             ,1
             );
								setLserviceMonth705(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setLserviceCentury705(fillSpace(2));
								setLserviceYear705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 40
             ,1
             );
								setLserviceHh705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 43
             ,1
             );
								setLserviceMins705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 46
             ,1
             );
								setLserviceSec705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 49
             ,1
             );
       replaceValue( // serialize and save the value
             ("TO").toCharArray()
             , getStartOffset() + 50
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 52
             ,1
             );
								setHserviceDate705(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 55
             ,1
             );
								setHserviceMonth705(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 59
             ,1
             );
								setHserviceCentury705(fillSpace(2));
								setHserviceYear705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 64
             ,1
             );
								setHserviceHh705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 67
             ,1
             );
								setHserviceMins705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 70
             ,1
             );
								setHserviceSec705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(59)
             , getStartOffset() + 73
             ,59
             );
    } 



}
  
