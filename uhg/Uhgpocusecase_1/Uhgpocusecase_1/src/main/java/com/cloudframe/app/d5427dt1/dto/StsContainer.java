package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.d5427dt1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StsContainer extends StsContainerSerialized { 
   
				private StsFixedArea stsFixedArea = new StsFixedArea();
	
	/**
	* Constructor for StsContainer
	**/
    public StsContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			stsFixedArea.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of stsFixedArea
	 *	@return stsFixedArea
	 */   
	 public StsFixedArea getStsFixedArea() {
   	return stsFixedArea;
   }
   /**
	* 	Update StsFixedArea with the passed value
	*   Corresponding COBOL Variable is STS-FIXED-AREA
	*	@param value
	*/
   public void setStsFixedArea(char[] value) {
      stsFixedArea.setString(value); 
   }   
    
     /**
	 * 	Update StsFixedArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsFixedArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsFixedArea.begin,stsFixedArea.length());
   }
   
     /**
	 * 	Update StsFixedArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsFixedArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsFixedArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsFixedArea with another Field
	 *	@param value
	 */
   public void setStsFixedArea(Field source) {
   	replace(source,0,source.length(),stsFixedArea.begin,stsFixedArea.length());
   }  
   
     /**
	 * 	Update StsFixedArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsFixedArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsFixedArea.begin,stsFixedArea.length());
   }
   
     /**
	 * 	Update StsFixedArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsFixedArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsFixedArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getStsContainerFieldLength() {
			return STS_CONTAINER_LENGTH;
		}

}
  
