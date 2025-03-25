package org.optum.uhg.rest.cics0012;

/**
 *  The class Dfhcommarea is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-11-20 at 23:12.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class Dfhcommarea {

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsApiRequestType = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsApiRequestKey = "";

    @Size(min = 0, max = 12)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsIsinKey = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsCountryCodeKey = "";

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsCurrencyCodeKey = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsIndustryKey = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String lsSectorKey = "";

    private short lsReturnCode;

    private long lsEibresp;

    private long lsEibresp2;

    private int lsOutputCount;

    @Size(min = 0, max = 400)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<LsOutputData> lsOutputData = new ArrayList<>();

    /*  End of Field declaration */
    /**
     * 	Returns the value of lsApiRequestType
     * 	@return lsApiRequestType
     */
    public String getLsApiRequestType() {
        return lsApiRequestType;
    }

    /**
     *  set variable lsApiRequestType
     *  @param value
     */
    public void setLsApiRequestType(String value) {
        lsApiRequestType = value.trim();
    }

    /**
     * 	Returns the value of lsApiRequestKey
     * 	@return lsApiRequestKey
     */
    public String getLsApiRequestKey() {
        return lsApiRequestKey;
    }

    /**
     *  set variable lsApiRequestKey
     *  @param value
     */
    public void setLsApiRequestKey(String value) {
        lsApiRequestKey = value.trim();
    }

    /**
     * 	Returns the value of lsIsinKey
     * 	@return lsIsinKey
     */
    public String getLsIsinKey() {
        return lsIsinKey;
    }

    /**
     *  set variable lsIsinKey
     *  @param value
     */
    public void setLsIsinKey(String value) {
        lsIsinKey = value.trim();
    }

    /**
     * 	Returns the value of lsCountryCodeKey
     * 	@return lsCountryCodeKey
     */
    public String getLsCountryCodeKey() {
        return lsCountryCodeKey;
    }

    /**
     *  set variable lsCountryCodeKey
     *  @param value
     */
    public void setLsCountryCodeKey(String value) {
        lsCountryCodeKey = value.trim();
    }

    /**
     * 	Returns the value of lsCurrencyCodeKey
     * 	@return lsCurrencyCodeKey
     */
    public String getLsCurrencyCodeKey() {
        return lsCurrencyCodeKey;
    }

    /**
     *  set variable lsCurrencyCodeKey
     *  @param value
     */
    public void setLsCurrencyCodeKey(String value) {
        lsCurrencyCodeKey = value.trim();
    }

    /**
     * 	Returns the value of lsIndustryKey
     * 	@return lsIndustryKey
     */
    public String getLsIndustryKey() {
        return lsIndustryKey;
    }

    /**
     *  set variable lsIndustryKey
     *  @param value
     */
    public void setLsIndustryKey(String value) {
        lsIndustryKey = value.trim();
    }

    /**
     * 	Returns the value of lsSectorKey
     * 	@return lsSectorKey
     */
    public String getLsSectorKey() {
        return lsSectorKey;
    }

    /**
     *  set variable lsSectorKey
     *  @param value
     */
    public void setLsSectorKey(String value) {
        lsSectorKey = value.trim();
    }

    /**
     * 	Returns the value of lsReturnCode
     * 	@return lsReturnCode
     */
    public short getLsReturnCode() {
        return lsReturnCode;
    }

    /**
     *  	Updates LsReturnCode with the value
     * 	@param number
     */
    public void setLsReturnCode(short number) {
        lsReturnCode = number;
    }

    /**
     * 	Returns the value of lsEibresp
     * 	@return lsEibresp
     */
    public long getLsEibresp() {
        return lsEibresp;
    }

    /**
     *  	Updates LsEibresp with the value
     * 	@param number
     */
    public void setLsEibresp(long number) {
        lsEibresp = number;
    }

    /**
     * 	Returns the value of lsEibresp2
     * 	@return lsEibresp2
     */
    public long getLsEibresp2() {
        return lsEibresp2;
    }

    /**
     *  	Updates LsEibresp2 with the value
     * 	@param number
     */
    public void setLsEibresp2(long number) {
        lsEibresp2 = number;
    }

    /**
     * 	Returns the value of lsOutputCount
     * 	@return lsOutputCount
     */
    public int getLsOutputCount() {
        return lsOutputCount;
    }

    /**
     *  	Updates LsOutputCount with the value
     * 	@param number
     */
    public void setLsOutputCount(int number) {
        lsOutputCount = number;
    }

    /**
     * 	Returns the  value of lsOutputData
     * 	@return lsOutputData
     */
    public List<LsOutputData> getLsOutputData() {
        return lsOutputData;
    }

    /**
     * 	Returns the element at the specified position in this list.
     *   @param index
     * 	@return lsOutputData
     */
    public LsOutputData getLsOutputData(int index) {
        return lsOutputData.get(index);
    }

    // *** setArrayGroup.txt starts
    /**
     * 	Update LsOutputData at index with the passed value
     *   @param index
     * 	@param value
     */
    @JsonIgnore
