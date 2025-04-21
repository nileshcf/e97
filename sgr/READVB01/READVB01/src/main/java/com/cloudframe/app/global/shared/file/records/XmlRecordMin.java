package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.shared.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecordMin")

public class XmlRecordMin extends XmlRecordMinSerialized { 
   

						private char[] xmlRecordMinString = Field.fillLowValue(43);
	
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
    

	/**
	 *	Returns the value of xmlRecordMinString
	 *	@return xmlRecordMinString
	 */
   public char[] getXmlRecordMinString() throws CFException{
     if (isXmlRecordMinStringModified()) { 
        xmlRecordMinString = refreshXmlRecordMinString();
     }
   		return xmlRecordMinString;
   }

  
	/**
	*  set variable xmlRecordMinString
	*  Corresponding COBOL Variable is XML-RECORD-MIN-STRING
	*  @param value
	**/
   public void setXmlRecordMinString(char[] value) {
      xmlRecordMinString = checkXmlRecordMinStringConstraints(value);
      serializeXmlRecordMinString(xmlRecordMinString);
   } 

     /**
	 * 	Update XmlRecordMinString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMinString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXmlRecordMinString,xmlRecordMinString.length);
   	
   }
   
   public void setXmlRecordMinString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMinString,xmlRecordMinString.length);
   	
   }
   
     /**
	 * 	Update XmlRecordMinString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMinString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMinString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XmlRecordMinString with another Field
	 *	@param value
	 */
   public void setXmlRecordMinString(Field source) {
       replace(source,0,source.length(),beginXmlRecordMinString,XML_RECORD_MIN_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update XmlRecordMinString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXmlRecordMinString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXmlRecordMinString,XML_RECORD_MIN_STRING_LEN);
   	
   }
   
     /**
	 * 	Update XmlRecordMinString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMinString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordMinString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXmlRecordMinFieldLength() {
			return XML_RECORD_MIN_LENGTH;
		}

}
  
