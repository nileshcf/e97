package com.cloudframe.app.callvp77.dto;

/**
*  The class Dt1SrtFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.callvp77.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtFixedArea extends Dt1SrtFixedAreaSerialized { 
   

								private int dt1SrtItemCnt;
				private Dt1SrtArray dt1SrtArray = new Dt1SrtArray();
	
	/**
	* Constructor for Dt1SrtFixedArea
	**/
    public Dt1SrtFixedArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1SrtFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dt1SrtArray.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of dt1SrtItemCnt
	 *	@return dt1SrtItemCnt
	 */
	public int getDt1SrtItemCnt() throws CFException {
       if (isDt1SrtItemCntModified()) { 
           dt1SrtItemCnt = refreshDt1SrtItemCnt();
        }
   		return dt1SrtItemCnt;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-ITEM-CNT
	 *	@param number
	 */
	public void setDt1SrtItemCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtItemCnt = checkDt1SrtItemCntMaxLimit(number); 
		serializeDt1SrtItemCnt(dt1SrtItemCnt);
	}
	

	public void setDt1SrtItemCnt(long number) {
	    number = checkDt1SrtItemCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtItemCnt((int)number);
	}
	
	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCnt(char[] value) throws CFException {
		 dt1SrtItemCnt = serializeDt1SrtItemCnt(value);
	}
	/**
	 * 	Update Dt1SrtItemCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCntString(char[] value) throws CFException {
		 setDt1SrtItemCnt(value);
	}
	/**
	 *	Returns the value of dt1SrtArray
	 *	@return dt1SrtArray
	 */   
	 public Dt1SrtArray getDt1SrtArray() {
   	return dt1SrtArray;
   }
   /**
	* 	Update Dt1SrtArray with the passed value
	*   Corresponding COBOL Variable is DT1-SRT-ARRAY
	*	@param value
	*/
   public void setDt1SrtArray(char[] value) {
      dt1SrtArray.setString(value); 
   }   
    
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin,dt1SrtArray.length());
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1SrtArray with another Field
	 *	@param value
	 */
   public void setDt1SrtArray(Field source) {
   	replace(source,0,source.length(),dt1SrtArray.begin,dt1SrtArray.length());
   }  
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin,dt1SrtArray.length());
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1SrtFixedAreaFieldLength() {
			return DT_1_SRT_FIXED_AREA_LENGTH;
		}

}
  