public void setLsOutputData(int index, org.optum.uhg.dto.cics0012.LsOutputData value) throws CFException {
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setIsin01(String.valueOf(value.getIsin01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setSedol01(String.valueOf(value.getSedol01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setRic01(String.valueOf(value.getRic01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setIntlkey01(String.valueOf(value.getIntlkey01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setCompany01(String.valueOf(value.getCompany01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setCountry01(String.valueOf(value.getCountry01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setCurrencycd01(String.valueOf(value.getCurrencycd01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setIndustry01(String.valueOf(value.getIndustry01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setSector01(String.valueOf(value.getSector01()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setFfmcapmilusd01(value.getFfmcapmilusd01());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        lsOutputData.get(index).setSectorweight01(String.valueOf(value.getSectorweight01()));
        // *** setArrayChild.txt ends
    }

    public void setLsOutputData(int index, LsOutputData value) {
        lsOutputData.set(index, value);
    }

    // *** setArrayGroup.txt ends
    @JsonIgnore
public void setDfhcommarea(org.optum.uhg.dto.cics0012.Dfhcommarea dfhcommarea) throws CFException {
        if (lsApiRequestType != null && !lsApiRequestType.isEmpty()) {
            dfhcommarea.setLsApiRequestType(lsApiRequestType.toCharArray());
        }
        if (lsApiRequestKey != null && !lsApiRequestKey.isEmpty()) {
            dfhcommarea.setLsApiRequestKey(lsApiRequestKey.toCharArray());
        }
        if (lsIsinKey != null && !lsIsinKey.isEmpty()) {
            dfhcommarea.setLsIsinKey(lsIsinKey.toCharArray());
        }
        if (lsCountryCodeKey != null && !lsCountryCodeKey.isEmpty()) {
            dfhcommarea.setLsCountryCodeKey(lsCountryCodeKey.toCharArray());
        }
        if (lsCurrencyCodeKey != null && !lsCurrencyCodeKey.isEmpty()) {
            dfhcommarea.setLsCurrencyCodeKey(lsCurrencyCodeKey.toCharArray());
        }
        if (lsIndustryKey != null && !lsIndustryKey.isEmpty()) {
            dfhcommarea.setLsIndustryKey(lsIndustryKey.toCharArray());
        }
        if (lsSectorKey != null && !lsSectorKey.isEmpty()) {
            dfhcommarea.setLsSectorKey(lsSectorKey.toCharArray());
        }
        dfhcommarea.setLsReturnCode(lsReturnCode);
        dfhcommarea.setLsEibresp(lsEibresp);
        dfhcommarea.setLsEibresp2(lsEibresp2);
        dfhcommarea.setLsOutputCount(lsOutputCount);
        for (int index = 0; index < lsOutputData.size(); index++) {
            lsOutputData.get(index).setLsOutputData(dfhcommarea.getLsOutputData(index));
        }
    }

    @JsonIgnore
public void populateFrom(org.optum.uhg.dto.cics0012.Dfhcommarea dfhcommarea) throws CFException {
        setLsApiRequestType(String.valueOf(dfhcommarea.getLsApiRequestType()));
        setLsApiRequestKey(String.valueOf(dfhcommarea.getLsApiRequestKey()));
        setLsIsinKey(String.valueOf(dfhcommarea.getLsIsinKey()));
        setLsCountryCodeKey(String.valueOf(dfhcommarea.getLsCountryCodeKey()));
        setLsCurrencyCodeKey(String.valueOf(dfhcommarea.getLsCurrencyCodeKey()));
        setLsIndustryKey(String.valueOf(dfhcommarea.getLsIndustryKey()));
        setLsSectorKey(String.valueOf(dfhcommarea.getLsSectorKey()));
        setLsReturnCode(dfhcommarea.getLsReturnCode());
        setLsEibresp(dfhcommarea.getLsEibresp());
        setLsEibresp2(dfhcommarea.getLsEibresp2());
        setLsOutputCount(dfhcommarea.getLsOutputCount());
        lsOutputData.clear();
        dfhcommarea.getLsOutputData().forEach(item -> {
            if (!CFUtil.trim(item.toCharArray()).isEmpty()) {
                LsOutputData lsOutputDataItem = new LsOutputData();
                try {
                    lsOutputDataItem.populateFrom(item);
                    lsOutputData.add(lsOutputDataItem);
                } catch (CFException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
