package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecordMax")

@Data
public class XmlRecordMax extends XmlRecordMaxSerialized { 
   

						@Getter @Setter private char[] xmlRecordMaxString = Field.fillLowValue(80);
	
	/**
	* Constructor for XmlRecordMax
	**/
    public XmlRecordMax() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for XmlRecordMax. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XmlRecordMax(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
