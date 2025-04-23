package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplicationPdsDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ApplicationPdsDsn1000 extends ApplicationPdsDsn1000Serialized { 
   

						private char[] applicationPdsDd1000 = new char[8];

	
	/**
	* Constructor for ApplicationPdsDsn1000
	**/
    public ApplicationPdsDsn1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ApplicationPdsDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationPdsDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationPdsDd1000(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 8
             ,46
             );
    } 

	/**
	 *	Returns the value of applicationPdsDd1000
	 *	@return applicationPdsDd1000
	 */
   public char[] getApplicationPdsDd1000() throws CFException{
     if (isApplicationPdsDd1000Modified()) { 
        applicationPdsDd1000 = refreshApplicationPdsDd1000();
     }
   		return applicationPdsDd1000;
   }

  
	/**
	*  set variable applicationPdsDd1000
	*  Corresponding COBOL Variable is 1000-APPLICATION-PDS-DD
	*  @param value
	**/
   public void setApplicationPdsDd1000(char[] value) {
      applicationPdsDd1000 = checkApplicationPdsDd1000Constraints(value);
      serializeApplicationPdsDd1000(applicationPdsDd1000);
   } 

     /**
	 * 	Update ApplicationPdsDd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplicationPdsDd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplicationPdsDd1000,applicationPdsDd1000.length);
   	
   }
   
   public void setApplicationPdsDd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationPdsDd1000,applicationPdsDd1000.length);
   	
   }
   
     /**
	 * 	Update ApplicationPdsDd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationPdsDd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationPdsDd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplicationPdsDd1000 with another Field
	 *	@param value
	 */
   public void setApplicationPdsDd1000(Field source) {
       replace(source,0,source.length(),beginApplicationPdsDd1000,APPLICATION_PDS_DD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ApplicationPdsDd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplicationPdsDd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplicationPdsDd1000,APPLICATION_PDS_DD_1000_LEN);
   	
   }
   
     /**
	 * 	Update ApplicationPdsDd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationPdsDd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationPdsDd1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getApplicationPdsDsn1000FieldLength() {
			return APPLICATION_PDS_DSN_1000_LENGTH;
		}

}
  
