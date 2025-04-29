package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.global.shared.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecord")

public class XmlRecord extends XmlRecordSerialized  implements InitializingBean {
   

						private char[] xmlRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for XmlRecord
	**/
    public XmlRecord() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of xmlRecordString
	 *	@return xmlRecordString
	 */
   public char[] getXmlRecordString() throws CFException{
     if (isXmlRecordStringModified()) { 
        xmlRecordString = refreshXmlRecordString();
     }
   		return xmlRecordString;
   }

  
	/**
	*  set variable xmlRecordString
	*  Corresponding COBOL Variable is XML-RECORD-STRING
	*  @param value
	**/
   public void setXmlRecordString(char[] value) {
      xmlRecordString = checkXmlRecordStringConstraints(value);
      serializeXmlRecordString(xmlRecordString);
   } 

     /**
	 * 	Update XmlRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXmlRecordString,xmlRecordString.length);
   	
   }
   
   public void setXmlRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordString,xmlRecordString.length);
   	
   }
   
     /**
	 * 	Update XmlRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XmlRecordString with another Field
	 *	@param value
	 */
   public void setXmlRecordString(Field source) {
       replace(source,0,source.length(),beginXmlRecordString,XML_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update XmlRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXmlRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXmlRecordString,XML_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update XmlRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXmlRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXmlRecordFieldLength() {
			return XML_RECORD_LENGTH;
		}

}
  
