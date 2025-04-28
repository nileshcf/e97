package com.cloudframe.app.o529351u.rest;

/**
*  The class M51uLinkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class M51uLinkage { 	
   protected Logger logger = LoggerFactory.getLogger(M51uLinkage.class);

   /*  Child Field declaration */
                  private String uIcn51 = "";
                  private String uIoRequest51 = "";
                  private String uCauseCd51 = "";
                  private String uProvType51 = "";
                          private short uPlanVar51;
                  private String uPolicyNo51 = "";
				List<String> uDiagnosisCode51 = new ArrayList<>();
                  private String uIcdVerNbr51 = "";
                  private String uMedicalClaim51 = "";
                  private String uSourceInd51 = "";
                          private long uEarliestDos51;
                          private short uNbrOfLines51;
    	private List<ULineData51> uLineData51 = new ArrayList<>();
                  private String uCpeDescCd51 = "";
    	private List<UOutLineData51> uOutLineData51 = new ArrayList<>();
                  private String uStopAutoSw51 = "";
                  private String uOutCauseCd51 = "";
                          private short uSlotPlanVar51;
                  private String uSlotPolicyNo51 = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of uIcn51
	 *	@return uIcn51
	 */
   public String getUIcn51() {           
   		return uIcn51;
   }

  
	/**
	*  set variable uIcn51
	*  @param value
	**/
   public void setUIcn51(String value) {
	uIcn51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uIoRequest51
	 *	@return uIoRequest51
	 */
   public String getUIoRequest51() {           
   		return uIoRequest51;
   }

  
	/**
	*  set variable uIoRequest51
	*  @param value
	**/
   public void setUIoRequest51(String value) {
	uIoRequest51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uCauseCd51
	 *	@return uCauseCd51
	 */
   public String getUCauseCd51() {           
   		return uCauseCd51;
   }

  
	/**
	*  set variable uCauseCd51
	*  @param value
	**/
   public void setUCauseCd51(String value) {
	uCauseCd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uProvType51
	 *	@return uProvType51
	 */
   public String getUProvType51() {           
   		return uProvType51;
   }

  
	/**
	*  set variable uProvType51
	*  @param value
	**/
   public void setUProvType51(String value) {
	uProvType51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uPlanVar51
	 *	@return uPlanVar51
	 */
	public short getUPlanVar51() {               
   		return uPlanVar51;
	}
	
	/**
	 * 	Updates UPlanVar51 with the value
	 *	@param number
	 */
	public void setUPlanVar51(short number) {
	    uPlanVar51 = number; 
    }
	/**
	 *	Returns the value of uPolicyNo51
	 *	@return uPolicyNo51
	 */
   public String getUPolicyNo51() {           
   		return uPolicyNo51;
   }

  
	/**
	*  set variable uPolicyNo51
	*  @param value
	**/
   public void setUPolicyNo51(String value) {
	uPolicyNo51 = value.trim(); 
   }   
    /**
	 *	Returns the value of uDiagnosisCode51
	 *	@return uDiagnosisCode51
	 */
	public List<String> getUDiagnosisCode51() {
   		return uDiagnosisCode51;
	}

	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return uDiagnosisCode51
	 */
	public String getUDiagnosisCode51(int index) {
	      return uDiagnosisCode51.get(index);
    }
	

  
  	/**
	 *	Update UDiagnosisCode51 with the passed value at a given index
	 *  @param index
	 *	@param value
	 */
  public void setUDiagnosisCode51(List<String> value) {
   	uDiagnosisCode51 = value;
   }
   
   
 
	/**
	 *	Returns the value of uIcdVerNbr51
	 *	@return uIcdVerNbr51
	 */
   public String getUIcdVerNbr51() {           
   		return uIcdVerNbr51;
   }

  
	/**
	*  set variable uIcdVerNbr51
	*  @param value
	**/
   public void setUIcdVerNbr51(String value) {
	uIcdVerNbr51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uMedicalClaim51
	 *	@return uMedicalClaim51
	 */
   public String getUMedicalClaim51() {           
   		return uMedicalClaim51;
   }

  
	/**
	*  set variable uMedicalClaim51
	*  @param value
	**/
   public void setUMedicalClaim51(String value) {
	uMedicalClaim51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uSourceInd51
	 *	@return uSourceInd51
	 */
   public String getUSourceInd51() {           
   		return uSourceInd51;
   }

  
	/**
	*  set variable uSourceInd51
	*  @param value
	**/
   public void setUSourceInd51(String value) {
	uSourceInd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uEarliestDos51
	 *	@return uEarliestDos51
	 */
	public long getUEarliestDos51() {
   		return uEarliestDos51;
	} 
	/**
	 * 	Updates UEarliestDos51 with the value
	 *	@param number
	 */
	public void setUEarliestDos51(long number) {
	    uEarliestDos51 = number; 
    }
	public short getUNbrOfLines51() {         
   		return uNbrOfLines51;
	}
	
	/**
	 * 	Update UNbrOfLines51 with the passed value
	 *	@param number
	 */
	public void setUNbrOfLines51(short number) {
		uNbrOfLines51 = number;
	}	
	/**
	 *	Returns the  value of uLineData51
	 *	@return uLineData51
	 */
   public List<ULineData51> getULineData51() {
       return uLineData51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uLineData51
	 */
	public ULineData51 getULineData51(int index) {
   	   return uLineData51.get(index);

   }
//*** setArrayGroup.txt starts
  	/**
	 *	Update ULineData51 at index with the passed value
	 *  @param index
	 *	@param value
	 */
   @JsonIgnore
  public void setULineData51(int index,com.cloudframe.app.o529351u.dto.ULineData51 value) throws CFException{
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULinePos51(String.valueOf(value.getULinePos51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineServiceCode51(String.valueOf(value.getULineServiceCode51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineDosDate51(value.getULineDosDate51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineChargeAmt51(value.getULineChargeAmt51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineNotcovAmt51(value.getULineNotcovAmt51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineRemarkCd51(String.valueOf(value.getULineRemarkCd51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineAppUnits51(value.getULineAppUnits51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uLineData51.get(index).setULineDiagPointer51(String.valueOf(value.getULineDiagPointer51()));
         //*** setArrayChild.txt ends
   }
      
   public void setULineData51(int index,ULineData51 value) {
   	   uLineData51.set(index,value);
   }
   //*** setArrayGroup.txt ends
	
	/**
	 *	Returns the value of uCpeDescCd51
	 *	@return uCpeDescCd51
	 */
   public String getUCpeDescCd51() {           
   		return uCpeDescCd51;
   }

  
	/**
	*  set variable uCpeDescCd51
	*  @param value
	**/
   public void setUCpeDescCd51(String value) {
	uCpeDescCd51 = value.trim(); 
   }   
	/**
	 *	Returns the  value of uOutLineData51
	 *	@return uOutLineData51
	 */
   public List<UOutLineData51> getUOutLineData51() {
       return uOutLineData51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uOutLineData51
	 */
	public UOutLineData51 getUOutLineData51(int index) {
   	   return uOutLineData51.get(index);

   }
//*** setArrayGroup.txt starts
  	/**
	 *	Update UOutLineData51 at index with the passed value
	 *  @param index
	 *	@param value
	 */
   @JsonIgnore
  public void setUOutLineData51(int index,com.cloudframe.app.o529351u.dto.UOutLineData51 value) throws CFException{
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLinePos51(String.valueOf(value.getUOutLinePos51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineServiceCode51(String.valueOf(value.getUOutLineServiceCode51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineDosDate51(value.getUOutLineDosDate51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineChargeAmt51(value.getUOutLineChargeAmt51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineNotcovAmt51(value.getUOutLineNotcovAmt51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineRemarkCd51(String.valueOf(value.getUOutLineRemarkCd51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLinePlanVar51(value.getUOutLinePlanVar51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineCauseCd51(String.valueOf(value.getUOutLineCauseCd51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutLineAppUnits51(value.getUOutLineAppUnits51());
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutSpiTblId51(String.valueOf(value.getUOutSpiTblId51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutPosTierCd51(String.valueOf(value.getUOutPosTierCd51()));
         //*** setArrayChild.txt ends
         //*** setArrayChild.txt starts
      uOutLineData51.get(index).setUOutDiagElgInd51(String.valueOf(value.getUOutDiagElgInd51()));
         //*** setArrayChild.txt ends
   }
      
   public void setUOutLineData51(int index,UOutLineData51 value) {
   	   uOutLineData51.set(index,value);
   }
   //*** setArrayGroup.txt ends
	
	/**
	 *	Returns the value of uStopAutoSw51
	 *	@return uStopAutoSw51
	 */
   public String getUStopAutoSw51() {           
   		return uStopAutoSw51;
   }

  
	/**
	*  set variable uStopAutoSw51
	*  @param value
	**/
   public void setUStopAutoSw51(String value) {
	uStopAutoSw51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uOutCauseCd51
	 *	@return uOutCauseCd51
	 */
   public String getUOutCauseCd51() {           
   		return uOutCauseCd51;
   }

  
	/**
	*  set variable uOutCauseCd51
	*  @param value
	**/
   public void setUOutCauseCd51(String value) {
	uOutCauseCd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uSlotPlanVar51
	 *	@return uSlotPlanVar51
	 */
	public short getUSlotPlanVar51() {               
   		return uSlotPlanVar51;
	}
	
	/**
	 * 	Updates USlotPlanVar51 with the value
	 *	@param number
	 */
	public void setUSlotPlanVar51(short number) {
	    uSlotPlanVar51 = number; 
    }
	/**
	 *	Returns the value of uSlotPolicyNo51
	 *	@return uSlotPolicyNo51
	 */
   public String getUSlotPolicyNo51() {           
   		return uSlotPolicyNo51;
   }

  
	/**
	*  set variable uSlotPolicyNo51
	*  @param value
	**/
   public void setUSlotPolicyNo51(String value) {
	uSlotPolicyNo51 = value.trim(); 
   }   
 @JsonIgnore
 public void setM51uLinkage(com.cloudframe.app.o529351u.dto.M51uLinkage m51uLinkage)  throws CFException{
            if (uIcn51 != null && !uIcn51.isEmpty()) {
                m51uLinkage.setUIcn51(uIcn51.toCharArray());
            }
            if (uIoRequest51 != null && !uIoRequest51.isEmpty()) {
                m51uLinkage.setUIoRequest51(uIoRequest51.toCharArray());
            }
            if (uCauseCd51 != null && !uCauseCd51.isEmpty()) {
                m51uLinkage.setUCauseCd51(uCauseCd51.toCharArray());
            }
            if (uProvType51 != null && !uProvType51.isEmpty()) {
                m51uLinkage.setUProvType51(uProvType51.toCharArray());
            }
	m51uLinkage.setUPlanVar51(uPlanVar51);
            if (uPolicyNo51 != null && !uPolicyNo51.isEmpty()) {
                m51uLinkage.setUPolicyNo51(uPolicyNo51.toCharArray());
            }
		if (!uDiagnosisCode51.isEmpty()) {
			for(int index = 0 ; index < uDiagnosisCode51.size() ; index++) {
					m51uLinkage.setUDiagnosisCode51(index,uDiagnosisCode51.get(index).toCharArray());
			}
    	}
            if (uIcdVerNbr51 != null && !uIcdVerNbr51.isEmpty()) {
                m51uLinkage.setUIcdVerNbr51(uIcdVerNbr51.toCharArray());
            }
            if (uMedicalClaim51 != null && !uMedicalClaim51.isEmpty()) {
                m51uLinkage.setUMedicalClaim51(uMedicalClaim51.toCharArray());
            }
            if (uSourceInd51 != null && !uSourceInd51.isEmpty()) {
                m51uLinkage.setUSourceInd51(uSourceInd51.toCharArray());
            }
	m51uLinkage.setUEarliestDos51(uEarliestDos51);
	m51uLinkage.setUNbrOfLines51(uNbrOfLines51);
            for(int index = 0 ; index < uLineData51.size() ; index++){
                uLineData51.get(index).setULineData51(m51uLinkage.getULineData51(index));
            }
            if (uCpeDescCd51 != null && !uCpeDescCd51.isEmpty()) {
                m51uLinkage.setUCpeDescCd51(uCpeDescCd51.toCharArray());
            }
            for(int index = 0 ; index < uOutLineData51.size() ; index++){
                uOutLineData51.get(index).setUOutLineData51(m51uLinkage.getUOutLineData51(index));
            }
            if (uStopAutoSw51 != null && !uStopAutoSw51.isEmpty()) {
                m51uLinkage.setUStopAutoSw51(uStopAutoSw51.toCharArray());
            }
            if (uOutCauseCd51 != null && !uOutCauseCd51.isEmpty()) {
                m51uLinkage.setUOutCauseCd51(uOutCauseCd51.toCharArray());
            }
	m51uLinkage.setUSlotPlanVar51(uSlotPlanVar51);
            if (uSlotPolicyNo51 != null && !uSlotPolicyNo51.isEmpty()) {
                m51uLinkage.setUSlotPolicyNo51(uSlotPolicyNo51.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.M51uLinkage m51uLinkage)  throws CFException {
            setUIcn51(String.valueOf(m51uLinkage.getUIcn51()));
            setUIoRequest51(String.valueOf(m51uLinkage.getUIoRequest51()));
            setUCauseCd51(String.valueOf(m51uLinkage.getUCauseCd51()));
            setUProvType51(String.valueOf(m51uLinkage.getUProvType51()));
         setUPlanVar51(m51uLinkage.getUPlanVar51());
            setUPolicyNo51(String.valueOf(m51uLinkage.getUPolicyNo51()));
			uDiagnosisCode51.clear();					
            m51uLinkage.getUDiagnosisCode51().forEach( item ->{
                String val = CFUtil.trim(item);
                if (!val.isEmpty()){
                    uDiagnosisCode51.add(val);
                }
             });
            setUIcdVerNbr51(String.valueOf(m51uLinkage.getUIcdVerNbr51()));
            setUMedicalClaim51(String.valueOf(m51uLinkage.getUMedicalClaim51()));
            setUSourceInd51(String.valueOf(m51uLinkage.getUSourceInd51()));
         setUEarliestDos51(m51uLinkage.getUEarliestDos51());
         setUNbrOfLines51(m51uLinkage.getUNbrOfLines51());
                 uLineData51.clear();
                 m51uLinkage.getULineData51().forEach( item -> {
                 if(!CFUtil.trim(item.toCharArray()).isEmpty()) {
                     ULineData51 uLineData51Item = new ULineData51();
                     try {
                        uLineData51Item.populateFrom(item);
                        uLineData51.add(uLineData51Item);
                     } catch (CFException e) {
                        throw new RuntimeException(e);
                    }
				}
		     });
            setUCpeDescCd51(String.valueOf(m51uLinkage.getUCpeDescCd51()));
                 uOutLineData51.clear();
                 m51uLinkage.getUOutLineData51().forEach( item -> {
                 if(!CFUtil.trim(item.toCharArray()).isEmpty()) {
                     UOutLineData51 uOutLineData51Item = new UOutLineData51();
                     try {
                        uOutLineData51Item.populateFrom(item);
                        uOutLineData51.add(uOutLineData51Item);
                     } catch (CFException e) {
                        throw new RuntimeException(e);
                    }
				}
		     });
            setUStopAutoSw51(String.valueOf(m51uLinkage.getUStopAutoSw51()));
            setUOutCauseCd51(String.valueOf(m51uLinkage.getUOutCauseCd51()));
         setUSlotPlanVar51(m51uLinkage.getUSlotPlanVar51());
            setUSlotPolicyNo51(String.valueOf(m51uLinkage.getUSlotPolicyNo51()));
  }

}
  
