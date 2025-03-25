package org.optum.uhg.rest.cics0012;

/**
 *  The class LsOutputData is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-11-20 at 23:12.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class LsOutputData {

    protected Logger logger = LoggerFactory.getLogger(LsOutputData.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 12)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String isin01 = "";

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sedol01 = "";

    @Size(min = 0, max = 10)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ric01 = "";

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String intlkey01 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String company01 = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String country01 = "";

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String currencycd01 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String industry01 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sector01 = "";

    private int ffmcapmilusd01;

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sectorweight01 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of isin01
     * 	@return isin01
     */
    public String getIsin01() {
        return isin01;
    }

    /**
     *  set variable isin01
     *  @param value
     */
    public void setIsin01(String value) {
        isin01 = value.trim();
    }

    /**
     * 	Returns the value of sedol01
     * 	@return sedol01
     */
    public String getSedol01() {
        return sedol01;
    }

    /**
     *  set variable sedol01
     *  @param value
     */
    public void setSedol01(String value) {
        sedol01 = value.trim();
    }

    /**
     * 	Returns the value of ric01
     * 	@return ric01
     */
    public String getRic01() {
        return ric01;
    }

    /**
     *  set variable ric01
     *  @param value
     */
    public void setRic01(String value) {
        ric01 = value.trim();
    }

    /**
     * 	Returns the value of intlkey01
     * 	@return intlkey01
     */
    public String getIntlkey01() {
        return intlkey01;
    }

    /**
     *  set variable intlkey01
     *  @param value
     */
    public void setIntlkey01(String value) {
        intlkey01 = value.trim();
    }

    /**
     * 	Returns the value of company01
     * 	@return company01
     */
    public String getCompany01() {
        return company01;
    }

    /**
     *  set variable company01
     *  @param value
     */
    public void setCompany01(String value) {
        company01 = value.trim();
    }

    /**
     * 	Returns the value of country01
     * 	@return country01
     */
    public String getCountry01() {
        return country01;
    }

    /**
     *  set variable country01
     *  @param value
     */
    public void setCountry01(String value) {
        country01 = value.trim();
    }

    /**
     * 	Returns the value of currencycd01
     * 	@return currencycd01
     */
    public String getCurrencycd01() {
        return currencycd01;
    }

    /**
     *  set variable currencycd01
     *  @param value
     */
    public void setCurrencycd01(String value) {
        currencycd01 = value.trim();
    }

    /**
     * 	Returns the value of industry01
     * 	@return industry01
     */
    public String getIndustry01() {
        return industry01;
    }

    /**
     *  set variable industry01
     *  @param value
     */
    public void setIndustry01(String value) {
        industry01 = value.trim();
    }

    /**
     * 	Returns the value of sector01
     * 	@return sector01
     */
    public String getSector01() {
        return sector01;
    }

    /**
     *  set variable sector01
     *  @param value
     */
    public void setSector01(String value) {
        sector01 = value.trim();
    }

    /**
     * 	Returns the value of ffmcapmilusd01
     * 	@return ffmcapmilusd01
     */
    public int getFfmcapmilusd01() {
        return ffmcapmilusd01;
    }

    /**
     *  	Updates Ffmcapmilusd01 with the value
     * 	@param number
     */
    public void setFfmcapmilusd01(int number) {
        ffmcapmilusd01 = number;
    }

    /**
     * 	Returns the value of sectorweight01
     * 	@return sectorweight01
     */
    public String getSectorweight01() {
        return sectorweight01;
    }

    /**
     *  set variable sectorweight01
     *  @param value
     */
    public void setSectorweight01(String value) {
        sectorweight01 = value.trim();
    }

    @JsonIgnore
public void setLsOutputData(org.optum.uhg.dto.cics0012.LsOutputData lsOutputData) throws CFException {
        if (isin01 != null && !isin01.isEmpty()) {
            lsOutputData.setIsin01(isin01.toCharArray());
        }
        if (sedol01 != null && !sedol01.isEmpty()) {
            lsOutputData.setSedol01(sedol01.toCharArray());
        }
        if (ric01 != null && !ric01.isEmpty()) {
            lsOutputData.setRic01(ric01.toCharArray());
        }
        if (intlkey01 != null && !intlkey01.isEmpty()) {
            lsOutputData.setIntlkey01(intlkey01.toCharArray());
        }
        if (company01 != null && !company01.isEmpty()) {
            lsOutputData.setCompany01(company01.toCharArray());
        }
        if (country01 != null && !country01.isEmpty()) {
            lsOutputData.setCountry01(country01.toCharArray());
        }
        if (currencycd01 != null && !currencycd01.isEmpty()) {
            lsOutputData.setCurrencycd01(currencycd01.toCharArray());
        }
        if (industry01 != null && !industry01.isEmpty()) {
            lsOutputData.setIndustry01(industry01.toCharArray());
        }
        if (sector01 != null && !sector01.isEmpty()) {
            lsOutputData.setSector01(sector01.toCharArray());
        }
        lsOutputData.setFfmcapmilusd01(ffmcapmilusd01);
        if (sectorweight01 != null && !sectorweight01.isEmpty()) {
            lsOutputData.setSectorweight01(sectorweight01.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(org.optum.uhg.dto.cics0012.LsOutputData lsOutputData) throws CFException {
        setIsin01(String.valueOf(lsOutputData.getIsin01()));
        setSedol01(String.valueOf(lsOutputData.getSedol01()));
        setRic01(String.valueOf(lsOutputData.getRic01()));
        setIntlkey01(String.valueOf(lsOutputData.getIntlkey01()));
        setCompany01(String.valueOf(lsOutputData.getCompany01()));
        setCountry01(String.valueOf(lsOutputData.getCountry01()));
        setCurrencycd01(String.valueOf(lsOutputData.getCurrencycd01()));
        setIndustry01(String.valueOf(lsOutputData.getIndustry01()));
        setSector01(String.valueOf(lsOutputData.getSector01()));
        setFfmcapmilusd01(lsOutputData.getFfmcapmilusd01());
        setSectorweight01(String.valueOf(lsOutputData.getSectorweight01()));
    }
}
