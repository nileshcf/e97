package com.cloudframe.app.db2funci.dto;

/**
*  The class HostVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HostVariables extends HostVariablesSerialized {
   

						@Getter @Setter private char[] positionFoundSw = new char[1];

						@Getter @Setter private char[] priceLoadedTodaySw = new char[1];

						@Getter @Setter private char[] retailPositionSw = new char[1];

						@Getter @Setter private char[] alternatePriceSw = new char[1];

						@Getter @Setter private char[] activeOverrideSw = new char[1];

						@Getter @Setter private char[] rapAppCdAllowedSw = new char[1];

						@Getter @Setter private char[] remAppCdAllowedSw = new char[1];

						@Getter @Setter private char[] rtlAppCdAllowedSw = new char[1];
	
	/**
	* Constructor for HostVariables
	**/
    public HostVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPositionFoundSw(("N").toCharArray());
								setPriceLoadedTodaySw(("N").toCharArray());
								setRetailPositionSw(("N").toCharArray());
								setAlternatePriceSw(("N").toCharArray());
								setActiveOverrideSw(("N").toCharArray());
								setRapAppCdAllowedSw(("N").toCharArray());
								setRemAppCdAllowedSw(("N").toCharArray());
								setRtlAppCdAllowedSw(("N").toCharArray());
    }





}
  
