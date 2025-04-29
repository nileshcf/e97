package com.cloudframe.app.sf305120.dto;

/**
*  The class SvServiceTable282 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SvServiceTable282 extends SvServiceTable282Serialized { 
   

						private char[] svServiceId282 = new char[4];

								private int svServiceLnth282;

						private char[] svServiceStatus282 = new char[1];

						private char[] svElapsedTimeX282 = new char[6];
	
	/**
	* Constructor for SvServiceTable282
	**/
    public SvServiceTable282() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SvServiceTable282. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SvServiceTable282(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSvServiceId282(fillSpace(4));
								setSvServiceLnth282(0);
								setSvServiceStatus282(fillLowValue(1));
								setSvElapsedTimeX282(("000000").toCharArray());
    } 

	/**
	 *	Returns the value of svServiceId282
	 *	@return svServiceId282
	 */
   public char[] getSvServiceId282() throws CFException{
     if (isSvServiceId282Modified()) { 
        svServiceId282 = refreshSvServiceId282();
     }
   		return svServiceId282;
   }

  
	/**
	*  set variable svServiceId282
	*  Corresponding COBOL Variable is 282-SV-SERVICE-ID
	*  @param value
	**/
   public void setSvServiceId282(char[] value) {
      svServiceId282 = checkSvServiceId282Constraints(value);
      serializeSvServiceId282(svServiceId282);
   } 

     /**
	 * 	Update SvServiceId282 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvServiceId282(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvServiceId282,svServiceId282.length);
   	
   }
   
   public void setSvServiceId282(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceId282,svServiceId282.length);
   	
   }
   
     /**
	 * 	Update SvServiceId282 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvServiceId282(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceId282+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvServiceId282 with another Field
	 *	@param value
	 */
   public void setSvServiceId282(Field source) {
       replace(source,0,source.length(),beginSvServiceId282,SV_SERVICE_ID_282_LEN);
   	
   }  
   
     /**
	 * 	Update SvServiceId282 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvServiceId282(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvServiceId282,SV_SERVICE_ID_282_LEN);
   	
   }
   
     /**
	 * 	Update SvServiceId282 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvServiceId282(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceId282+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svServiceLnth282
	 *	@return svServiceLnth282
	 */
	public int getSvServiceLnth282() throws CFException {
       if (isSvServiceLnth282Modified()) { 
           svServiceLnth282 = refreshSvServiceLnth282();
        }
   		return svServiceLnth282;
	}
	

	
	   
	/**
	 * 	Update SvServiceLnth282 with the passed value
	 *  Corresponding COBOL Variable is 282-SV-SERVICE-LNTH
	 *	@param number
	 */
	public void setSvServiceLnth282(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    svServiceLnth282 = checkSvServiceLnth282MaxLimit(number); 
		serializeSvServiceLnth282(svServiceLnth282);
	}
	

	public void setSvServiceLnth282(long number) {
	    number = checkSvServiceLnth282MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvServiceLnth282((int)number);
	}
	
	/**
	 * 	Update SvServiceLnth282 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSvServiceLnth282(char[] value) throws CFException {
		 svServiceLnth282 = serializeSvServiceLnth282(value);
	}
	/**
	 * 	Update SvServiceLnth282 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSvServiceLnth282String(char[] value) throws CFException {
		 setSvServiceLnth282(value);
	}
	/**
	 *	Returns the value of svServiceStatus282
	 *	@return svServiceStatus282
	 */
   public char[] getSvServiceStatus282() throws CFException{
     if (isSvServiceStatus282Modified()) { 
        svServiceStatus282 = refreshSvServiceStatus282();
     }
   		return svServiceStatus282;
   }

  
	/**
	*  set variable svServiceStatus282
	*  Corresponding COBOL Variable is 282-SV-SERVICE-STATUS
	*  @param value
	**/
   public void setSvServiceStatus282(char[] value) {
      svServiceStatus282 = checkSvServiceStatus282Constraints(value);
      serializeSvServiceStatus282(svServiceStatus282);
   } 

     /**
	 * 	Update SvServiceStatus282 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvServiceStatus282(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvServiceStatus282,svServiceStatus282.length);
   	
   }
   
   public void setSvServiceStatus282(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceStatus282,svServiceStatus282.length);
   	
   }
   
     /**
	 * 	Update SvServiceStatus282 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvServiceStatus282(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceStatus282+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvServiceStatus282 with another Field
	 *	@param value
	 */
   public void setSvServiceStatus282(Field source) {
       replace(source,0,source.length(),beginSvServiceStatus282,SV_SERVICE_STATUS_282_LEN);
   	
   }  
   
     /**
	 * 	Update SvServiceStatus282 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvServiceStatus282(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvServiceStatus282,SV_SERVICE_STATUS_282_LEN);
   	
   }
   
     /**
	 * 	Update SvServiceStatus282 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvServiceStatus282(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvServiceStatus282+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svElapsedTimeX282
	 *	@return svElapsedTimeX282
	 */
   public char[] getSvElapsedTimeX282() throws CFException{
     if (isSvElapsedTimeX282Modified()) { 
        svElapsedTimeX282 = refreshSvElapsedTimeX282();
     }
   		return svElapsedTimeX282;
   }

  
	/**
	*  set variable svElapsedTimeX282
	*  Corresponding COBOL Variable is 282-SV-ELAPSED-TIME-X
	*  @param value
	**/
   public void setSvElapsedTimeX282(char[] value) {
      svElapsedTimeX282 = checkSvElapsedTimeX282Constraints(value);
      serializeSvElapsedTimeX282(svElapsedTimeX282);
   } 

     /**
	 * 	Update SvElapsedTimeX282 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvElapsedTimeX282(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvElapsedTimeX282,svElapsedTimeX282.length);
   	
   }
   
   public void setSvElapsedTimeX282(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvElapsedTimeX282,svElapsedTimeX282.length);
   	
   }
   
     /**
	 * 	Update SvElapsedTimeX282 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvElapsedTimeX282(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvElapsedTimeX282+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SvElapsedTimeX282 with another Field
	 *	@param value
	 */
   public void setSvElapsedTimeX282(Field source) {
       replace(source,0,source.length(),beginSvElapsedTimeX282,SV_ELAPSED_TIME_X_282_LEN);
   	
   }  
   
     /**
	 * 	Update SvElapsedTimeX282 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvElapsedTimeX282(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvElapsedTimeX282,SV_ELAPSED_TIME_X_282_LEN);
   	
   }
   
     /**
	 * 	Update SvElapsedTimeX282 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvElapsedTimeX282(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvElapsedTimeX282+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSvServiceTable282FieldLength() {
			return SV_SERVICE_TABLE_282_LENGTH;
		}

}
  
