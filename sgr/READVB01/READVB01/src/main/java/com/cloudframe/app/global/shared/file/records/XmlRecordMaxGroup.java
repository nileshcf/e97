package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMaxGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.shared.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecordMaxGroup")

public class XmlRecordMaxGroup extends XmlRecordMaxGroupSerialized  implements InitializingBean {
   
				@Autowired
    			@Qualifier("global_xmlRecordMax")    			
					private XmlRecordMax xmlRecordMax;
				@Autowired
    			@Qualifier("global_xmlRecordMin")    			
					private XmlRecordMin xmlRecordMin;
	
	/**
	* Constructor for XmlRecordMaxGroup
	**/
    public XmlRecordMaxGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			xmlRecordMax.setParent(this,getStartOffset() + 0);
	       			xmlRecordMin.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of xmlRecordMax
	 *	@return xmlRecordMax
	 */   
	 public XmlRecordMax getXmlRecordMax() {
   	return xmlRecordMax;
   }
   /**
	* 	Update XmlRecordMax with the passed value
	*   Corresponding COBOL Variable is XML-RECORD-MAX
	*	@param value
	*/
   public void setXmlRecordMax(char[] value) {
      xmlRecordMax.setString(value); 
   }   
    
     /**
	 * 	Update XmlRecordMax 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMax(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMax.begin,xmlRecordMax.length());
   }
   
     /**
	 * 	Update XmlRecordMax 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMax(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMax.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XmlRecordMax with another Field
	 *	@param value
	 */
   public void setXmlRecordMax(Field source) {
   	replace(source,0,source.length(),xmlRecordMax.begin,xmlRecordMax.length());
   }  
   
     /**
	 * 	Update XmlRecordMax 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMax(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMax.begin,xmlRecordMax.length());
   }
   
     /**
	 * 	Update XmlRecordMax 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMax(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMax.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xmlRecordMin
	 *	@return xmlRecordMin
	 */   
	 public XmlRecordMin getXmlRecordMin() {
   	return xmlRecordMin;
   }
   /**
	* 	Update XmlRecordMin with the passed value
	*   Corresponding COBOL Variable is XML-RECORD-MIN
	*	@param value
	*/
   public void setXmlRecordMin(char[] value) {
      xmlRecordMin.setString(value); 
   }   
    
     /**
	 * 	Update XmlRecordMin 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMin(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMin.begin,xmlRecordMin.length());
   }
   
     /**
	 * 	Update XmlRecordMin 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMin.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XmlRecordMin with another Field
	 *	@param value
	 */
   public void setXmlRecordMin(Field source) {
   	replace(source,0,source.length(),xmlRecordMin.begin,xmlRecordMin.length());
   }  
   
     /**
	 * 	Update XmlRecordMin 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMin(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMin.begin,xmlRecordMin.length());
   }
   
     /**
	 * 	Update XmlRecordMin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xmlRecordMin.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getXmlRecordMaxGroupFieldLength() {
			return XML_RECORD_MAX_GROUP_LENGTH;
		}

}
  
