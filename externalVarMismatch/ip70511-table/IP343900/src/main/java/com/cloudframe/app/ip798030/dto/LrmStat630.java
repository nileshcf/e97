package com.cloudframe.app.ip798030.dto;

/**
*  The class LrmStat630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class LrmStat630 extends LrmStat630Serialized {
   

						private char[] lrmStatValues630 = new char[330];
			private List<LrmStatTable630> lrmStatTable630 = new ArrayList<>();
    	
	
	/**
	* Constructor for LrmStat630
	**/
    public LrmStat630() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < LRM_STAT_TABLE_630_SIZE;arrayIndex++) {
						lrmStatTable630.add(new LrmStatTable630(this, beginLrmStatTable630 + 
						arrayIndex * LrmStatTable630.getLrmStatTable630FieldLength()));
				}
	   	/*  end of offset */
								setLrmStatValues630("LRM REQUEST CODE BAD                                              LRM JOB GROUP BAD                                                 LRM JOB NUMBER BAD                                                LRM SQL COUNT BAD                                                 LRM SQL NUMBER BAD                                                ".toCharArray());
    }


 

	/**
	 *	Returns the value of lrmStatValues630
	 *	@return lrmStatValues630
	 */
   public char[] getLrmStatValues630() throws CFException{
     if (isLrmStatValues630Modified()) { 
        lrmStatValues630 = refreshLrmStatValues630();
     }
   		return lrmStatValues630;
   }

  
	/**
	*  set variable lrmStatValues630
	*  Corresponding COBOL Variable is 630-LRM-STAT-VALUES
	*  @param value
	**/
   public void setLrmStatValues630(char[] value) {
      lrmStatValues630 = checkLrmStatValues630Constraints(value);
      serializeLrmStatValues630(lrmStatValues630);
   } 

     /**
	 * 	Update LrmStatValues630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLrmStatValues630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLrmStatValues630,lrmStatValues630.length);
   	
   }
   
   public void setLrmStatValues630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatValues630,lrmStatValues630.length);
   	
   }
   
     /**
	 * 	Update LrmStatValues630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLrmStatValues630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatValues630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LrmStatValues630 with another Field
	 *	@param value
	 */
   public void setLrmStatValues630(Field source) {
       replace(source,0,source.length(),beginLrmStatValues630,LRM_STAT_VALUES_630_LEN);
   	
   }  
   
     /**
	 * 	Update LrmStatValues630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLrmStatValues630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLrmStatValues630,LRM_STAT_VALUES_630_LEN);
   	
   }
   
     /**
	 * 	Update LrmStatValues630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLrmStatValues630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatValues630+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of lrmStatTable630
	 *  Corresponding COBOL Variable is 630-LRM-STAT-TABLE
	 *	@return lrmStatTable630
	 */
   public List<LrmStatTable630> getLrmStatTable630() {
       return lrmStatTable630;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return lrmStatTable630
	 */
	public LrmStatTable630 getLrmStatTable630(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getLrmStatTable630(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= LRM_STAT_TABLE_630_SIZE) {
             	index = LRM_STAT_TABLE_630_SIZE -1; // can't exceed max array size
             	logger.trace("lrmStatTable630 - Array index exceeded max Size {}, resetting it to max allowed",LRM_STAT_TABLE_630_SIZE); 
	    }
		if (index >= lrmStatTable630.size()) {
       		for (int fillIndex =  lrmStatTable630.size() -1; fillIndex < index;fillIndex++) {
		       lrmStatTable630.add(null);
		    }
			lrmStatTable630.set(index,
			   	   	new LrmStatTable630(this,beginLrmStatTable630 + index * LrmStatTable630.getLrmStatTable630FieldLength()) 
				                        ); 	
		} 
   	   LrmStatTable630 value = lrmStatTable630.get(index);
   	   if (value == null) {
   	      lrmStatTable630.set(index,
			   	   	new LrmStatTable630(this,beginLrmStatTable630 + index * LrmStatTable630.getLrmStatTable630FieldLength()) 
				                        ); 
		  value = lrmStatTable630.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update LrmStatTable630 at index with the passed value
	 *  Corresponding COBOL Variable is 630-LRM-STAT-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setLrmStatTable630(int index,char[] value) {
   	getLrmStatTable630(index).setString(value);
   }
   
	

	
	
	

		public static int getLrmStat630FieldLength() {
			return LRM_STAT_630_LENGTH;
		}

}
  
