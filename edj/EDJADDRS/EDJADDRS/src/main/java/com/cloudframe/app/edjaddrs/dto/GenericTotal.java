package com.cloudframe.app.edjaddrs.dto;

/**
*  The class GenericTotal is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GenericTotal extends GenericTotalSerialized { 
   

						private char[] xy = Field.fillLowValue(20);

								private long numericTotal;

								private long snumericTotal;

								private long compTotal;

								private long scompTotal;

								private long comp3Total;

								private long scomp3Total;
	
	/**
	* Constructor for GenericTotal
	**/
    public GenericTotal() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of xy
	 *	@return xy
	 */
   public char[] getXy() throws CFException{
     if (isXyModified()) { 
        xy = refreshXy();
     }
   		return xy;
   }

  
	/**
	*  set variable xy
	*  Corresponding COBOL Variable is XY
	*  @param value
	**/
   public void setXy(char[] value) {
      xy = checkXyConstraints(value);
      serializeXy(xy);
   } 

     /**
	 * 	Update Xy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXy,xy.length);
   	
   }
   
   public void setXy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXy,xy.length);
   	
   }
   
     /**
	 * 	Update Xy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xy with another Field
	 *	@param value
	 */
   public void setXy(Field source) {
       replace(source,0,source.length(),beginXy,XY_LEN);
   	
   }  
   
     /**
	 * 	Update Xy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXy,XY_LEN);
   	
   }
   
     /**
	 * 	Update Xy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXy+targetIndex,targetLen);
    
   }
	public long getNumericTotal() throws CFException {
        if (isNumericTotalModified()) { 
           numericTotal = refreshNumericTotal();
        }
   		return numericTotal;
	}
	
	/**
	 * 	Update NumericTotal with the passed value
	 *  Corresponding COBOL Variable is NUMERIC-TOTAL
	 *	@param number
	 */
	public void setNumericTotal(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			numericTotal = checkNumericTotalMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeNumericTotal(numericTotal);
	}


	public long getSnumericTotal() throws CFException {
        if (isSnumericTotalModified()) { 
           snumericTotal = refreshSnumericTotal();
        }
   		return snumericTotal;
	}
	
	/**
	 * 	Update SnumericTotal with the passed value
	 *  Corresponding COBOL Variable is SNUMERIC-TOTAL
	 *	@param number
	 */
	public void setSnumericTotal(long number) {
			snumericTotal = checkSnumericTotalMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSnumericTotal(snumericTotal);
	}


	/**
	 *	Returns the value of compTotal
	 *	@return compTotal
	 */
	public long getCompTotal() throws CFException {
        if (isCompTotalModified()) { 
           compTotal = refreshCompTotal();
        }
   		return compTotal;
	}
	
	/**
	 * 	Update CompTotal with the passed value
	 *  Corresponding COBOL Variable is COMP-TOTAL
	 *	@param number
	 */
	public void setCompTotal(long number) {
	     // Truncate if the number is beyond +/- Max range
	    compTotal = checkCompTotalMaxLimit(number); 
		serializeCompTotal(compTotal);
	}


	/**
	 *	Returns the value of scompTotal
	 *	@return scompTotal
	 */
	public long getScompTotal() throws CFException {
        if (isScompTotalModified()) { 
           scompTotal = refreshScompTotal();
        }
   		return scompTotal;
	}
	
	/**
	 * 	Update ScompTotal with the passed value
	 *  Corresponding COBOL Variable is SCOMP-TOTAL
	 *	@param number
	 */
	public void setScompTotal(long number) {
	     // Truncate if the number is beyond +/- Max range
	    scompTotal = checkScompTotalMaxLimit(number); 
		serializeScompTotal(scompTotal);
	}


	public long getComp3Total() throws CFException {
        if (isComp3TotalModified()) { 
           comp3Total = refreshComp3Total();
        }
   		return comp3Total;
	}
	
	/**
	 * 	Update Comp3Total with the passed value
	 *  Corresponding COBOL Variable is COMP-3-TOTAL
	 *	@param number
	 */
	public void setComp3Total(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			comp3Total = checkComp3TotalMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeComp3Total(comp3Total);
	}


	public long getScomp3Total() throws CFException {
        if (isScomp3TotalModified()) { 
           scomp3Total = refreshScomp3Total();
        }
   		return scomp3Total;
	}
	
	/**
	 * 	Update Scomp3Total with the passed value
	 *  Corresponding COBOL Variable is SCOMP-3-TOTAL
	 *	@param number
	 */
	public void setScomp3Total(long number) {
			scomp3Total = checkScomp3TotalMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeScomp3Total(scomp3Total);
	}



	
	
	

		public static int getGenericTotalFieldLength() {
			return GENERIC_TOTAL_LENGTH;
		}

}
  
