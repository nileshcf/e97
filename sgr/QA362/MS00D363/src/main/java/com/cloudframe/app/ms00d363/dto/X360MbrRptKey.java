package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360MbrRptKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360MbrRptKey extends X360MbrRptKeySerialized { 
   

								private long x360MbrEndpoint;

								private long x360MbrEntIca;

								private long x360MbrMbrIca;

								private int x360MbrCutTime;

						private char[] x360MbrErlyDelFlag = Field.fillLowValue(1);

	
	/**
	* Constructor for X360MbrRptKey
	**/
    public X360MbrRptKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360MbrRptKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360MbrRptKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360MbrEndpoint
	 *	@return x360MbrEndpoint
	 */
	public long getX360MbrEndpoint() throws CFException {
       if (isX360MbrEndpointModified()) { 
           x360MbrEndpoint = refreshX360MbrEndpoint();
        }
   		return x360MbrEndpoint;
	}
	

	
	   
	/**
	 * 	Update X360MbrEndpoint with the passed value
	 *  Corresponding COBOL Variable is X360-MBR-ENDPOINT
	 *	@param number
	 */
	public void setX360MbrEndpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360MbrEndpoint = checkX360MbrEndpointMaxLimit(number); 
		serializeX360MbrEndpoint(x360MbrEndpoint);
	}
	

	/**
	 * 	Update X360MbrEndpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360MbrEndpoint(char[] value) throws CFException {
		 x360MbrEndpoint = serializeX360MbrEndpoint(value);
	}
	/**
	 * 	Update X360MbrEndpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360MbrEndpointString(char[] value) throws CFException {
		 setX360MbrEndpoint(value);
	}
	/**
	 *	Returns the value of x360MbrEntIca
	 *	@return x360MbrEntIca
	 */
	public long getX360MbrEntIca() throws CFException {
       if (isX360MbrEntIcaModified()) { 
           x360MbrEntIca = refreshX360MbrEntIca();
        }
   		return x360MbrEntIca;
	}
	

	
	   
	/**
	 * 	Update X360MbrEntIca with the passed value
	 *  Corresponding COBOL Variable is X360-MBR-ENT-ICA
	 *	@param number
	 */
	public void setX360MbrEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360MbrEntIca = checkX360MbrEntIcaMaxLimit(number); 
		serializeX360MbrEntIca(x360MbrEntIca);
	}
	

	/**
	 * 	Update X360MbrEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360MbrEntIca(char[] value) throws CFException {
		 x360MbrEntIca = serializeX360MbrEntIca(value);
	}
	/**
	 * 	Update X360MbrEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360MbrEntIcaString(char[] value) throws CFException {
		 setX360MbrEntIca(value);
	}
	/**
	 *	Returns the value of x360MbrMbrIca
	 *	@return x360MbrMbrIca
	 */
	public long getX360MbrMbrIca() throws CFException {
       if (isX360MbrMbrIcaModified()) { 
           x360MbrMbrIca = refreshX360MbrMbrIca();
        }
   		return x360MbrMbrIca;
	}
	

	
	   
	/**
	 * 	Update X360MbrMbrIca with the passed value
	 *  Corresponding COBOL Variable is X360-MBR-MBR-ICA
	 *	@param number
	 */
	public void setX360MbrMbrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360MbrMbrIca = checkX360MbrMbrIcaMaxLimit(number); 
		serializeX360MbrMbrIca(x360MbrMbrIca);
	}
	

	/**
	 * 	Update X360MbrMbrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360MbrMbrIca(char[] value) throws CFException {
		 x360MbrMbrIca = serializeX360MbrMbrIca(value);
	}
	/**
	 * 	Update X360MbrMbrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360MbrMbrIcaString(char[] value) throws CFException {
		 setX360MbrMbrIca(value);
	}
	/**
	 *	Returns the value of x360MbrCutTime
	 *	@return x360MbrCutTime
	 */
	public int getX360MbrCutTime() throws CFException {
       if (isX360MbrCutTimeModified()) { 
           x360MbrCutTime = refreshX360MbrCutTime();
        }
   		return x360MbrCutTime;
	}
	

	
	   
	/**
	 * 	Update X360MbrCutTime with the passed value
	 *  Corresponding COBOL Variable is X360-MBR-CUT-TIME
	 *	@param number
	 */
	public void setX360MbrCutTime(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360MbrCutTime = checkX360MbrCutTimeMaxLimit(number); 
		serializeX360MbrCutTime(x360MbrCutTime);
	}
	

	public void setX360MbrCutTime(long number) {
	    number = checkX360MbrCutTimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360MbrCutTime((int)number);
	}
	
	/**
	 * 	Update X360MbrCutTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360MbrCutTime(char[] value) throws CFException {
		 x360MbrCutTime = serializeX360MbrCutTime(value);
	}
	/**
	 * 	Update X360MbrCutTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360MbrCutTimeString(char[] value) throws CFException {
		 setX360MbrCutTime(value);
	}
	/**
	 *	Returns the value of x360MbrErlyDelFlag
	 *	@return x360MbrErlyDelFlag
	 */
   public char[] getX360MbrErlyDelFlag() throws CFException{
     if (isX360MbrErlyDelFlagModified()) { 
        x360MbrErlyDelFlag = refreshX360MbrErlyDelFlag();
     }
   		return x360MbrErlyDelFlag;
   }

  
	/**
	*  set variable x360MbrErlyDelFlag
	*  Corresponding COBOL Variable is X360-MBR-ERLY-DEL-FLAG
	*  @param value
	**/
   public void setX360MbrErlyDelFlag(char[] value) {
      x360MbrErlyDelFlag = checkX360MbrErlyDelFlagConstraints(value);
      serializeX360MbrErlyDelFlag(x360MbrErlyDelFlag);
   } 

     /**
	 * 	Update X360MbrErlyDelFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360MbrErlyDelFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360MbrErlyDelFlag,x360MbrErlyDelFlag.length);
   	
   }
   
   public void setX360MbrErlyDelFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360MbrErlyDelFlag,x360MbrErlyDelFlag.length);
   	
   }
   
     /**
	 * 	Update X360MbrErlyDelFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360MbrErlyDelFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360MbrErlyDelFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360MbrErlyDelFlag with another Field
	 *	@param value
	 */
   public void setX360MbrErlyDelFlag(Field source) {
       replace(source,0,source.length(),beginX360MbrErlyDelFlag,X_360_MBR_ERLY_DEL_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update X360MbrErlyDelFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360MbrErlyDelFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360MbrErlyDelFlag,X_360_MBR_ERLY_DEL_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update X360MbrErlyDelFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360MbrErlyDelFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360MbrErlyDelFlag+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360MbrRptKeyFieldLength() {
			return X_360_MBR_RPT_KEY_LENGTH;
		}

}
  
