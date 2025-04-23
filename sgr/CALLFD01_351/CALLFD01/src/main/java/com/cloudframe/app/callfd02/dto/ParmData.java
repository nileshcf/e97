package com.cloudframe.app.callfd02.dto;

/**
*  The class ParmData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.callfd02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ParmData extends ParmDataSerialized {
   

						private char[] parmMarker = Field.fillLowValue(8);
	
	/**
	* Constructor for ParmData
	**/
    public ParmData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmMarker
	 *	@return parmMarker
	 */
   public char[] getParmMarker() throws CFException{
     if (isParmMarkerModified()) { 
        parmMarker = refreshParmMarker();
     }
   		return parmMarker;
   }

  
	/**
	*  set variable parmMarker
	*  Corresponding COBOL Variable is LK-PARM-MARKER
	*  @param value
	**/
   public void setParmMarker(char[] value) {
      parmMarker = checkParmMarkerConstraints(value);
      serializeParmMarker(parmMarker);
   } 

     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmMarker,parmMarker.length);
   	
   }
   
   public void setParmMarker(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmMarker,parmMarker.length);
   	
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmMarker+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmMarker with another Field
	 *	@param value
	 */
   public void setParmMarker(Field source) {
       replace(source,0,source.length(),beginParmMarker,PARM_MARKER_LEN);
   	
   }  
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmMarker,PARM_MARKER_LEN);
   	
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmMarker+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmDataFieldLength() {
			return PARM_DATA_LENGTH;
		}

}
  
