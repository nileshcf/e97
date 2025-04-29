package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.shared.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecordMax")

public class XmlRecordMax extends XmlRecordMaxSerialized { 
   

						private char[] xmlRecordMaxString = Field.fillLowValue(80);
	
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
    

	/**
	 *	Returns the value of xmlRecordMaxString
	 *	@return xmlRecordMaxString
	 */
   public char[] getXmlRecordMaxString() throws CFException{
     if (isXmlRecordMaxStringModified()) { 
        xmlRecordMaxString = refreshXmlRecordMaxString();
     }
   		return xmlRecordMaxString;
   }

  
	/**
	*  set variable xmlRecordMaxString
	*  Corresponding COBOL Variable is XML-RECORD-MAX-STRING
	*  @param value
	**/
   public void setXmlRecordMaxString(char[] value) {
      xmlRecordMaxString = checkXmlRecordMaxStringConstraints(value);
      serializeXmlRecordMaxString(xmlRecordMaxString);
   } 

     /**
	 * 	Update XmlRecordMaxString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMaxString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXmlRecordMaxString,xmlRecordMaxString.length);
   	
   }
   
   public void setXmlRecordMaxString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMaxString,xmlRecordMaxString.length);
   	
   }
   
     /**
	 * 	Update XmlRecordMaxString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMaxString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMaxString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XmlRecordMaxString with another Field
	 *	@param value
	 */
   public void setXmlRecordMaxString(Field source) {
       replace(source,0,source.length(),beginXmlRecordMaxString,XML_RECORD_MAX_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update XmlRecordMaxString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXmlRecordMaxString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXmlRecordMaxString,XML_RECORD_MAX_STRING_LEN);
   	
   }
   
     /**
	 * 	Update XmlRecordMaxString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMaxString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMaxString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXmlRecordMaxFieldLength() {
			return XML_RECORD_MAX_LENGTH;
		}

}
  
