package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail1705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Detail1705 extends Detail1705Serialized { 
   


						private char[] serviceName705 = new char[64];

	
	/**
	* Constructor for Detail1705
	**/
    public Detail1705() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Detail1705. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1705(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 0
             ,6
             );
								setServiceName705(pad(64," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 70
             ,8
             );
    } 

	/**
	 *	Returns the value of serviceName705
	 *	@return serviceName705
	 */
   public char[] getServiceName705() throws CFException{
     if (isServiceName705Modified()) { 
        serviceName705 = refreshServiceName705();
     }
   		return serviceName705;
   }

  
	/**
	*  set variable serviceName705
	*  Corresponding COBOL Variable is 705-SERVICE-NAME
	*  @param value
	**/
   public void setServiceName705(char[] value) {
      serviceName705 = checkServiceName705Constraints(value);
      serializeServiceName705(serviceName705);
   } 

     /**
	 * 	Update ServiceName705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceName705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginServiceName705,serviceName705.length);
   	
   }
   
   public void setServiceName705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName705,serviceName705.length);
   	
   }
   
     /**
	 * 	Update ServiceName705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceName705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ServiceName705 with another Field
	 *	@param value
	 */
   public void setServiceName705(Field source) {
       replace(source,0,source.length(),beginServiceName705,SERVICE_NAME_705_LEN);
   	
   }  
   
     /**
	 * 	Update ServiceName705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceName705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginServiceName705,SERVICE_NAME_705_LEN);
   	
   }
   
     /**
	 * 	Update ServiceName705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceName705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceName705+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetail1705FieldLength() {
			return DETAIL_1705_LENGTH;
		}

}
  
