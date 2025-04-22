package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplicationDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ApplicationDsn1000 extends ApplicationDsn1000Serialized { 
   

						private char[] applicationDd1000 = new char[8];

	
	/**
	* Constructor for ApplicationDsn1000
	**/
    public ApplicationDsn1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ApplicationDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationDd1000(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 8
             ,36
             );
    } 

	/**
	 *	Returns the value of applicationDd1000
	 *	@return applicationDd1000
	 */
   public char[] getApplicationDd1000() throws CFException{
     if (isApplicationDd1000Modified()) { 
        applicationDd1000 = refreshApplicationDd1000();
     }
   		return applicationDd1000;
   }

  
	/**
	*  set variable applicationDd1000
	*  Corresponding COBOL Variable is 1000-APPLICATION-DD
	*  @param value
	**/
   public void setApplicationDd1000(char[] value) {
      applicationDd1000 = checkApplicationDd1000Constraints(value);
      serializeApplicationDd1000(applicationDd1000);
   } 

     /**
	 * 	Update ApplicationDd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplicationDd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplicationDd1000,applicationDd1000.length);
   	
   }
   
   public void setApplicationDd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationDd1000,applicationDd1000.length);
   	
   }
   
     /**
	 * 	Update ApplicationDd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationDd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationDd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplicationDd1000 with another Field
	 *	@param value
	 */
   public void setApplicationDd1000(Field source) {
       replace(source,0,source.length(),beginApplicationDd1000,APPLICATION_DD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ApplicationDd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplicationDd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplicationDd1000,APPLICATION_DD_1000_LEN);
   	
   }
   
     /**
	 * 	Update ApplicationDd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationDd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationDd1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getApplicationDsn1000FieldLength() {
			return APPLICATION_DSN_1000_LENGTH;
		}

}
  
