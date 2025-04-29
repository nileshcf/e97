package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecordMin")

@Data
public class XmlRecordMin extends XmlRecordMinSerialized { 
   

						@Getter @Setter private char[] xmlRecordMinString = Field.fillLowValue(43);
	
	/**
	* Constructor for XmlRecordMin
	**/
    public XmlRecordMin() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XmlRecordMin. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XmlRecordMin(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
