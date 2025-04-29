package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CopybookData500 extends CopybookData500Serialized { 
   

						@Getter @Setter private char[] copybook010500 = new char[12];

						@Getter @Setter private char[] copybook020500 = new char[12];

						@Getter @Setter private char[] copybook030500 = new char[12];

						@Getter @Setter private char[] copybook040500 = new char[12];

						@Getter @Setter private char[] copybook050500 = new char[12];

						@Getter @Setter private char[] copybook060500 = new char[12];

						@Getter @Setter private char[] copybook070500 = new char[12];

						@Getter @Setter private char[] copybook080500 = new char[12];

						@Getter @Setter private char[] copybook090500 = new char[12];

	
	/**
	* Constructor for CopybookData500
	**/
    public CopybookData500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CopybookData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCopybook010500(("2000-10-14#0").toCharArray());
								setCopybook020500(("2001-01-15#0").toCharArray());
								setCopybook030500(("2001-07-05#0").toCharArray());
								setCopybook040500(("2002-05-23#0").toCharArray());
								setCopybook050500(("2003-05-27#0").toCharArray());
								setCopybook060500(("2010-04-05#0").toCharArray());
								setCopybook070500(("2010-05-25#0").toCharArray());
								setCopybook080500(("2012-09-25#0").toCharArray());
								setCopybook090500(("2013-04-15#0").toCharArray());
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(12, "fillHighValue(12)")).toCharArray()
             , getStartOffset() + 108
             ,12
             );
    } 



}
  
