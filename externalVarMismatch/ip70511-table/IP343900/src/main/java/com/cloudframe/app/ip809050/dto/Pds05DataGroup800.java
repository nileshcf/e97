package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds05DataGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Pds05DataGroup800 extends Pds05DataGroup800Serialized {
   

						private char[] pds05Data800 = new char[140];
			private List<Pds05800> pds05800 = new ArrayList<>();
    	
	
	/**
	* Constructor for Pds05DataGroup800
	**/
    public Pds05DataGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < PDS_05800_SIZE;arrayIndex++) {
						pds05800.add(new Pds05800(this, beginPds05800 + 
						arrayIndex * Pds05800.getPds05800FieldLength()));
				}
	   	/*  end of offset */
								setPds05Data800(fillHighValue(140));
    }


 

	/**
	 *	Returns the value of pds05Data800
	 *	@return pds05Data800
	 */
   public char[] getPds05Data800() throws CFException{
     if (isPds05Data800Modified()) { 
        pds05Data800 = refreshPds05Data800();
     }
   		return pds05Data800;
   }

  
	/**
	*  set variable pds05Data800
	*  Corresponding COBOL Variable is 800-PDS05-DATA
	*  @param value
	**/
   public void setPds05Data800(char[] value) {
      pds05Data800 = checkPds05Data800Constraints(value);
      serializePds05Data800(pds05Data800);
   } 

     /**
	 * 	Update Pds05Data800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds05Data800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds05Data800,pds05Data800.length);
   	
   }
   
   public void setPds05Data800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds05Data800,pds05Data800.length);
   	
   }
   
     /**
	 * 	Update Pds05Data800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds05Data800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds05Data800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds05Data800 with another Field
	 *	@param value
	 */
   public void setPds05Data800(Field source) {
       replace(source,0,source.length(),beginPds05Data800,PDS_05_DATA_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds05Data800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds05Data800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds05Data800,PDS_05_DATA_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds05Data800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds05Data800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds05Data800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of pds05800
	 *  Corresponding COBOL Variable is 800-PDS05
	 *	@return pds05800
	 */
   public List<Pds05800> getPds05800() {
       return pds05800;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return pds05800
	 */
	public Pds05800 getPds05800(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getPds05800(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PDS_05800_SIZE) {
             	index = PDS_05800_SIZE -1; // can't exceed max array size
             	logger.trace("pds05800 - Array index exceeded max Size {}, resetting it to max allowed",PDS_05800_SIZE); 
	    }
		if (index >= pds05800.size()) {
       		for (int fillIndex =  pds05800.size() -1; fillIndex < index;fillIndex++) {
		       pds05800.add(null);
		    }
			pds05800.set(index,
			   	   	new Pds05800(this,beginPds05800 + index * Pds05800.getPds05800FieldLength()) 
				                        ); 	
		} 
   	   Pds05800 value = pds05800.get(index);
   	   if (value == null) {
   	      pds05800.set(index,
			   	   	new Pds05800(this,beginPds05800 + index * Pds05800.getPds05800FieldLength()) 
				                        ); 
		  value = pds05800.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Pds05800 at index with the passed value
	 *  Corresponding COBOL Variable is 800-PDS05
	 *  @param index
	 *	@param value
	 */
  public void setPds05800(int index,char[] value) {
   	getPds05800(index).setString(value);
   }
   
	

	
	
	

		public static int getPds05DataGroup800FieldLength() {
			return PDS_05_DATA_GROUP_800_LENGTH;
		}

}
  
