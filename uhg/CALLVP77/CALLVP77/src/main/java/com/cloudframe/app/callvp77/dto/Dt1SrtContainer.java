package com.cloudframe.app.callvp77.dto;

/**
*  The class Dt1SrtContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.callvp77.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtContainer extends Dt1SrtContainerSerialized {
   
				private Dt1SrtFixedArea dt1SrtFixedArea = new Dt1SrtFixedArea();
	
	/**
	* Constructor for Dt1SrtContainer
	**/
    public Dt1SrtContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dt1SrtFixedArea.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dt1SrtFixedArea
	 *	@return dt1SrtFixedArea
	 */   
	 public Dt1SrtFixedArea getDt1SrtFixedArea() {
   	return dt1SrtFixedArea;
   }
   /**
	* 	Update Dt1SrtFixedArea with the passed value
	*   Corresponding COBOL Variable is DT1-SRT-FIXED-AREA
	*	@param value
	*/
   public void setDt1SrtFixedArea(char[] value) {
      dt1SrtFixedArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtFixedArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtFixedArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1SrtFixedArea with another Field
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source) {
   	replace(source,0,source.length(),dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }  
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1SrtContainerFieldLength() {
			return DT_1_SRT_CONTAINER_LENGTH;
		}

}
  
