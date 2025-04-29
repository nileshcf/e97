package com.cloudframe.app.sf327010.dto;

/**
*  The class Detail1205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Detail1205 extends Detail1205Serialized { 
   




						@Getter @Setter private char[] lserviceDate205 = new char[2];


						@Getter @Setter private char[] lserviceMonth205 = new char[3];


						@Getter @Setter private char[] lserviceCentury205 = new char[2];

						@Getter @Setter private char[] lserviceYear205 = new char[2];


						@Getter @Setter private char[] lserviceHh205 = new char[2];


						@Getter @Setter private char[] lserviceMins205 = new char[2];


						@Getter @Setter private char[] lserviceSec205 = new char[2];




						@Getter @Setter private char[] hserviceDate205 = new char[2];


						@Getter @Setter private char[] hserviceMonth205 = new char[3];


						@Getter @Setter private char[] hserviceCentury205 = new char[2];

						@Getter @Setter private char[] hserviceYear205 = new char[2];


						@Getter @Setter private char[] hserviceHh205 = new char[2];


						@Getter @Setter private char[] hserviceMins205 = new char[2];


						@Getter @Setter private char[] hserviceSec205 = new char[2];

	
	/**
	* Constructor for Detail1205
	**/
    public Detail1205() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Detail1205. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1205(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("REPORT ACTIVITY DATE RANGE").toCharArray()
             , getStartOffset() + 0
             ,26
             );
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 26
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 27
             ,1
             );
								setLserviceDate205(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 30
             ,1
             );
								setLserviceMonth205(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 34
             ,1
             );
								setLserviceCentury205(fillSpace(2));
								setLserviceYear205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
								setLserviceHh205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setLserviceMins205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 45
             ,1
             );
								setLserviceSec205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 48
             ,1
             );
       replaceValue( // serialize and save the value
             ("TO").toCharArray()
             , getStartOffset() + 49
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 51
             ,1
             );
								setHserviceDate205(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 54
             ,1
             );
								setHserviceMonth205(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 58
             ,1
             );
								setHserviceCentury205(fillSpace(2));
								setHserviceYear205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 63
             ,1
             );
								setHserviceHh205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 66
             ,1
             );
								setHserviceMins205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 69
             ,1
             );
								setHserviceSec205(fillSpace(2));
       replaceValue( // serialize and save the value
             pad(60," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 72
             ,60
             );
    } 



}
  
