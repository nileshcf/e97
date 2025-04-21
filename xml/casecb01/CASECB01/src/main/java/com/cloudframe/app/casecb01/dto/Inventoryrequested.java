package com.cloudframe.app.casecb01.dto;

/**
*  The class Inventoryrequested is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


public class Inventoryrequested extends InventoryrequestedSerialized { 
   

						private char[] requestdate = Field.fillLowValue(10);
			private List<Dealers> dealers = new ArrayList<>();
    	

						private char[] requesttime = Field.fillLowValue(8);
	
	/**
	* Constructor for Inventoryrequested
	**/
    public Inventoryrequested() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Inventoryrequested. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Inventoryrequested(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < DEALERS_SIZE;arrayIndex++) {
						dealers.add(new Dealers(this, beginDealers + 
						arrayIndex * Dealers.getDealersFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < DEALERS_SIZE;arrayIndex++) {
					dealers.add(new Dealers(this, beginDealers + 
						arrayIndex * Dealers.getDealersFieldLength()));
			}
    } 

	/**
	 *	Returns the value of requestdate
	 *	@return requestdate
	 */
   public char[] getRequestdate() throws CFException{
     if (isRequestdateModified()) { 
        requestdate = refreshRequestdate();
     }
   		return requestdate;
   }

  
	/**
	*  set variable requestdate
	*  Corresponding COBOL Variable is REQUESTDATE
	*  @param value
	**/
   public void setRequestdate(char[] value) {
      requestdate = checkRequestdateConstraints(value);
      serializeRequestdate(requestdate);
   } 

     /**
	 * 	Update Requestdate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRequestdate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRequestdate,requestdate.length);
   	
   }
   
   public void setRequestdate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRequestdate,requestdate.length);
   	
   }
   
     /**
	 * 	Update Requestdate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRequestdate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequestdate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Requestdate with another Field
	 *	@param value
	 */
   public void setRequestdate(Field source) {
       replace(source,0,source.length(),beginRequestdate,REQUESTDATE_LEN);
   	
   }  
   
     /**
	 * 	Update Requestdate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRequestdate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRequestdate,REQUESTDATE_LEN);
   	
   }
   
     /**
	 * 	Update Requestdate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRequestdate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequestdate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of dealers
	 *  Corresponding COBOL Variable is DEALERS
	 *	@return dealers
	 */
   public List<Dealers> getDealers() {
       return dealers;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dealers
	 */
	public Dealers getDealers(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDealers(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DEALERS_SIZE) {
             	index = DEALERS_SIZE -1; // can't exceed max array size
             	logger.trace("dealers - Array index exceeded max Size {}, resetting it to max allowed",DEALERS_SIZE); 
	    }
		if (index >= dealers.size()) {
       		for (int fillIndex =  dealers.size() -1; fillIndex < index;fillIndex++) {
		       dealers.add(null);
		    }
			dealers.set(index,
			   	   	new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength()) 
				                        ); 	
		} 
   	   Dealers value = dealers.get(index);
   	   if (value == null) {
   	      dealers.set(index,
			   	   	new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength()) 
				                        ); 
		  value = dealers.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Dealers at index with the passed value
	 *  Corresponding COBOL Variable is DEALERS
	 *  @param index
	 *	@param value
	 */
  public void setDealers(int index,char[] value) {
   	getDealers(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of requesttime
	 *	@return requesttime
	 */
   public char[] getRequesttime() throws CFException{
     if (isRequesttimeModified()) { 
        requesttime = refreshRequesttime();
     }
   		return requesttime;
   }

  
	/**
	*  set variable requesttime
	*  Corresponding COBOL Variable is REQUESTTIME
	*  @param value
	**/
   public void setRequesttime(char[] value) {
      requesttime = checkRequesttimeConstraints(value);
      serializeRequesttime(requesttime);
   } 

     /**
	 * 	Update Requesttime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRequesttime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRequesttime,requesttime.length);
   	
   }
   
   public void setRequesttime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRequesttime,requesttime.length);
   	
   }
   
     /**
	 * 	Update Requesttime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRequesttime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequesttime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Requesttime with another Field
	 *	@param value
	 */
   public void setRequesttime(Field source) {
       replace(source,0,source.length(),beginRequesttime,REQUESTTIME_LEN);
   	
   }  
   
     /**
	 * 	Update Requesttime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRequesttime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRequesttime,REQUESTTIME_LEN);
   	
   }
   
     /**
	 * 	Update Requesttime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRequesttime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRequesttime+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Inventoryrequested
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRequestdate(CONSTANTS.SPACE_10);
     if (dealers.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  DEALERS_SIZE;index++) {
              Dealers  newElement = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
              newElement.initialize();
               dealers.add(newElement);
          }
     } else {
        if (dealers.size() < DEALERS_SIZE) {
          // prefill it first
          for (int index = dealers.size();index <  DEALERS_SIZE;index++) {
              Dealers  newElement = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
               dealers.add(newElement);
          }
        }
        
     	for (int index = 0;index <  DEALERS_SIZE;index++) {
     		Dealers dealersVar = dealers.get(index);
 			if (dealersVar == null) {
                dealersVar = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
                  dealers.set(index, dealersVar);
			} 
			dealersVar.initialize();
		}
     }
         setRequesttime(CONSTANTS.SPACE_8);
   }

	/**
	 *	Returns the xml format of Inventoryrequested
	 *	@return xml format of Inventoryrequested
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<InventoryRequested>");
					xmlContent.append("<RequestDate>").append(CFUtil.encodeXML(getRequestdate())).append("</RequestDate>");
				for (int index = 0;index < DEALERS_SIZE;index++) {
					xmlContent.append(getDealers(index).getXml());
				}
					xmlContent.append("<RequestTime>").append(CFUtil.encodeXML(getRequesttime())).append("</RequestTime>");
		xmlContent.append("</InventoryRequested>");
		return xmlContent.toString();
	}

		public static int getInventoryrequestedFieldLength() {
			return INVENTORYREQUESTED_LENGTH;
		}

}
  
