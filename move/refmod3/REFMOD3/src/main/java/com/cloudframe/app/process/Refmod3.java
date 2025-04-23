  package com.cloudframe.app.process;
  /* 
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.refmod3.dto.AS25;
  import com.cloudframe.app.refmod3.dto.BS25;
  import com.cloudframe.app.refmod3.dto.AT27;
  import com.cloudframe.app.refmod3.dto.BT27;
  import com.cloudframe.app.refmod3.dto.AT28;
  import com.cloudframe.app.refmod3.dto.BT28;
  import com.cloudframe.app.refmod3.dto.AS29;
  import com.cloudframe.app.refmod3.dto.AT29;
  import com.cloudframe.app.refmod3.dto.BS29;
  import com.cloudframe.app.refmod3.dto.BT29;
  import com.cloudframe.app.refmod3.dto.AT210;
  import com.cloudframe.app.refmod3.dto.BT210;
  import com.cloudframe.app.refmod3.dto.AT211;
  import com.cloudframe.app.refmod3.dto.BT211;
  import com.cloudframe.app.refmod3.dto.AT212;
  import com.cloudframe.app.refmod3.dto.BT212;
  import com.cloudframe.app.refmod3.dto.AS213;
  import com.cloudframe.app.refmod3.dto.AT213;
  import com.cloudframe.app.refmod3.dto.BS213;
  import com.cloudframe.app.refmod3.dto.BT213;
  import com.cloudframe.app.refmod3.dto.AT214;
  import com.cloudframe.app.refmod3.dto.BT214;
  import com.cloudframe.app.refmod3.dto.AS215;
  import com.cloudframe.app.refmod3.dto.BS215;
  import com.cloudframe.app.refmod3.dto.AT217;
  import com.cloudframe.app.refmod3.dto.BT217;
  import com.cloudframe.app.refmod3.dto.AT218;
  import com.cloudframe.app.refmod3.dto.BT218;
  import com.cloudframe.app.refmod3.dto.AT219;
  import com.cloudframe.app.refmod3.dto.BT219;
  import com.cloudframe.app.refmod3.dto.AT220;
  import com.cloudframe.app.refmod3.dto.BT220;
  import com.cloudframe.app.refmod3.dto.Wse25aS;
  import com.cloudframe.app.refmod3.dto.Wse25bS;
  import com.cloudframe.app.refmod3.dto.Wse27aT;
  import com.cloudframe.app.refmod3.dto.Wse27bT;
  import com.cloudframe.app.refmod3.dto.Wse28aT;
  import com.cloudframe.app.refmod3.dto.Wse28bT;
  import com.cloudframe.app.refmod3.dto.Wse29aS;
  import com.cloudframe.app.refmod3.dto.Wse29aT;
  import com.cloudframe.app.refmod3.dto.Wse29bS;
  import com.cloudframe.app.refmod3.dto.Wse29bT;
  import com.cloudframe.app.refmod3.dto.Wse210aT;
  import com.cloudframe.app.refmod3.dto.Wse210bT;
  import com.cloudframe.app.refmod3.dto.Wse211aT;
  import com.cloudframe.app.refmod3.dto.Wse211bT;
  import com.cloudframe.app.refmod3.dto.Wse212aT;
  import com.cloudframe.app.refmod3.dto.Wse212bT;
  import com.cloudframe.app.refmod3.dto.Wse213aS;
  import com.cloudframe.app.refmod3.dto.Wse213aT;
  import com.cloudframe.app.refmod3.dto.Wse213bS;
  import com.cloudframe.app.refmod3.dto.Wse213bT;
  import com.cloudframe.app.refmod3.dto.Wse214aT;
  import com.cloudframe.app.refmod3.dto.Wse214bT;
  import com.cloudframe.app.refmod3.dto.Wse215aS;
  import com.cloudframe.app.refmod3.dto.Wse215bS;
  import com.cloudframe.app.refmod3.dto.Wse217aT;
  import com.cloudframe.app.refmod3.dto.Wse217bT;
  import com.cloudframe.app.refmod3.dto.Wse218aT;
  import com.cloudframe.app.refmod3.dto.Wse218bT;
  import com.cloudframe.app.refmod3.dto.Wse219aT;
  import com.cloudframe.app.refmod3.dto.Wse219bT;
  import com.cloudframe.app.refmod3.dto.Wse220aT;
  import com.cloudframe.app.refmod3.dto.Wse220bT;
  import com.cloudframe.app.refmod3.dto.Wse220cS;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.refmod3.dto.*;
  import com.cloudframe.app.refmod3.dto.AdRptDate7JulnGroup;
  import com.cloudframe.app.refmod3.dto.Wse217aS;
  import com.cloudframe.app.refmod3.dto.ATGrp220;
  import com.cloudframe.app.refmod3.dto.Wse25bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse217bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse24aT;
  import com.cloudframe.app.refmod3.dto.Wse215aT;
  import com.cloudframe.app.refmod3.dto.Wse25aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse26bT;
  import com.cloudframe.app.refmod3.dto.BS23;
  import com.cloudframe.app.refmod3.dto.Wse29bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse22bT;
  import com.cloudframe.app.refmod3.dto.ATGrp27;
  import com.cloudframe.app.refmod3.dto.BTGrp212;
  import com.cloudframe.app.refmod3.dto.Wse23aS;
  import com.cloudframe.app.refmod3.dto.Wse217bS;
  import com.cloudframe.app.refmod3.dto.Wse215bT;
  import com.cloudframe.app.refmod3.dto.ATGrp28;
  import com.cloudframe.app.refmod3.dto.AS211;
  import com.cloudframe.app.refmod3.dto.ATGrp214;
  import com.cloudframe.app.refmod3.dto.ASGrp216;
  import com.cloudframe.app.refmod3.dto.Wse220aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse21aT;
  import com.cloudframe.app.refmod3.dto.BS217;
  import com.cloudframe.app.refmod3.dto.Wse26aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse210aSGrp;
  import com.cloudframe.app.refmod3.dto.ASGrp29;
  import com.cloudframe.app.refmod3.dto.AT23;
  import com.cloudframe.app.refmod3.dto.BT24;
  import com.cloudframe.app.refmod3.dto.Wse219bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse27aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse211bTGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp27;
  import com.cloudframe.app.refmod3.dto.BTGrp217;
  import com.cloudframe.app.refmod3.dto.Wse212bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse26bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse218aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse29aSGrp;
  import com.cloudframe.app.refmod3.dto.ASGrp26;
  import com.cloudframe.app.refmod3.dto.Wse214aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse217aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse23bS;
  import com.cloudframe.app.refmod3.dto.Wse27bS;
  import com.cloudframe.app.refmod3.dto.Wse27bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse29bSGrp;
  import com.cloudframe.app.refmod3.dto.BS27;
  import com.cloudframe.app.refmod3.dto.BSGrp214;
  import com.cloudframe.app.refmod3.dto.Wse25aT;
  import com.cloudframe.app.refmod3.dto.BSGrp26;
  import com.cloudframe.app.refmod3.dto.Wse215bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse210bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse213aSGrp;
  import com.cloudframe.app.refmod3.dto.AT25;
  import com.cloudframe.app.refmod3.dto.AT216;
  import com.cloudframe.app.refmod3.dto.Wse211aS;
  import com.cloudframe.app.refmod3.dto.Wse216aT;
  import com.cloudframe.app.refmod3.dto.BTGrp211;
  import com.cloudframe.app.refmod3.dto.Wse21aS;
  import com.cloudframe.app.refmod3.dto.Wse24bT;
  import com.cloudframe.app.refmod3.dto.BT25;
  import com.cloudframe.app.refmod3.dto.Wse23aT;
  import com.cloudframe.app.refmod3.dto.AT24;
  import com.cloudframe.app.refmod3.dto.Wse219aTGrp;
  import com.cloudframe.app.refmod3.dto.BSGrp25;
  import com.cloudframe.app.refmod3.dto.AT22;
  import com.cloudframe.app.refmod3.dto.ATGrp217;
  import com.cloudframe.app.refmod3.dto.ASGrp213;
  import com.cloudframe.app.refmod3.dto.Wse211aTGrp;
  import com.cloudframe.app.refmod3.dto.BT215;
  import com.cloudframe.app.refmod3.dto.Wse219bS;
  import com.cloudframe.app.refmod3.dto.Wse214aTGrp;
  import com.cloudframe.app.refmod3.dto.AT26;
  import com.cloudframe.app.refmod3.dto.AS23;
  import com.cloudframe.app.refmod3.dto.Wse26aT;
  import com.cloudframe.app.refmod3.dto.AS217;
  import com.cloudframe.app.refmod3.dto.Wse216bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp218;
  import com.cloudframe.app.refmod3.dto.BT23;
  import com.cloudframe.app.refmod3.dto.Wse28bTGrp;
  import com.cloudframe.app.refmod3.dto.ASGrp215;
  import com.cloudframe.app.refmod3.dto.BSGrp215;
  import com.cloudframe.app.refmod3.dto.ASGrp210;
  import com.cloudframe.app.refmod3.dto.Wse216aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse210bTGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp29;
  import com.cloudframe.app.refmod3.dto.AT21;
  import com.cloudframe.app.refmod3.dto.Wse215aSGrp;
  import com.cloudframe.app.refmod3.dto.AT215;
  import com.cloudframe.app.refmod3.dto.Wse211bS;
  import com.cloudframe.app.refmod3.dto.Wse216bT;
  import com.cloudframe.app.refmod3.dto.BTGrp213;
  import com.cloudframe.app.refmod3.dto.BSGrp29;
  import com.cloudframe.app.refmod3.dto.Wse21bT;
  import com.cloudframe.app.refmod3.dto.Wse21bS;
  import com.cloudframe.app.refmod3.dto.Wse29aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse213aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse213bTGrp;
  import com.cloudframe.app.refmod3.dto.BT21;
  import com.cloudframe.app.refmod3.dto.ATGrp219;
  import com.cloudframe.app.refmod3.dto.BTGrp210;
  import com.cloudframe.app.refmod3.dto.BT216;
  import com.cloudframe.app.refmod3.dto.BTGrp214;
  import com.cloudframe.app.refmod3.dto.BSGrp216;
  import com.cloudframe.app.refmod3.dto.BT26;
  import com.cloudframe.app.refmod3.dto.Wse213bSGrp;
  import com.cloudframe.app.refmod3.dto.AS21;
  import com.cloudframe.app.refmod3.dto.Wse219aS;
  import com.cloudframe.app.refmod3.dto.ASGrp25;
  import com.cloudframe.app.refmod3.dto.ASGrp214;
  import com.cloudframe.app.refmod3.dto.ATGrp213;
  import com.cloudframe.app.refmod3.dto.BTGrp220;
  import com.cloudframe.app.refmod3.dto.BTGrp219;
  import com.cloudframe.app.refmod3.dto.Wse22aT;
  import com.cloudframe.app.refmod3.dto.ATGrp212;
  import com.cloudframe.app.refmod3.dto.Wse23bT;
  import com.cloudframe.app.refmod3.dto.Wse218bTGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp210;
  import com.cloudframe.app.refmod3.dto.Wse220bTGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp218;
  import com.cloudframe.app.refmod3.dto.BTGrp29;
  import com.cloudframe.app.refmod3.dto.Wse220cSGrp;
  import com.cloudframe.app.refmod3.dto.Wse212aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse28aTGrp;
  import com.cloudframe.app.refmod3.dto.BS219;
  import com.cloudframe.app.refmod3.dto.AS27;
  import com.cloudframe.app.refmod3.dto.AS219;
  import com.cloudframe.app.refmod3.dto.Wse25bT;
  import com.cloudframe.app.refmod3.dto.BSGrp213;
  import com.cloudframe.app.refmod3.dto.BS21;
  import com.cloudframe.app.refmod3.dto.Wse214bTGrp;
  import com.cloudframe.app.refmod3.dto.BT22;
  import com.cloudframe.app.refmod3.dto.Wse27aS;
  import com.cloudframe.app.refmod3.dto.BS211;
  import com.cloudframe.app.refmod3.dto.BTGrp28;
  import com.cloudframe.app.refmod3.dto.ATGrp211;
  import com.cloudframe.app.refmod3.dto.BSGrp210;
  import com.cloudframe.app.refmod3.dto.Wse214bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse210aTGrp;
  import com.cloudframe.app.refmod3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("refmod3")
  
  public class Refmod3 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Refmod3.class);
  
  private AdRptDate7JulnGroup adRptDate7JulnGroup = new AdRptDate7JulnGroup() ;
  private Wse217aS wse217aS = new Wse217aS() ;
  private ATGrp220 aTGrp220 = new ATGrp220() ;
  private Wse25bSGrp wse25bSGrp = new Wse25bSGrp() ;
  private Wse217bTGrp wse217bTGrp = new Wse217bTGrp() ;
  private Wse24aT wse24aT = new Wse24aT() ;
  private Wse215aT wse215aT = new Wse215aT() ;
  private Wse25aSGrp wse25aSGrp = new Wse25aSGrp() ;
  private Wse26bT wse26bT = new Wse26bT() ;
  private BS23 bS23 = new BS23() ;
  private Wse29bTGrp wse29bTGrp = new Wse29bTGrp() ;
  private Wse22bT wse22bT = new Wse22bT() ;
  private ATGrp27 aTGrp27 = new ATGrp27() ;
  private BTGrp212 bTGrp212 = new BTGrp212() ;
  private Wse23aS wse23aS = new Wse23aS() ;
  private Wse217bS wse217bS = new Wse217bS() ;
  private Wse215bT wse215bT = new Wse215bT() ;
  private ATGrp28 aTGrp28 = new ATGrp28() ;
  private AS211 aS211 = new AS211() ;
  private ATGrp214 aTGrp214 = new ATGrp214() ;
  private ASGrp216 aSGrp216 = new ASGrp216() ;
  private Wse220aTGrp wse220aTGrp = new Wse220aTGrp() ;
  private Wse21aT wse21aT = new Wse21aT() ;
  private BS217 bS217 = new BS217() ;
  private Wse26aSGrp wse26aSGrp = new Wse26aSGrp() ;
  private Wse210aSGrp wse210aSGrp = new Wse210aSGrp() ;
  private ASGrp29 aSGrp29 = new ASGrp29() ;
  private AT23 aT23 = new AT23() ;
  private BT24 bT24 = new BT24() ;
  private Wse219bTGrp wse219bTGrp = new Wse219bTGrp() ;
  private Wse27aTGrp wse27aTGrp = new Wse27aTGrp() ;
  private Wse211bTGrp wse211bTGrp = new Wse211bTGrp() ;
  private BTGrp27 bTGrp27 = new BTGrp27() ;
  private BTGrp217 bTGrp217 = new BTGrp217() ;
  private Wse212bTGrp wse212bTGrp = new Wse212bTGrp() ;
  private Wse26bSGrp wse26bSGrp = new Wse26bSGrp() ;
  private Wse218aTGrp wse218aTGrp = new Wse218aTGrp() ;
  private Wse29aSGrp wse29aSGrp = new Wse29aSGrp() ;
  private ASGrp26 aSGrp26 = new ASGrp26() ;
  private Wse214aSGrp wse214aSGrp = new Wse214aSGrp() ;
  private Wse217aTGrp wse217aTGrp = new Wse217aTGrp() ;
  private Wse23bS wse23bS = new Wse23bS() ;
  private Wse27bS wse27bS = new Wse27bS() ;
  private Wse27bTGrp wse27bTGrp = new Wse27bTGrp() ;
  private Wse29bSGrp wse29bSGrp = new Wse29bSGrp() ;
  private BS27 bS27 = new BS27() ;
  private BSGrp214 bSGrp214 = new BSGrp214() ;
  private Wse25aT wse25aT = new Wse25aT() ;
  private BSGrp26 bSGrp26 = new BSGrp26() ;
  private Wse215bSGrp wse215bSGrp = new Wse215bSGrp() ;
  private Wse210bSGrp wse210bSGrp = new Wse210bSGrp() ;
  private Wse213aSGrp wse213aSGrp = new Wse213aSGrp() ;
  private AT25 aT25 = new AT25() ;
  private AT216 aT216 = new AT216() ;
  private Wse211aS wse211aS = new Wse211aS() ;
  private Wse216aT wse216aT = new Wse216aT() ;
  private BTGrp211 bTGrp211 = new BTGrp211() ;
  private Wse21aS wse21aS = new Wse21aS() ;
  private Wse24bT wse24bT = new Wse24bT() ;
  private BT25 bT25 = new BT25() ;
  private Wse23aT wse23aT = new Wse23aT() ;
  private AT24 aT24 = new AT24() ;
  private Wse219aTGrp wse219aTGrp = new Wse219aTGrp() ;
  private BSGrp25 bSGrp25 = new BSGrp25() ;
  private AT22 aT22 = new AT22() ;
  private ATGrp217 aTGrp217 = new ATGrp217() ;
  private ASGrp213 aSGrp213 = new ASGrp213() ;
  private Wse211aTGrp wse211aTGrp = new Wse211aTGrp() ;
  private BT215 bT215 = new BT215() ;
  private Wse219bS wse219bS = new Wse219bS() ;
  private Wse214aTGrp wse214aTGrp = new Wse214aTGrp() ;
  private AT26 aT26 = new AT26() ;
  private AS23 aS23 = new AS23() ;
  private Wse26aT wse26aT = new Wse26aT() ;
  private AS217 aS217 = new AS217() ;
  private Wse216bSGrp wse216bSGrp = new Wse216bSGrp() ;
  private BTGrp218 bTGrp218 = new BTGrp218() ;
  private BT23 bT23 = new BT23() ;
  private Wse28bTGrp wse28bTGrp = new Wse28bTGrp() ;
  private ASGrp215 aSGrp215 = new ASGrp215() ;
  private BSGrp215 bSGrp215 = new BSGrp215() ;
  private ASGrp210 aSGrp210 = new ASGrp210() ;
  private Wse216aSGrp wse216aSGrp = new Wse216aSGrp() ;
  private Wse210bTGrp wse210bTGrp = new Wse210bTGrp() ;
  private ATGrp29 aTGrp29 = new ATGrp29() ;
  private AT21 aT21 = new AT21() ;
  private Wse215aSGrp wse215aSGrp = new Wse215aSGrp() ;
  private AT215 aT215 = new AT215() ;
  private Wse211bS wse211bS = new Wse211bS() ;
  private Wse216bT wse216bT = new Wse216bT() ;
  private BTGrp213 bTGrp213 = new BTGrp213() ;
  private BSGrp29 bSGrp29 = new BSGrp29() ;
  private Wse21bT wse21bT = new Wse21bT() ;
  private Wse21bS wse21bS = new Wse21bS() ;
  private Wse29aTGrp wse29aTGrp = new Wse29aTGrp() ;
  private Wse213aTGrp wse213aTGrp = new Wse213aTGrp() ;
  private Wse213bTGrp wse213bTGrp = new Wse213bTGrp() ;
  private BT21 bT21 = new BT21() ;
  private ATGrp219 aTGrp219 = new ATGrp219() ;
  private BTGrp210 bTGrp210 = new BTGrp210() ;
  private BT216 bT216 = new BT216() ;
  private BTGrp214 bTGrp214 = new BTGrp214() ;
  private BSGrp216 bSGrp216 = new BSGrp216() ;
  private BT26 bT26 = new BT26() ;
  private Wse213bSGrp wse213bSGrp = new Wse213bSGrp() ;
  private AS21 aS21 = new AS21() ;
  private Wse219aS wse219aS = new Wse219aS() ;
  private ASGrp25 aSGrp25 = new ASGrp25() ;
  private ASGrp214 aSGrp214 = new ASGrp214() ;
  private ATGrp213 aTGrp213 = new ATGrp213() ;
  private BTGrp220 bTGrp220 = new BTGrp220() ;
  private BTGrp219 bTGrp219 = new BTGrp219() ;
  private Wse22aT wse22aT = new Wse22aT() ;
  private ATGrp212 aTGrp212 = new ATGrp212() ;
  private Wse23bT wse23bT = new Wse23bT() ;
  private Wse218bTGrp wse218bTGrp = new Wse218bTGrp() ;
  private ATGrp210 aTGrp210 = new ATGrp210() ;
  private Wse220bTGrp wse220bTGrp = new Wse220bTGrp() ;
  private ATGrp218 aTGrp218 = new ATGrp218() ;
  private BTGrp29 bTGrp29 = new BTGrp29() ;
  private Wse220cSGrp wse220cSGrp = new Wse220cSGrp() ;
  private Wse212aTGrp wse212aTGrp = new Wse212aTGrp() ;
  private Wse28aTGrp wse28aTGrp = new Wse28aTGrp() ;
  private BS219 bS219 = new BS219() ;
  private AS27 aS27 = new AS27() ;
  private AS219 aS219 = new AS219() ;
  private Wse25bT wse25bT = new Wse25bT() ;
  private BSGrp213 bSGrp213 = new BSGrp213() ;
  private BS21 bS21 = new BS21() ;
  private Wse214bTGrp wse214bTGrp = new Wse214bTGrp() ;
  private BT22 bT22 = new BT22() ;
  private Wse27aS wse27aS = new Wse27aS() ;
  private BS211 bS211 = new BS211() ;
  private BTGrp28 bTGrp28 = new BTGrp28() ;
  private ATGrp211 aTGrp211 = new ATGrp211() ;
  private BSGrp210 bSGrp210 = new BSGrp210() ;
  private Wse214bSGrp wse214bSGrp = new Wse214bSGrp() ;
  private Wse210aTGrp wse210aTGrp = new Wse210aTGrp() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			 final int A_S_26_LENGTH = 70;
			 final int B_S_26_LENGTH = 70;
			 final int A_S_28_LENGTH = 70;
			 final int B_S_28_LENGTH = 70;
			 final int A_S_210_LENGTH = 70;
			 final int B_S_210_LENGTH = 70;
			 final int A_S_214_LENGTH = 70;
			 final int B_S_214_LENGTH = 70;
			 final int A_S_216_LENGTH = 70;
			 final int B_S_216_LENGTH = 70;
			 final int A_S_218_LENGTH = 70;
			 final int B_S_218_LENGTH = 70;
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			 final int WSE_26A_S_LENGTH = 60;
			 final int WSE_26B_S_LENGTH = 60;
			 final int WSE_28A_S_LENGTH = 60;
			 final int WSE_28B_S_LENGTH = 60;
			 final int WSE_210A_S_LENGTH = 60;
			 final int WSE_210B_S_LENGTH = 60;
			 final int WSE_214A_S_LENGTH = 60;
			 final int WSE_214B_S_LENGTH = 60;
			 final int WSE_216A_S_LENGTH = 60;
			 final int WSE_216B_S_LENGTH = 60;
			 final int WSE_218A_S_LENGTH = 60;
			 final int WSE_218B_S_LENGTH = 60;
			// End of variable declaration

       try {
       setCodePage("1047");
          ;
//  PERFORM MAINLINE
          mainline();/*MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *

// *
//  PERFORM MAINLINE-SPLIT0
          mainlineSplit0();/*MAINLINE-SPLIT0*/
//  PERFORM MAINLINE-SPLIT1
          mainlineSplit1();/*MAINLINE-SPLIT1*/
//  PERFORM MAINLINE-SPLIT2
          mainlineSplit2();/*MAINLINE-SPLIT2*/
//  PERFORM MAINLINE-SPLIT3
          mainlineSplit3();/*MAINLINE-SPLIT3*/
//  PERFORM MAINLINE-SPLIT4
          mainlineSplit4();/*MAINLINE-SPLIT4*/
//  PERFORM MAINLINE-SPLIT5
          mainlineSplit5();/*MAINLINE-SPLIT5*/
//  PERFORM MAINLINE-SPLIT6
          mainlineSplit6();/*MAINLINE-SPLIT6*/
//  PERFORM MAINLINE-SPLIT7
          mainlineSplit7();/*MAINLINE-SPLIT7*/
//  PERFORM MAINLINE-SPLIT8
          mainlineSplit8();/*MAINLINE-SPLIT8*/
//  PERFORM MAINLINE-SPLIT9
          mainlineSplit9();/*MAINLINE-SPLIT9*/
//  PERFORM MAINLINE-SPLIT10
          mainlineSplit10();/*MAINLINE-SPLIT10*/
//  PERFORM MAINLINE-SPLIT11
          mainlineSplit11();/*MAINLINE-SPLIT11*/
//  PERFORM MAINLINE-SPLIT12
          mainlineSplit12();/*MAINLINE-SPLIT12*/
//  PERFORM MAINLINE-SPLIT13
          mainlineSplit13();/*MAINLINE-SPLIT13*/
//  PERFORM MAINLINE-SPLIT14
          mainlineSplit14();/*MAINLINE-SPLIT14*/
//  PERFORM MAINLINE-SPLIT15
          mainlineSplit15();/*MAINLINE-SPLIT15*/
//  PERFORM MAINLINE-SPLIT16
          mainlineSplit16();/*MAINLINE-SPLIT16*/
//  PERFORM MAINLINE-SPLIT17
          mainlineSplit17();/*MAINLINE-SPLIT17*/
//  PERFORM MAINLINE-SPLIT18
          mainlineSplit18();/*MAINLINE-SPLIT18*/
//  PERFORM MAINLINE-SPLIT19
          mainlineSplit19();/*MAINLINE-SPLIT19*/
//  PERFORM MAINLINE-SPLIT20
          mainlineSplit20();/*MAINLINE-SPLIT20*/
//  PERFORM MAINLINE-SPLIT21
          mainlineSplit21();/*MAINLINE-SPLIT21*/
//  PERFORM MAINLINE-SPLIT22
          mainlineSplit22();/*MAINLINE-SPLIT22*/
//  PERFORM MAINLINE-SPLIT23
          mainlineSplit23();/*MAINLINE-SPLIT23*/
//  PERFORM MAINLINE-SPLIT24
          mainlineSplit24();/*MAINLINE-SPLIT24*/
//  PERFORM MAINLINE-SPLIT25
          mainlineSplit25();/*MAINLINE-SPLIT25*/
//  PERFORM MAINLINE-SPLIT26
          mainlineSplit26();/*MAINLINE-SPLIT26*/
//  PERFORM MAINLINE-SPLIT27
          mainlineSplit27();/*MAINLINE-SPLIT27*/
//  PERFORM MAINLINE-SPLIT28
          mainlineSplit28();/*MAINLINE-SPLIT28*/
//  PERFORM MAINLINE-SPLIT29
          mainlineSplit29();/*MAINLINE-SPLIT29*/
//  PERFORM MAINLINE-SPLIT30
          mainlineSplit30();/*MAINLINE-SPLIT30*/
//  PERFORM MAINLINE-SPLIT31
          mainlineSplit31();/*MAINLINE-SPLIT31*/
      
      }
      /**
      * mainlineSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - one                            COBOL Name: WS-ONE
      * - three                          COBOL Name: WS-THREE
      * - five                           COBOL Name: WS-FIVE
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      * - bSGrp25                        COBOL Name: WS-2-5B-S-GRP
      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      * - bSGrp26                        COBOL Name: WS-2-6B-S-GRP
      * - aTGrp27                        COBOL Name: WS-2-7A-T-GRP
      * - bTGrp27                        COBOL Name: WS-2-7B-T-GRP
      * - aTGrp28                        COBOL Name: WS-2-8A-T-GRP
      * - bTGrp28                        COBOL Name: WS-2-8B-T-GRP
      * - aSGrp29                        COBOL Name: WS-2-9A-S-GRP
      * - aTGrp29                        COBOL Name: WS-2-9A-T-GRP
      * - bSGrp29                        COBOL Name: WS-2-9B-S-GRP
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      * - aSGrp210                       COBOL Name: WS-2-10A-S-GRP
      * - aTGrp210                       COBOL Name: WS-2-10A-T-GRP
      * - bSGrp210                       COBOL Name: WS-2-10B-S-GRP
      * - bTGrp210                       COBOL Name: WS-2-10B-T-GRP
      * - aTGrp211                       COBOL Name: WS-2-11A-T-GRP
      * - bTGrp211                       COBOL Name: WS-2-11B-T-GRP
      * - aTGrp212                       COBOL Name: WS-2-12A-T-GRP
      * - bTGrp212                       COBOL Name: WS-2-12B-T-GRP
      * - aSGrp213                       COBOL Name: WS-2-13A-S-GRP
      * - aTGrp213                       COBOL Name: WS-2-13A-T-GRP
      * - bSGrp213                       COBOL Name: WS-2-13B-S-GRP
      * - bTGrp213                       COBOL Name: WS-2-13B-T-GRP
      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      * - bSGrp214                       COBOL Name: WS-2-14B-S-GRP
      * - bTGrp214                       COBOL Name: WS-2-14B-T-GRP
      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      * - bSGrp215                       COBOL Name: WS-2-15B-S-GRP
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      * - bSGrp216                       COBOL Name: WS-2-16B-S-GRP
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      * - bTGrp217                       COBOL Name: WS-2-17B-T-GRP
      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      * - bTGrp218                       COBOL Name: WS-2-18B-T-GRP
      * - aTGrp219                       COBOL Name: WS-2-19A-T-GRP
      * - bTGrp219                       COBOL Name: WS-2-19B-T-GRP
      * - aTGrp220                       COBOL Name: WS-2-20A-T-GRP
      * - bTGrp220                       COBOL Name: WS-2-20B-T-GRP
      * - wse25aSGrp                     COBOL Name: WSE-2-5A-S-GRP
      * - wse25bSGrp                     COBOL Name: WSE-2-5B-S-GRP
      * - wse26aSGrp                     COBOL Name: WSE-2-6A-S-GRP
      * - wse26bSGrp                     COBOL Name: WSE-2-6B-S-GRP
      * - wse27aTGrp                     COBOL Name: WSE-2-7A-T-GRP
      * - wse27bTGrp                     COBOL Name: WSE-2-7B-T-GRP
      * - wse28aTGrp                     COBOL Name: WSE-2-8A-T-GRP
      * - wse28bTGrp                     COBOL Name: WSE-2-8B-T-GRP
      * - wse29aSGrp                     COBOL Name: WSE-2-9A-S-GRP
      * - wse29aTGrp                     COBOL Name: WSE-2-9A-T-GRP
      * - wse29bSGrp                     COBOL Name: WSE-2-9B-S-GRP
      * - wse29bTGrp                     COBOL Name: WSE-2-9B-T-GRP
      * - wse210aSGrp                    COBOL Name: WSE-2-10A-S-GRP
      * - wse210aTGrp                    COBOL Name: WSE-2-10A-T-GRP
      * - wse210bSGrp                    COBOL Name: WSE-2-10B-S-GRP
      * - wse210bTGrp                    COBOL Name: WSE-2-10B-T-GRP
      * - wse211aTGrp                    COBOL Name: WSE-2-11A-T-GRP
      * - wse211bTGrp                    COBOL Name: WSE-2-11B-T-GRP
      * - wse212aTGrp                    COBOL Name: WSE-2-12A-T-GRP
      * - wse212bTGrp                    COBOL Name: WSE-2-12B-T-GRP
      * - wse213aSGrp                    COBOL Name: WSE-2-13A-S-GRP
      * - wse213aTGrp                    COBOL Name: WSE-2-13A-T-GRP
      * - wse213bSGrp                    COBOL Name: WSE-2-13B-S-GRP
      * - wse213bTGrp                    COBOL Name: WSE-2-13B-T-GRP
      * - wse214aSGrp                    COBOL Name: WSE-2-14A-S-GRP
      * - wse214aTGrp                    COBOL Name: WSE-2-14A-T-GRP
      * - wse214bSGrp                    COBOL Name: WSE-2-14B-S-GRP
      * - wse214bTGrp                    COBOL Name: WSE-2-14B-T-GRP
      * - wse215aSGrp                    COBOL Name: WSE-2-15A-S-GRP
      * - wse215bSGrp                    COBOL Name: WSE-2-15B-S-GRP
      * - wse216aSGrp                    COBOL Name: WSE-2-16A-S-GRP
      * - wse216bSGrp                    COBOL Name: WSE-2-16B-S-GRP
      * - wse217aTGrp                    COBOL Name: WSE-2-17A-T-GRP
      * - wse217bTGrp                    COBOL Name: WSE-2-17B-T-GRP
      * - wse218aTGrp                    COBOL Name: WSE-2-18A-T-GRP
      * - wse218bTGrp                    COBOL Name: WSE-2-18B-T-GRP
      * - wse219aTGrp                    COBOL Name: WSE-2-19A-T-GRP
      * - wse219bTGrp                    COBOL Name: WSE-2-19B-T-GRP
      * - wse220aTGrp                    COBOL Name: WSE-2-20A-T-GRP
      * - wse220bTGrp                    COBOL Name: WSE-2-20B-T-GRP
      * - aS21                           COBOL Name: WS-2-1A-S
      * - aT21                           COBOL Name: WS-2-1A-T
      * - aSFld121                       COBOL Name: WS-2-1A-S-FLD1
      * - aSFld221                       COBOL Name: WS-2-1A-S-FLD2
      * - aTFld121                       COBOL Name: WS-2-1A-T-FLD1
      * - aTFld221                       COBOL Name: WS-2-1A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit0() throws Exception {
          // MOVE 1 TO WS-ONE
          work.setOne(1);
          // MOVE 3 TO WS-THREE
          work.setThree(3);
          // MOVE 5 TO WS-FIVE
          work.setFive(5);

// *
//  MOVE ALL '*' TO WS-2-5A-S-GRP WS-2-5B-S-GRP WS-2-6A-S-GRP WS-2-6B-S-GRP WS-2-7A-T-GRP WS-2-7B-T-GRP WS-2-8A-T-GRP WS-2-8B-T-GRP WS-2-9A-S-GRP WS-2-9A-T-GRP WS-2-9B-S-GRP WS-2-9B-T-GRP WS-2-10A-S-GRP WS-2-10A-T-GRP WS-2-10B-S-GRP WS-2-10B-T-GRP WS-2-11A-T-GRP WS-2-11B-T-GRP WS-2-12A-T-GRP WS-2-12B-T-GRP WS-2-13A-S-GRP WS-2-13A-T-GRP WS-2-13B-S-GRP WS-2-13B-T-GRP WS-2-14A-S-GRP WS-2-14A-T-GRP WS-2-14B-S-GRP WS-2-14B-T-GRP WS-2-15A-S-GRP WS-2-15B-S-GRP WS-2-16A-S-GRP WS-2-16B-S-GRP WS-2-17A-T-GRP WS-2-17B-T-GRP WS-2-18A-T-GRP WS-2-18B-T-GRP WS-2-19A-T-GRP WS-2-19B-T-GRP WS-2-20A-T-GRP WS-2-20B-T-GRP
          aSGrp25.setString(CONSTANTS.LITERAL_897270192);
          bSGrp25.setString(CONSTANTS.LITERAL_897270192);
          aSGrp26.setString(CONSTANTS.LITERAL_897270192);
          bSGrp26.setString(CONSTANTS.LITERAL_897270192);
          aTGrp27.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp27.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp28.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp28.setString(CONSTANTS.LITERAL_1988861456);
          aSGrp29.setString(CONSTANTS.LITERAL_897270192);
          aTGrp29.setString(CONSTANTS.LITERAL_2022809837);
          bSGrp29.setString(CONSTANTS.LITERAL_897270192);
          bTGrp29.setString(CONSTANTS.LITERAL_1988861456);
          aSGrp210.setString(CONSTANTS.LITERAL_897270192);
          aTGrp210.setString(CONSTANTS.LITERAL_2022809837);
          bSGrp210.setString(CONSTANTS.LITERAL_897270192);
          bTGrp210.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp211.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp211.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp212.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp212.setString(CONSTANTS.LITERAL_1988861456);
          aSGrp213.setString(CONSTANTS.LITERAL_897270192);
          aTGrp213.setString(CONSTANTS.LITERAL_2022809837);
          bSGrp213.setString(CONSTANTS.LITERAL_897270192);
          bTGrp213.setString(CONSTANTS.LITERAL_1988861456);
          aSGrp214.setString(CONSTANTS.LITERAL_897270192);
          aTGrp214.setString(CONSTANTS.LITERAL_2022809837);
          bSGrp214.setString(CONSTANTS.LITERAL_897270192);
          bTGrp214.setString(CONSTANTS.LITERAL_1988861456);
          aSGrp215.setString(CONSTANTS.LITERAL_897270192);
          bSGrp215.setString(CONSTANTS.LITERAL_897270192);
          aSGrp216.setString(CONSTANTS.LITERAL_897270192);
          bSGrp216.setString(CONSTANTS.LITERAL_897270192);
          aTGrp217.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp217.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp218.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp218.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp219.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp219.setString(CONSTANTS.LITERAL_1988861456);
          aTGrp220.setString(CONSTANTS.LITERAL_2022809837);
          bTGrp220.setString(CONSTANTS.LITERAL_1988861456);
//  MOVE ALL '*' TO WSE-2-5A-S-GRP WSE-2-5B-S-GRP WSE-2-6A-S-GRP WSE-2-6B-S-GRP WSE-2-7A-T-GRP WSE-2-7B-T-GRP WSE-2-8A-T-GRP WSE-2-8B-T-GRP WSE-2-9A-S-GRP WSE-2-9A-T-GRP WSE-2-9B-S-GRP WSE-2-9B-T-GRP WSE-2-10A-S-GRP WSE-2-10A-T-GRP WSE-2-10B-S-GRP WSE-2-10B-T-GRP WSE-2-11A-T-GRP WSE-2-11B-T-GRP WSE-2-12A-T-GRP WSE-2-12B-T-GRP WSE-2-13A-S-GRP WSE-2-13A-T-GRP WSE-2-13B-S-GRP WSE-2-13B-T-GRP WSE-2-14A-S-GRP WSE-2-14A-T-GRP WSE-2-14B-S-GRP WSE-2-14B-T-GRP WSE-2-15A-S-GRP WSE-2-15B-S-GRP WSE-2-16A-S-GRP WSE-2-16B-S-GRP WSE-2-17A-T-GRP WSE-2-17B-T-GRP WSE-2-18A-T-GRP WSE-2-18B-T-GRP WSE-2-19A-T-GRP WSE-2-19B-T-GRP WSE-2-20A-T-GRP WSE-2-20B-T-GRP
          wse25aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse25bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse26aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse26bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse27aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse27bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse28aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse28bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse29aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse29aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse29bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse29bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse210aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse210aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse210bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse210bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse211aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse211bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse212aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse212bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse213aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse213aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse213bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse213bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse214aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse214aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse214bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse214bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse215aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse215bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse216aSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse216bSGrp.setString(CONSTANTS.LITERAL_885954065);
          wse217aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse217bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse218aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse218bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse219aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse219bTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse220aTGrp.setString(CONSTANTS.LITERAL_2022809837);
          wse220bTGrp.setString(CONSTANTS.LITERAL_2022809837);

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          aS21.initialize();
          aT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          aS21.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          aS21.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-1A-S ( WS-ONE : LENGTH OF WS-2-1A-S ) TO WS-2-1A-T ( WS-ONE : LENGTH OF WS-2-1A-T )
          aT21.replace(aS21,(work.getOne()-1),AS21.getAS21FieldLength(),(work.getOne()-1),AT21.getAT21FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  1* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("*  1* WS-2-1A-S        = ({})", aS21.toString()); 
//  DISPLAY '*  2*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("*  2*   WS-2-1A-S-FLD1 = ({})", new String(aS21.getASFld121())); 
//  DISPLAY '*  3*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("*  3*   WS-2-1A-S-FLD2 = ({})", new String(aS21.getASFld221())); 
//  DISPLAY '*  4* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("*  4* WS-2-1A-T        = ({})", aT21.toString()); 
//  DISPLAY '*  5*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("*  5*   WS-2-1A-T-FLD1 = ({})", new String(aT21.getATFld121())); 
//  DISPLAY '*  6*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("*  6*   WS-2-1A-T-FLD2 = ({})", new String(aT21.getATFld221())); 

// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          aS21.initialize();
          aT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          aS21.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          aS21.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          work.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          work.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-1A-T ( WS-ONE : WS-2-T-LEN )
          aT21.replace(aS21,(work.getOne()-1),work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  7* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("*  7* WS-2-1A-S        = ({})", aS21.toString()); 
//  DISPLAY '*  8*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("*  8*   WS-2-1A-S-FLD1 = ({})", new String(aS21.getASFld121())); 
//  DISPLAY '*  9*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("*  9*   WS-2-1A-S-FLD2 = ({})", new String(aS21.getASFld221())); 
//  DISPLAY '* 10* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 10* WS-2-1A-T        = ({})", aT21.toString()); 
//  DISPLAY '* 11*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 11*   WS-2-1A-T-FLD1 = ({})", new String(aT21.getATFld121())); 
//  DISPLAY '* 12*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("* 12*   WS-2-1A-T-FLD2 = ({})", new String(aT21.getATFld221())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          bS21.initialize();
          bT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          bS21.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          bS21.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          bT21.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-1B-S ( WS-ONE : LENGTH OF WS-2-1B-S ) TO WS-2-1B-T ( WS-ONE : LENGTH OF WS-2-1B-T )
          bT21.replace(bS21,(work.getOne()-1),BS21.getBS21FieldLength(),(work.getOne()-1),BT21.getBT21FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 13* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("* 13* WS-2-1B-S        = ({})", bS21.toString()); 
//  DISPLAY '* 14*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("* 14*   WS-2-1B-S-FLD1 = ({})", new String(bS21.getBSFld121())); 
//  DISPLAY '* 15*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("* 15*   WS-2-1B-S-FLD2 = ({})", new String(bS21.getBSFld221())); 
//  DISPLAY '* 16* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("* 16* WS-2-1B-T        = ({})", bT21.toString()); 
//  DISPLAY '* 17*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("* 17*   WS-2-1B-T-FLD1 = ({})", new String(bT21.getBTFld121())); 
//  DISPLAY '* 18*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("* 18*   WS-2-1B-T-FLD2 = ({})", new String(bT21.getBTFld221())); 
//  DISPLAY '* 19*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("* 19*   WS-2-1B-T-FLD3 = ({})", new String(bT21.getBTFld321())); 

// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          bS21.initialize();
          bT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          bS21.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          bS21.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          bT21.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-1B-S TO WS-2-S-LEN
          work.setSLen2((short) BS21.getBS21FieldLength());
//  MOVE LENGTH OF WS-2-1B-T TO WS-2-T-LEN
          work.setTLen2((short) BT21.getBT21FieldLength());
//  MOVE WS-2-1B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-1B-T ( WS-ONE : WS-2-T-LEN )
          bT21.replace(bS21,(work.getOne()-1),work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 20* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("* 20* WS-2-1B-S        = ({})", bS21.toString()); 
//  DISPLAY '* 21*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("* 21*   WS-2-1B-S-FLD1 = ({})", new String(bS21.getBSFld121())); 
//  DISPLAY '* 22*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("* 22*   WS-2-1B-S-FLD2 = ({})", new String(bS21.getBSFld221())); 
//  DISPLAY '* 23* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("* 23* WS-2-1B-T        = ({})", bT21.toString()); 
//  DISPLAY '* 24*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("* 24*   WS-2-1B-T-FLD1 = ({})", new String(bT21.getBTFld121())); 
      
      }
      /**
      * mainlineSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      *
      * Output :  

      * - aS22                           COBOL Name: WS-2-2A-S
      * - aT22                           COBOL Name: WS-2-2A-T
      * - aTFld122                       COBOL Name: WS-2-2A-T-FLD1
      * - aTFld222                       COBOL Name: WS-2-2A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS22                           COBOL Name: WS-2-2B-S
      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      * - aS23                           COBOL Name: WS-2-3A-S
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit1() throws Exception {
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			// End of variable declaration

//  DISPLAY '* 25*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("* 25*   WS-2-1B-T-FLD2 = ({})", new String(bT21.getBTFld221())); 
//  DISPLAY '* 26*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("* 26*   WS-2-1B-T-FLD3 = ({})", new String(bT21.getBTFld321())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          work.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          work.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-2A-S ( WS-ONE : LENGTH OF WS-2-2A-S ) TO WS-2-2A-T ( WS-ONE : LENGTH OF WS-2-2A-T )
          aT22.replace(work.getAS22(),(work.getOne()-1)/* aS22 */ ,A_S_22_LENGTH,(work.getOne()-1),AT22.getAT22FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 27* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("* 27* WS-2-2A-S        = ({})", new String(work.getAS22())); 
//  DISPLAY '* 28* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("* 28* WS-2-2A-T        = ({})", aT22.toString()); 
//  DISPLAY '* 29*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("* 29*   WS-2-2A-T-FLD1 = ({})", new String(aT22.getATFld122())); 
//  DISPLAY '* 30*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("* 30*   WS-2-2A-T-FLD2 = ({})", new String(aT22.getATFld222())); 

// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          work.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          work.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-2A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2A-T TO WS-2-T-LEN
          work.setTLen2((short) AT22.getAT22FieldLength());
//  MOVE WS-2-2A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-2A-T ( WS-ONE : WS-2-T-LEN )
          aT22.replace(work.getAS22(),(work.getOne()-1)/* aS22 */ ,work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 31* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("* 31* WS-2-2A-S        = ({})", new String(work.getAS22())); 
//  DISPLAY '* 32* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("* 32* WS-2-2A-T        = ({})", aT22.toString()); 
//  DISPLAY '* 33*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("* 33*   WS-2-2A-T-FLD1 = ({})", new String(aT22.getATFld122())); 
//  DISPLAY '* 34*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("* 34*   WS-2-2A-T-FLD2 = ({})", new String(aT22.getATFld222())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          work.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          work.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          bT22.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-2B-S ( WS-ONE : LENGTH OF WS-2-2B-S ) TO WS-2-2B-T ( WS-ONE : LENGTH OF WS-2-2B-T )
          bT22.replace(work.getBS22(),(work.getOne()-1)/* bS22 */ ,B_S_22_LENGTH,(work.getOne()-1),BT22.getBT22FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 35* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("* 35* WS-2-2B-S        = ({})", new String(work.getBS22())); 
//  DISPLAY '* 36* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("* 36* WS-2-2B-T        = ({})", bT22.toString()); 
//  DISPLAY '* 37*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("* 37*   WS-2-2B-T-FLD1 = ({})", new String(bT22.getBTFld122())); 
//  DISPLAY '* 38*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("* 38*   WS-2-2B-T-FLD2 = ({})", new String(bT22.getBTFld222())); 
//  DISPLAY '* 39*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("* 39*   WS-2-2B-T-FLD3 = ({})", new String(bT22.getBTFld322())); 

// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          work.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          work.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          bT22.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-2B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2B-T TO WS-2-T-LEN
          work.setTLen2((short) BT22.getBT22FieldLength());
//  MOVE WS-2-2B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-2B-T ( WS-ONE : WS-2-T-LEN )
          bT22.replace(work.getBS22(),(work.getOne()-1)/* bS22 */ ,work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 40* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("* 40* WS-2-2B-S        = ({})", new String(work.getBS22())); 
//  DISPLAY '* 41* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("* 41* WS-2-2B-T        = ({})", bT22.toString()); 
//  DISPLAY '* 42*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("* 42*   WS-2-2B-T-FLD1 = ({})", new String(bT22.getBTFld122())); 
//  DISPLAY '* 43*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("* 43*   WS-2-2B-T-FLD2 = ({})", new String(bT22.getBTFld222())); 
//  DISPLAY '* 44*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("* 44*   WS-2-2B-T-FLD3 = ({})", new String(bT22.getBTFld322())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          aS23.initialize();
          aT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          aS23.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          aS23.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-ONE : LENGTH OF WS-2-3A-T )
          aT23.replace(aS23.getCharArray(),0,aS23.length(),(work.getOne()-1),AT23.getAT23FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 45* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("* 45* WS-2-3A-S        = ({})", aS23.toString()); 
//  DISPLAY '* 46*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("* 46*   WS-2-3A-S-FLD1 = ({})", new String(aS23.getASFld123())); 
//  DISPLAY '* 47*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("* 47*   WS-2-3A-S-FLD2 = ({})", new String(aS23.getASFld223())); 
//  DISPLAY '* 48* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("* 48* WS-2-3A-T        = ({})", aT23.toString()); 
//  DISPLAY '* 49*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("* 49*   WS-2-3A-T-FLD1 = ({})", new String(aT23.getATFld123())); 
//  DISPLAY '* 50*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("* 50*   WS-2-3A-T-FLD2 = ({})", new String(aT23.getATFld223())); 

// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          aS23.initialize();
          aT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          aS23.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          aS23.setASFld223(CONSTANTS.LITERAL_645286444);
      
      }
      /**
      * mainlineSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS23                           COBOL Name: WS-2-3A-S
      *
      * Output :  

      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aS23                           COBOL Name: WS-2-3A-S
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      * - bS23                           COBOL Name: WS-2-3B-S
      * - bT23                           COBOL Name: WS-2-3B-T
      * - bSFld123                       COBOL Name: WS-2-3B-S-FLD1
      * - bSFld223                       COBOL Name: WS-2-3B-S-FLD2
      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - bTFld123                       COBOL Name: WS-2-3B-T-FLD1
      * - bTFld223                       COBOL Name: WS-2-3B-T-FLD2
      * - aS24                           COBOL Name: WS-2-4A-S
      * - aT24                           COBOL Name: WS-2-4A-T
      * - aTFld124                       COBOL Name: WS-2-4A-T-FLD1
      * - aTFld224                       COBOL Name: WS-2-4A-T-FLD2
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bT24                           COBOL Name: WS-2-4B-T
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      *
      * @throws CFException
      */
      private void mainlineSplit2() throws Exception {
//  MOVE LENGTH OF WS-2-3A-T TO WS-2-T-LEN
          work.setTLen2((short) AT23.getAT23FieldLength());
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-ONE : WS-2-T-LEN )
          aT23.replace(aS23.getCharArray(),0,aS23.length(),(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 51* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("* 51* WS-2-3A-S        = ({})", aS23.toString()); 
//  DISPLAY '* 52*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("* 52*   WS-2-3A-S-FLD1 = ({})", new String(aS23.getASFld123())); 
//  DISPLAY '* 53*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("* 53*   WS-2-3A-S-FLD2 = ({})", new String(aS23.getASFld223())); 
//  DISPLAY '* 54* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("* 54* WS-2-3A-T        = ({})", aT23.toString()); 
//  DISPLAY '* 55*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("* 55*   WS-2-3A-T-FLD1 = ({})", new String(aT23.getATFld123())); 
//  DISPLAY '* 56*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("* 56*   WS-2-3A-T-FLD2 = ({})", new String(aT23.getATFld223())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          bS23.initialize();
          bT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          bS23.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          bS23.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          bT23.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-ONE : LENGTH OF WS-2-3B-T )
          bT23.replace(bS23.getCharArray(),0,bS23.length(),(work.getOne()-1),BT23.getBT23FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 57* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("* 57* WS-2-3B-S        = ({})", bS23.toString()); 
//  DISPLAY '* 58*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("* 58*   WS-2-3B-S-FLD1 = ({})", new String(bS23.getBSFld123())); 
//  DISPLAY '* 59*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("* 59*   WS-2-3B-S-FLD2 = ({})", new String(bS23.getBSFld223())); 
//  DISPLAY '* 60* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("* 60* WS-2-3B-T        = ({})", bT23.toString()); 
//  DISPLAY '* 61*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("* 61*   WS-2-3B-T-FLD1 = ({})", new String(bT23.getBTFld123())); 
//  DISPLAY '* 62*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("* 62*   WS-2-3B-T-FLD2 = ({})", new String(bT23.getBTFld223())); 
//  DISPLAY '* 63*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("* 63*   WS-2-3B-T-FLD3 = ({})", new String(bT23.getBTFld323())); 

// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          bS23.initialize();
          bT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          bS23.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          bS23.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          bT23.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-3B-T TO WS-2-T-LEN
          work.setTLen2((short) BT23.getBT23FieldLength());
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-ONE : WS-2-T-LEN )
          bT23.replace(bS23.getCharArray(),0,bS23.length(),(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 64* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("* 64* WS-2-3B-S        = ({})", bS23.toString()); 
//  DISPLAY '* 65*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("* 65*   WS-2-3B-S-FLD1 = ({})", new String(bS23.getBSFld123())); 
//  DISPLAY '* 66*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("* 66*   WS-2-3B-S-FLD2 = ({})", new String(bS23.getBSFld223())); 
//  DISPLAY '* 67* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("* 67* WS-2-3B-T        = ({})", bT23.toString()); 
//  DISPLAY '* 68*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("* 68*   WS-2-3B-T-FLD1 = ({})", new String(bT23.getBTFld123())); 
//  DISPLAY '* 69*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("* 69*   WS-2-3B-T-FLD2 = ({})", new String(bT23.getBTFld223())); 
//  DISPLAY '* 70*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("* 70*   WS-2-3B-T-FLD3 = ({})", new String(bT23.getBTFld323())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          work.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          work.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-ONE : LENGTH OF WS-2-4A-T )
          aT24.replace(work.getAS24(),0,work.getAS24().length,(work.getOne()-1),AT24.getAT24FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 71* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("* 71* WS-2-4A-S        = ({})", new String(work.getAS24())); 
//  DISPLAY '* 72* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("* 72* WS-2-4A-T        = ({})", aT24.toString()); 
//  DISPLAY '* 73*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("* 73*   WS-2-4A-T-FLD1 = ({})", new String(aT24.getATFld124())); 
//  DISPLAY '* 74*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("* 74*   WS-2-4A-T-FLD2 = ({})", new String(aT24.getATFld224())); 

// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          work.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          work.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-4A-T TO WS-2-T-LEN
          work.setTLen2((short) AT24.getAT24FieldLength());
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-ONE : WS-2-T-LEN )
          aT24.replace(work.getAS24(),0,work.getAS24().length,(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 75* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("* 75* WS-2-4A-S        = ({})", new String(work.getAS24())); 
//  DISPLAY '* 76* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("* 76* WS-2-4A-T        = ({})", aT24.toString()); 
//  DISPLAY '* 77*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("* 77*   WS-2-4A-T-FLD1 = ({})", new String(aT24.getATFld124())); 
//  DISPLAY '* 78*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("* 78*   WS-2-4A-T-FLD2 = ({})", new String(aT24.getATFld224())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          work.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          work.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          bT24.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
      
      }
      /**
      * mainlineSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS24                           COBOL Name: WS-2-4B-S
      *
      * Output :  

      * - bT24                           COBOL Name: WS-2-4B-T
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bTFld124                       COBOL Name: WS-2-4B-T-FLD1
      * - bTFld224                       COBOL Name: WS-2-4B-T-FLD2
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS21                           COBOL Name: WS-2-1A-S
      * - aT21                           COBOL Name: WS-2-1A-T
      * - aSFld121                       COBOL Name: WS-2-1A-S-FLD1
      * - aSFld221                       COBOL Name: WS-2-1A-S-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - aTFld121                       COBOL Name: WS-2-1A-T-FLD1
      * - aTFld221                       COBOL Name: WS-2-1A-T-FLD2
      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit3() throws Exception {
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-ONE : LENGTH OF WS-2-4B-T )
          bT24.replace(work.getBS24(),0,work.getBS24().length,(work.getOne()-1),BT24.getBT24FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 79* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("* 79* WS-2-4B-S        = ({})", new String(work.getBS24())); 
//  DISPLAY '* 80* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("* 80* WS-2-4B-T        = ({})", bT24.toString()); 
//  DISPLAY '* 81*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("* 81*   WS-2-4B-T-FLD1 = ({})", new String(bT24.getBTFld124())); 
//  DISPLAY '* 82*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("* 82*   WS-2-4B-T-FLD2 = ({})", new String(bT24.getBTFld224())); 
//  DISPLAY '* 83*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("* 83*   WS-2-4B-T-FLD3 = ({})", new String(bT24.getBTFld324())); 

// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          work.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          work.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          bT24.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-4B-T TO WS-2-T-LEN
          work.setTLen2((short) BT24.getBT24FieldLength());
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-ONE : WS-2-T-LEN )
          bT24.replace(work.getBS24(),0,work.getBS24().length,(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 84* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("* 84* WS-2-4B-S        = ({})", new String(work.getBS24())); 
//  DISPLAY '* 85* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("* 85* WS-2-4B-T        = ({})", bT24.toString()); 
//  DISPLAY '* 86*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("* 86*   WS-2-4B-T-FLD1 = ({})", new String(bT24.getBTFld124())); 
//  DISPLAY '* 87*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("* 87*   WS-2-4B-T-FLD2 = ({})", new String(bT24.getBTFld224())); 
//  DISPLAY '* 88*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("* 88*   WS-2-4B-T-FLD3 = ({})", new String(bT24.getBTFld324())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          aS21.initialize();
          aT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          aS21.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          aS21.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          work.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          work.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-THREE : LENGTH OF WS-2-1A-S - 3) TO WS-2-1A-T ( WS-FIVE : LENGTH OF WS-2-1A-T - 5)
          aT21.replace(aS21,(work.getThree()-1),AS21.getAS21FieldLength() - 3,(work.getFive()-1),AT21.getAT21FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 89* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("* 89* WS-2-1A-S        = ({})", aS21.toString()); 
//  DISPLAY '* 90*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("* 90*   WS-2-1A-S-FLD1 = ({})", new String(aS21.getASFld121())); 
//  DISPLAY '* 91*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("* 91*   WS-2-1A-S-FLD2 = ({})", new String(aS21.getASFld221())); 
//  DISPLAY '* 92* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 92* WS-2-1A-T        = ({})", aT21.toString()); 
//  DISPLAY '* 93*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 93*   WS-2-1A-T-FLD1 = ({})", new String(aT21.getATFld121())); 
//  DISPLAY '* 94*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("* 94*   WS-2-1A-T-FLD2 = ({})", new String(aT21.getATFld221())); 

// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          aS21.initialize();
          aT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          aS21.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          aS21.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          work.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          work.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-THREE : WS-2-S-LEN - 3 ) TO WS-2-1A-T ( WS-FIVE : WS-2-T-LEN - 5)
          aT21.replace(aS21,(work.getThree()-1),work.getSLen2() - 3,(work.getFive()-1),work.getTLen2() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 95* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("* 95* WS-2-1A-S        = ({})", aS21.toString()); 
//  DISPLAY '* 96*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("* 96*   WS-2-1A-S-FLD1 = ({})", new String(aS21.getASFld121())); 
//  DISPLAY '* 97*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("* 97*   WS-2-1A-S-FLD2 = ({})", new String(aS21.getASFld221())); 
//  DISPLAY '* 98* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 98* WS-2-1A-T        = ({})", aT21.toString()); 
//  DISPLAY '* 99*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 99*   WS-2-1A-T-FLD1 = ({})", new String(aT21.getATFld121())); 
//  DISPLAY '*100*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("*100*   WS-2-1A-T-FLD2 = ({})", new String(aT21.getATFld221())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          bS21.initialize();
          bT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          bS21.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          bS21.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          bT21.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-1B-S ( WS-THREE : LENGTH OF WS-2-1B-S - 3 ) TO WS-2-1B-T ( WS-FIVE : LENGTH OF WS-2-1B-T - 5)
          bT21.replace(bS21,(work.getThree()-1),BS21.getBS21FieldLength() - 3,(work.getFive()-1),BT21.getBT21FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*101* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("*101* WS-2-1B-S        = ({})", bS21.toString()); 
//  DISPLAY '*102*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("*102*   WS-2-1B-S-FLD1 = ({})", new String(bS21.getBSFld121())); 
//  DISPLAY '*103*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("*103*   WS-2-1B-S-FLD2 = ({})", new String(bS21.getBSFld221())); 
//  DISPLAY '*104* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("*104* WS-2-1B-T        = ({})", bT21.toString()); 
//  DISPLAY '*105*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("*105*   WS-2-1B-T-FLD1 = ({})", new String(bT21.getBTFld121())); 
//  DISPLAY '*106*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("*106*   WS-2-1B-T-FLD2 = ({})", new String(bT21.getBTFld221())); 
      
      }
      /**
      * mainlineSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      *
      * Output :  

      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      * - aS22                           COBOL Name: WS-2-2A-S
      * - aT22                           COBOL Name: WS-2-2A-T
      * - aTFld122                       COBOL Name: WS-2-2A-T-FLD1
      * - aTFld222                       COBOL Name: WS-2-2A-T-FLD2
      * - bS22                           COBOL Name: WS-2-2B-S
      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit4() throws Exception {
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			// End of variable declaration

//  DISPLAY '*107*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("*107*   WS-2-1B-T-FLD3 = ({})", new String(bT21.getBTFld321())); 

// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          bS21.initialize();
          bT21.initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          bS21.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          bS21.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          bT21.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-1B-S TO WS-2-S-LEN
          work.setSLen2((short) BS21.getBS21FieldLength());
//  MOVE LENGTH OF WS-2-1B-T TO WS-2-T-LEN
          work.setTLen2((short) BT21.getBT21FieldLength());
//  MOVE WS-2-1B-S ( WS-THREE : WS-2-S-LEN - 3 ) TO WS-2-1B-T ( WS-FIVE : WS-2-T-LEN - 5)
          bT21.replace(bS21,(work.getThree()-1),work.getSLen2() - 3,(work.getFive()-1),work.getTLen2() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*108* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("*108* WS-2-1B-S        = ({})", bS21.toString()); 
//  DISPLAY '*109*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("*109*   WS-2-1B-S-FLD1 = ({})", new String(bS21.getBSFld121())); 
//  DISPLAY '*110*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("*110*   WS-2-1B-S-FLD2 = ({})", new String(bS21.getBSFld221())); 
//  DISPLAY '*111* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("*111* WS-2-1B-T        = ({})", bT21.toString()); 
//  DISPLAY '*112*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("*112*   WS-2-1B-T-FLD1 = ({})", new String(bT21.getBTFld121())); 
//  DISPLAY '*113*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("*113*   WS-2-1B-T-FLD2 = ({})", new String(bT21.getBTFld221())); 
//  DISPLAY '*114*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("*114*   WS-2-1B-T-FLD3 = ({})", new String(bT21.getBTFld321())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          work.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          work.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-2A-S ( WS-THREE : LENGTH OF WS-2-2A-S - 3 ) TO WS-2-2A-T ( WS-FIVE : LENGTH OF WS-2-2A-T - 5)
          aT22.replace(work.getAS22(),(work.getThree()-1)/* aS22 */ ,A_S_22_LENGTH - 3,(work.getFive()-1),AT22.getAT22FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*115* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("*115* WS-2-2A-S        = ({})", new String(work.getAS22())); 
//  DISPLAY '*116* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("*116* WS-2-2A-T        = ({})", aT22.toString()); 
//  DISPLAY '*117*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("*117*   WS-2-2A-T-FLD1 = ({})", new String(aT22.getATFld122())); 
//  DISPLAY '*118*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("*118*   WS-2-2A-T-FLD2 = ({})", new String(aT22.getATFld222())); 

// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          work.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          work.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-2A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2A-T TO WS-2-T-LEN
          work.setTLen2((short) AT22.getAT22FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-2A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-2A-T ( WS-FIVE : WS-2-T-LEN )
          aT22.replace(work.getAS22(),(work.getThree()-1)/* aS22 */ ,work.getSLen2(),(work.getFive()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*119* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("*119* WS-2-2A-S        = ({})", new String(work.getAS22())); 
//  DISPLAY '*120* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("*120* WS-2-2A-T        = ({})", aT22.toString()); 
//  DISPLAY '*121*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("*121*   WS-2-2A-T-FLD1 = ({})", new String(aT22.getATFld122())); 
//  DISPLAY '*122*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("*122*   WS-2-2A-T-FLD2 = ({})", new String(aT22.getATFld222())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          work.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          work.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          bT22.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-2B-S ( WS-THREE : LENGTH OF WS-2-2B-S - 3 ) TO WS-2-2B-T ( WS-FIVE : LENGTH OF WS-2-2B-T - 5)
          bT22.replace(work.getBS22(),(work.getThree()-1)/* bS22 */ ,B_S_22_LENGTH - 3,(work.getFive()-1),BT22.getBT22FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*123* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("*123* WS-2-2B-S        = ({})", new String(work.getBS22())); 
//  DISPLAY '*124* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("*124* WS-2-2B-T        = ({})", bT22.toString()); 
//  DISPLAY '*125*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("*125*   WS-2-2B-T-FLD1 = ({})", new String(bT22.getBTFld122())); 
//  DISPLAY '*126*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("*126*   WS-2-2B-T-FLD2 = ({})", new String(bT22.getBTFld222())); 
//  DISPLAY '*127*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("*127*   WS-2-2B-T-FLD3 = ({})", new String(bT22.getBTFld322())); 

// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          work.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT22.initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          work.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          bT22.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-2B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2B-T TO WS-2-T-LEN
          work.setTLen2((short) BT22.getBT22FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-2B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-2B-T ( WS-FIVE : WS-2-T-LEN )
          bT22.replace(work.getBS22(),(work.getThree()-1)/* bS22 */ ,work.getSLen2(),(work.getFive()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*128* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("*128* WS-2-2B-S        = ({})", new String(work.getBS22())); 
      
      }
      /**
      * mainlineSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      *
      * Output :  

      * - aS23                           COBOL Name: WS-2-3A-S
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS23                           COBOL Name: WS-2-3B-S
      * - bT23                           COBOL Name: WS-2-3B-T
      * - bSFld123                       COBOL Name: WS-2-3B-S-FLD1
      * - bSFld223                       COBOL Name: WS-2-3B-S-FLD2
      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - bTFld123                       COBOL Name: WS-2-3B-T-FLD1
      * - bTFld223                       COBOL Name: WS-2-3B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit5() throws Exception {
//  DISPLAY '*129* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("*129* WS-2-2B-T        = ({})", bT22.toString()); 
//  DISPLAY '*130*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("*130*   WS-2-2B-T-FLD1 = ({})", new String(bT22.getBTFld122())); 
//  DISPLAY '*131*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("*131*   WS-2-2B-T-FLD2 = ({})", new String(bT22.getBTFld222())); 
//  DISPLAY '*132*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("*132*   WS-2-2B-T-FLD3 = ({})", new String(bT22.getBTFld322())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          aS23.initialize();
          aT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          aS23.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          aS23.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-FIVE : LENGTH OF WS-2-3A-T - 5)
          aT23.replace(aS23.getCharArray(),0,aS23.length(),(work.getFive()-1),AT23.getAT23FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*133* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("*133* WS-2-3A-S        = ({})", aS23.toString()); 
//  DISPLAY '*134*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("*134*   WS-2-3A-S-FLD1 = ({})", new String(aS23.getASFld123())); 
//  DISPLAY '*135*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("*135*   WS-2-3A-S-FLD2 = ({})", new String(aS23.getASFld223())); 
//  DISPLAY '*136* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("*136* WS-2-3A-T        = ({})", aT23.toString()); 
//  DISPLAY '*137*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("*137*   WS-2-3A-T-FLD1 = ({})", new String(aT23.getATFld123())); 
//  DISPLAY '*138*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("*138*   WS-2-3A-T-FLD2 = ({})", new String(aT23.getATFld223())); 

// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          aS23.initialize();
          aT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          aS23.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          aS23.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-3A-T TO WS-2-T-LEN
          work.setTLen2((short) AT23.getAT23FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-FIVE : WS-2-T-LEN )
          aT23.replace(aS23.getCharArray(),0,aS23.length(),(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*139* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("*139* WS-2-3A-S        = ({})", aS23.toString()); 
//  DISPLAY '*140*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("*140*   WS-2-3A-S-FLD1 = ({})", new String(aS23.getASFld123())); 
//  DISPLAY '*141*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("*141*   WS-2-3A-S-FLD2 = ({})", new String(aS23.getASFld223())); 
//  DISPLAY '*142* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("*142* WS-2-3A-T        = ({})", aT23.toString()); 
//  DISPLAY '*143*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("*143*   WS-2-3A-T-FLD1 = ({})", new String(aT23.getATFld123())); 
//  DISPLAY '*144*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("*144*   WS-2-3A-T-FLD2 = ({})", new String(aT23.getATFld223())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          bS23.initialize();
          bT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          bS23.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          bS23.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          bT23.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-FIVE : LENGTH OF WS-2-3B-T - 5)
          bT23.replace(bS23.getCharArray(),0,bS23.length(),(work.getFive()-1),BT23.getBT23FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*145* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("*145* WS-2-3B-S        = ({})", bS23.toString()); 
//  DISPLAY '*146*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("*146*   WS-2-3B-S-FLD1 = ({})", new String(bS23.getBSFld123())); 
//  DISPLAY '*147*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("*147*   WS-2-3B-S-FLD2 = ({})", new String(bS23.getBSFld223())); 
//  DISPLAY '*148* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("*148* WS-2-3B-T        = ({})", bT23.toString()); 
//  DISPLAY '*149*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("*149*   WS-2-3B-T-FLD1 = ({})", new String(bT23.getBTFld123())); 
//  DISPLAY '*150*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("*150*   WS-2-3B-T-FLD2 = ({})", new String(bT23.getBTFld223())); 
//  DISPLAY '*151*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("*151*   WS-2-3B-T-FLD3 = ({})", new String(bT23.getBTFld323())); 

// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          bS23.initialize();
          bT23.initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          bS23.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          bS23.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          bT23.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-3B-T TO WS-2-T-LEN
          work.setTLen2((short) BT23.getBT23FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-FIVE : WS-2-T-LEN )
          bT23.replace(bS23.getCharArray(),0,bS23.length(),(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*152* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("*152* WS-2-3B-S        = ({})", bS23.toString()); 
//  DISPLAY '*153*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("*153*   WS-2-3B-S-FLD1 = ({})", new String(bS23.getBSFld123())); 
//  DISPLAY '*154*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("*154*   WS-2-3B-S-FLD2 = ({})", new String(bS23.getBSFld223())); 
//  DISPLAY '*155* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("*155* WS-2-3B-T        = ({})", bT23.toString()); 
//  DISPLAY '*156*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("*156*   WS-2-3B-T-FLD1 = ({})", new String(bT23.getBTFld123())); 
//  DISPLAY '*157*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("*157*   WS-2-3B-T-FLD2 = ({})", new String(bT23.getBTFld223())); 
      
      }
      /**
      * mainlineSplit6 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT6 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      *
      * Output :  

      * - aS24                           COBOL Name: WS-2-4A-S
      * - aT24                           COBOL Name: WS-2-4A-T
      * - aTFld124                       COBOL Name: WS-2-4A-T-FLD1
      * - aTFld224                       COBOL Name: WS-2-4A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bT24                           COBOL Name: WS-2-4B-T
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      * - bTFld124                       COBOL Name: WS-2-4B-T-FLD1
      * - bTFld224                       COBOL Name: WS-2-4B-T-FLD2
      * - aS25                           COBOL Name: WS-2-5A-S
      * - aT25                           COBOL Name: WS-2-5A-T
      * - aSFld125                       COBOL Name: WS-2-5A-S-FLD1
      * - aSFld225                       COBOL Name: WS-2-5A-S-FLD2
      * - aTFld125                       COBOL Name: WS-2-5A-T-FLD1
      * - aTFld225                       COBOL Name: WS-2-5A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit6() throws Exception {
			// Declare local variables used in the method
			AS25 aS25 = aSGrp25.getAS25();
			// End of variable declaration

//  DISPLAY '*158*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("*158*   WS-2-3B-T-FLD3 = ({})", new String(bT23.getBTFld323())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          work.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          work.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-FIVE : LENGTH OF WS-2-4A-T - 5)
          aT24.replace(work.getAS24(),0,work.getAS24().length,(work.getFive()-1),AT24.getAT24FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*159* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("*159* WS-2-4A-S        = ({})", new String(work.getAS24())); 
//  DISPLAY '*160* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("*160* WS-2-4A-T        = ({})", aT24.toString()); 
//  DISPLAY '*161*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("*161*   WS-2-4A-T-FLD1 = ({})", new String(aT24.getATFld124())); 
//  DISPLAY '*162*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("*162*   WS-2-4A-T-FLD2 = ({})", new String(aT24.getATFld224())); 

// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          work.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          work.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-4A-T TO WS-2-T-LEN
          work.setTLen2((short) AT24.getAT24FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-FIVE : WS-2-T-LEN )
          aT24.replace(work.getAS24(),0,work.getAS24().length,(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*163* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("*163* WS-2-4A-S        = ({})", new String(work.getAS24())); 
//  DISPLAY '*164* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("*164* WS-2-4A-T        = ({})", aT24.toString()); 
//  DISPLAY '*165*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("*165*   WS-2-4A-T-FLD1 = ({})", new String(aT24.getATFld124())); 
//  DISPLAY '*166*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("*166*   WS-2-4A-T-FLD2 = ({})", new String(aT24.getATFld224())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          work.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          work.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          bT24.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-FIVE : LENGTH OF WS-2-4B-T - 5)
          bT24.replace(work.getBS24(),0,work.getBS24().length,(work.getFive()-1),BT24.getBT24FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*167* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("*167* WS-2-4B-S        = ({})", new String(work.getBS24())); 
//  DISPLAY '*168* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("*168* WS-2-4B-T        = ({})", bT24.toString()); 
//  DISPLAY '*169*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("*169*   WS-2-4B-T-FLD1 = ({})", new String(bT24.getBTFld124())); 
//  DISPLAY '*170*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("*170*   WS-2-4B-T-FLD2 = ({})", new String(bT24.getBTFld224())); 
//  DISPLAY '*171*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("*171*   WS-2-4B-T-FLD3 = ({})", new String(bT24.getBTFld324())); 

// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          work.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT24.initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          work.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          bT24.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-4B-T TO WS-2-T-LEN
          work.setTLen2((short) BT24.getBT24FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-FIVE : WS-2-T-LEN )
          bT24.replace(work.getBS24(),0,work.getBS24().length,(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*172* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("*172* WS-2-4B-S        = ({})", new String(work.getBS24())); 
//  DISPLAY '*173* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("*173* WS-2-4B-T        = ({})", bT24.toString()); 
//  DISPLAY '*174*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("*174*   WS-2-4B-T-FLD1 = ({})", new String(bT24.getBTFld124())); 
//  DISPLAY '*175*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("*175*   WS-2-4B-T-FLD2 = ({})", new String(bT24.getBTFld224())); 
//  DISPLAY '*176*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("*176*   WS-2-4B-T-FLD3 = ({})", new String(bT24.getBTFld324())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; src offset 3
// *
//  INITIALIZE WS-2-5A-S WS-2-5A-T
          aSGrp25.getAS25().initialize();
          aT25.initialize();
//  MOVE ALL 'ABCD' TO WS-2-5A-S-FLD1
          aS25.setASFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-5A-S-FLD2
          aS25.setASFld225(CONSTANTS.LITERAL_645286444);
  
//  MOVE WS-2-5A-S ( WS-ONE : LENGTH OF WS-2-5A-S ) TO WS-2-5A-T ( WS-ONE : LENGTH OF WS-2-5A-T )
          aT25.replace(aSGrp25/*parent*/,3+work.getOne() - 1/*fromOffset - (aT25) */,AS25.getAS25FieldLength()/*fromLen*/,0+work.getOne() - 1/*toOffset - (aS25) */,AT25.getAT25FieldLength()/*toLen*/);

// *
//  DISPLAY '*177* WS-2-5A-S-GRP    = (' WS-2-5A-S-GRP ')'
          logger.info("*177* WS-2-5A-S-GRP    = ({})", aSGrp25.toString()); 
//  DISPLAY '*178* WS-2-5A-S        = (' WS-2-5A-S ')'
          logger.info("*178* WS-2-5A-S        = ({})", aSGrp25.getAS25().toString()); 
//  DISPLAY '*179*   WS-2-5A-S-FLD1 = (' WS-2-5A-S-FLD1 ')'
          logger.info("*179*   WS-2-5A-S-FLD1 = ({})", new String(aS25.getASFld125())); 
  
//  DISPLAY '*180*   WS-2-5A-S-FLD2 = (' WS-2-5A-S-FLD2 ')'
          logger.info("*180*   WS-2-5A-S-FLD2 = ({})", new String(aS25.getASFld225())); 
  
//  DISPLAY '*181* WS-2-5A-T        = (' WS-2-5A-T ')'
          logger.info("*181* WS-2-5A-T        = ({})", aT25.toString()); 
//  DISPLAY '*182*   WS-2-5A-T-FLD1 = (' WS-2-5A-T-FLD1 ')'
          logger.info("*182*   WS-2-5A-T-FLD1 = ({})", new String(aT25.getATFld125())); 
//  DISPLAY '*183*   WS-2-5A-T-FLD2 = (' WS-2-5A-T-FLD2 ')'
          logger.info("*183*   WS-2-5A-T-FLD2 = ({})", new String(aT25.getATFld225())); 

// *
//  INITIALIZE WS-2-5A-S WS-2-5A-T
          aSGrp25.getAS25().initialize();
          aT25.initialize();
//  MOVE ALL 'ABCD' TO WS-2-5A-S-FLD1
          aS25.setASFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-5A-S-FLD2
          aS25.setASFld225(CONSTANTS.LITERAL_645286444);
  
      
      }
      /**
      * mainlineSplit7 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT7 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS25                           COBOL Name: WS-2-5A-S
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      * - bSGrp25                        COBOL Name: WS-2-5B-S-GRP
      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      *
      * Output :  

      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aT25                           COBOL Name: WS-2-5A-T
      * - aS25                           COBOL Name: WS-2-5A-S
      * - aSFld125                       COBOL Name: WS-2-5A-S-FLD1
      * - aSFld225                       COBOL Name: WS-2-5A-S-FLD2
      * - aTFld125                       COBOL Name: WS-2-5A-T-FLD1
      * - aTFld225                       COBOL Name: WS-2-5A-T-FLD2
      * - bS25                           COBOL Name: WS-2-5B-S
      * - bT25                           COBOL Name: WS-2-5B-T
      * - bSFld125                       COBOL Name: WS-2-5B-S-FLD1
      * - bSFld225                       COBOL Name: WS-2-5B-S-FLD2
      * - bTFld325                       COBOL Name: WS-2-5B-T-FLD3
      * - bTFld125                       COBOL Name: WS-2-5B-T-FLD1
      * - bTFld225                       COBOL Name: WS-2-5B-T-FLD2
      * - aS26                           COBOL Name: WS-2-6A-S
      * - aT26                           COBOL Name: WS-2-6A-T
      * - aTFld126                       COBOL Name: WS-2-6A-T-FLD1
      * - aTFld226                       COBOL Name: WS-2-6A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit7() throws Exception {
			// Declare local variables used in the method
			AS25 aS25 = aSGrp25.getAS25();
			BS25 bS25 = bSGrp25.getBS25();
			 final int A_S_26_LENGTH = 70;
			// End of variable declaration

//  MOVE LENGTH OF WS-2-5A-S TO WS-2-S-LEN
          work.setSLen2((short) AS25.getAS25FieldLength());
//  MOVE LENGTH OF WS-2-5A-T TO WS-2-T-LEN
          work.setTLen2((short) AT25.getAT25FieldLength());
//  MOVE WS-2-5A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-5A-T ( WS-ONE : WS-2-T-LEN )
          aT25.replace(aSGrp25/*parent*/,3+work.getOne() - 1/*fromOffset - (aT25) */,work.getSLen2()/*fromLen*/,0+work.getOne() - 1/*toOffset - (aS25) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*184* WS-2-5A-S-GRP    = (' WS-2-5A-S-GRP ')'
          logger.info("*184* WS-2-5A-S-GRP    = ({})", aSGrp25.toString()); 
//  DISPLAY '*185* WS-2-5A-S        = (' WS-2-5A-S ')'
          logger.info("*185* WS-2-5A-S        = ({})", aSGrp25.getAS25().toString()); 
//  DISPLAY '*186*   WS-2-5A-S-FLD1 = (' WS-2-5A-S-FLD1 ')'
          logger.info("*186*   WS-2-5A-S-FLD1 = ({})", new String(aS25.getASFld125())); 
  
//  DISPLAY '*187*   WS-2-5A-S-FLD2 = (' WS-2-5A-S-FLD2 ')'
          logger.info("*187*   WS-2-5A-S-FLD2 = ({})", new String(aS25.getASFld225())); 
  
//  DISPLAY '*188* WS-2-5A-T        = (' WS-2-5A-T ')'
          logger.info("*188* WS-2-5A-T        = ({})", aT25.toString()); 
//  DISPLAY '*189*   WS-2-5A-T-FLD1 = (' WS-2-5A-T-FLD1 ')'
          logger.info("*189*   WS-2-5A-T-FLD1 = ({})", new String(aT25.getATFld125())); 
//  DISPLAY '*190*   WS-2-5A-T-FLD2 = (' WS-2-5A-T-FLD2 ')'
          logger.info("*190*   WS-2-5A-T-FLD2 = ({})", new String(aT25.getATFld225())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt ;src offset 3
// *
//  INITIALIZE WS-2-5B-S WS-2-5B-T
          bSGrp25.getBS25().initialize();
          bT25.initialize();
//  MOVE ALL 'ABCD' TO WS-2-5B-S-FLD1
          bS25.setBSFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-5B-S-FLD2
          bS25.setBSFld225(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-5B-T-FLD3
          bT25.setBTFld325(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-5B-S ( WS-ONE : LENGTH OF WS-2-5B-S ) TO WS-2-5B-T ( WS-ONE : LENGTH OF WS-2-5B-T )
          bT25.replace(bSGrp25/*parent*/,3+work.getOne() - 1/*fromOffset - (bT25) */,BS25.getBS25FieldLength()/*fromLen*/,0+work.getOne() - 1/*toOffset - (bS25) */,BT25.getBT25FieldLength()/*toLen*/);

// *
//  DISPLAY '*191* WS-2-5B-S-GRP    = (' WS-2-5B-S-GRP ')'
          logger.info("*191* WS-2-5B-S-GRP    = ({})", bSGrp25.toString()); 
//  DISPLAY '*192* WS-2-5B-S        = (' WS-2-5B-S ')'
          logger.info("*192* WS-2-5B-S        = ({})", bSGrp25.getBS25().toString()); 
//  DISPLAY '*193*   WS-2-5B-S-FLD1 = (' WS-2-5B-S-FLD1 ')'
          logger.info("*193*   WS-2-5B-S-FLD1 = ({})", new String(bS25.getBSFld125())); 
  
//  DISPLAY '*194*   WS-2-5B-S-FLD2 = (' WS-2-5B-S-FLD2 ')'
          logger.info("*194*   WS-2-5B-S-FLD2 = ({})", new String(bS25.getBSFld225())); 
  
//  DISPLAY '*195* WS-2-5B-T        = (' WS-2-5B-T ')'
          logger.info("*195* WS-2-5B-T        = ({})", bT25.toString()); 
//  DISPLAY '*196*   WS-2-5B-T-FLD1 = (' WS-2-5B-T-FLD1 ')'
          logger.info("*196*   WS-2-5B-T-FLD1 = ({})", new String(bT25.getBTFld125())); 
//  DISPLAY '*197*   WS-2-5B-T-FLD2 = (' WS-2-5B-T-FLD2 ')'
          logger.info("*197*   WS-2-5B-T-FLD2 = ({})", new String(bT25.getBTFld225())); 
//  DISPLAY '*198*   WS-2-5B-T-FLD3 = (' WS-2-5B-T-FLD3 ')'
          logger.info("*198*   WS-2-5B-T-FLD3 = ({})", new String(bT25.getBTFld325())); 

// *
//  INITIALIZE WS-2-5B-S WS-2-5B-T
          bSGrp25.getBS25().initialize();
          bT25.initialize();
//  MOVE ALL 'ABCD' TO WS-2-5B-S-FLD1
          bS25.setBSFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-5B-S-FLD2
          bS25.setBSFld225(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-5B-T-FLD3
          bT25.setBTFld325(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-5B-S TO WS-2-S-LEN
          work.setSLen2((short) BS25.getBS25FieldLength());
//  MOVE LENGTH OF WS-2-6B-T TO WS-2-T-LEN
          work.setTLen2((short) BT26.getBT26FieldLength());
//  MOVE WS-2-5B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-5B-T ( WS-ONE : WS-2-T-LEN )
          bT25.replace(bSGrp25/*parent*/,3+work.getOne() - 1/*fromOffset - (bT25) */,work.getSLen2()/*fromLen*/,0+work.getOne() - 1/*toOffset - (bS25) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*199* WS-2-5B-S-GRP    = (' WS-2-5B-S-GRP ')'
          logger.info("*199* WS-2-5B-S-GRP    = ({})", bSGrp25.toString()); 
//  DISPLAY '*200* WS-2-5B-S        = (' WS-2-5B-S ')'
          logger.info("*200* WS-2-5B-S        = ({})", bSGrp25.getBS25().toString()); 
//  DISPLAY '*201*   WS-2-5B-S-FLD1 = (' WS-2-5B-S-FLD1 ')'
          logger.info("*201*   WS-2-5B-S-FLD1 = ({})", new String(bS25.getBSFld125())); 
  
//  DISPLAY '*202*   WS-2-5B-S-FLD2 = (' WS-2-5B-S-FLD2 ')'
          logger.info("*202*   WS-2-5B-S-FLD2 = ({})", new String(bS25.getBSFld225())); 
  
//  DISPLAY '*203* WS-2-5B-T        = (' WS-2-5B-T ')'
          logger.info("*203* WS-2-5B-T        = ({})", bT25.toString()); 
//  DISPLAY '*204*   WS-2-5B-T-FLD1 = (' WS-2-5B-T-FLD1 ')'
          logger.info("*204*   WS-2-5B-T-FLD1 = ({})", new String(bT25.getBTFld125())); 
//  DISPLAY '*205*   WS-2-5B-T-FLD2 = (' WS-2-5B-T-FLD2 ')'
          logger.info("*205*   WS-2-5B-T-FLD2 = ({})", new String(bT25.getBTFld225())); 
//  DISPLAY '*206*   WS-2-5B-T-FLD3 = (' WS-2-5B-T-FLD3 ')'
          logger.info("*206*   WS-2-5B-T-FLD3 = ({})", new String(bT25.getBTFld325())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; srcoffset 3
// *
//  INITIALIZE WS-2-6A-S WS-2-6A-T
          aSGrp26.setAS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT26.initialize();
//  MOVE ALL 'ABCD' TO WS-2-6A-S
          aSGrp26.setAS26(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-6A-S ( WS-ONE : LENGTH OF WS-2-6A-S ) TO WS-2-6A-T ( WS-ONE : LENGTH OF WS-2-6A-T )
          aT26.replace(aSGrp26/*parent*/,3+work.getOne() - 1/*fromOffset - (aT26) */,A_S_26_LENGTH/*fromLen*/,0+work.getOne() - 1/*toOffset - (aS26) */,AT26.getAT26FieldLength()/*toLen*/);

// *
//  DISPLAY '*207* WS-2-6A-S-GRP    = (' WS-2-6A-S-GRP ')'
          logger.info("*207* WS-2-6A-S-GRP    = ({})", aSGrp26.toString()); 
//  DISPLAY '*208* WS-2-6A-S        = (' WS-2-6A-S ')'
          logger.info("*208* WS-2-6A-S        = ({})", new String(aSGrp26.getAS26())); 
//  DISPLAY '*209* WS-2-6A-T        = (' WS-2-6A-T ')'
          logger.info("*209* WS-2-6A-T        = ({})", aT26.toString()); 
//  DISPLAY '*210*   WS-2-6A-T-FLD1 = (' WS-2-6A-T-FLD1 ')'
          logger.info("*210*   WS-2-6A-T-FLD1 = ({})", new String(aT26.getATFld126())); 
//  DISPLAY '*211*   WS-2-6A-T-FLD2 = (' WS-2-6A-T-FLD2 ')'
          logger.info("*211*   WS-2-6A-T-FLD2 = ({})", new String(aT26.getATFld226())); 

// *
//  INITIALIZE WS-2-6A-S WS-2-6A-T
          aSGrp26.setAS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT26.initialize();
//  MOVE ALL 'ABCD' TO WS-2-6A-S
          aSGrp26.setAS26(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-6A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_26_LENGTH);
//  MOVE LENGTH OF WS-2-6A-T TO WS-2-T-LEN
          work.setTLen2((short) AT26.getAT26FieldLength());
//  MOVE WS-2-6A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-6A-T ( WS-ONE : WS-2-T-LEN )
          aT26.replace(aSGrp26/*parent*/,3+work.getOne() - 1/*fromOffset - (aT26) */,work.getSLen2()/*fromLen*/,0+work.getOne() - 1/*toOffset - (aS26) */,work.getTLen2()/*toLen*/);
      
      }
      /**
      * mainlineSplit8 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT8 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      * - aS26                           COBOL Name: WS-2-6A-S
      * - aT26                           COBOL Name: WS-2-6A-T
      * - aTFld126                       COBOL Name: WS-2-6A-T-FLD1
      * - aTFld226                       COBOL Name: WS-2-6A-T-FLD2
      * - bSGrp26                        COBOL Name: WS-2-6B-S-GRP
      * - aTGrp27                        COBOL Name: WS-2-7A-T-GRP
      *
      * Output :  

      * - bS26                           COBOL Name: WS-2-6B-S
      * - bT26                           COBOL Name: WS-2-6B-T
      * - bTFld326                       COBOL Name: WS-2-6B-T-FLD3
      * - bTFld126                       COBOL Name: WS-2-6B-T-FLD1
      * - bTFld226                       COBOL Name: WS-2-6B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS27                           COBOL Name: WS-2-7A-S
      * - aT27                           COBOL Name: WS-2-7A-T
      * - aSFld127                       COBOL Name: WS-2-7A-S-FLD1
      * - aSFld227                       COBOL Name: WS-2-7A-S-FLD2
      * - aTFld127                       COBOL Name: WS-2-7A-T-FLD1
      * - aTFld227                       COBOL Name: WS-2-7A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit8() throws Exception {
			// Declare local variables used in the method
			 final int B_S_26_LENGTH = 70;
			AT27 aT27 = aTGrp27.getAT27();
			// End of variable declaration


// *
//  DISPLAY '*212* WS-2-6A-S-GRP    = (' WS-2-6A-S-GRP ')'
          logger.info("*212* WS-2-6A-S-GRP    = ({})", aSGrp26.toString()); 
//  DISPLAY '*213* WS-2-6A-S        = (' WS-2-6A-S ')'
          logger.info("*213* WS-2-6A-S        = ({})", new String(aSGrp26.getAS26())); 
//  DISPLAY '*214* WS-2-6A-T        = (' WS-2-6A-T ')'
          logger.info("*214* WS-2-6A-T        = ({})", aT26.toString()); 
//  DISPLAY '*215*   WS-2-6A-T-FLD1 = (' WS-2-6A-T-FLD1 ')'
          logger.info("*215*   WS-2-6A-T-FLD1 = ({})", new String(aT26.getATFld126())); 
//  DISPLAY '*216*   WS-2-6A-T-FLD2 = (' WS-2-6A-T-FLD2 ')'
          logger.info("*216*   WS-2-6A-T-FLD2 = ({})", new String(aT26.getATFld226())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt; srcoffset 3
// *
//  INITIALIZE WS-2-6B-S WS-2-6B-T
          bSGrp26.setBS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT26.initialize();
//  MOVE ALL 'ABCD' TO WS-2-6B-S
          bSGrp26.setBS26(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-6B-T-FLD3
          bT26.setBTFld326(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-6B-S ( WS-ONE : LENGTH OF WS-2-6B-S ) TO WS-2-6B-T ( WS-ONE : LENGTH OF WS-2-6B-T )
          bT26.replace(bSGrp26/*parent*/,3+work.getOne() - 1/*fromOffset - (bT26) */,B_S_26_LENGTH/*fromLen*/,0+work.getOne() - 1/*toOffset - (bS26) */,BT26.getBT26FieldLength()/*toLen*/);

// *
//  DISPLAY '*217* WS-2-6B-S-GRP    = (' WS-2-6B-S-GRP ')'
          logger.info("*217* WS-2-6B-S-GRP    = ({})", bSGrp26.toString()); 
//  DISPLAY '*218* WS-2-6B-S        = (' WS-2-6B-S ')'
          logger.info("*218* WS-2-6B-S        = ({})", new String(bSGrp26.getBS26())); 
//  DISPLAY '*219* WS-2-6B-T        = (' WS-2-6B-T ')'
          logger.info("*219* WS-2-6B-T        = ({})", bT26.toString()); 
//  DISPLAY '*220*   WS-2-6B-T-FLD1 = (' WS-2-6B-T-FLD1 ')'
          logger.info("*220*   WS-2-6B-T-FLD1 = ({})", new String(bT26.getBTFld126())); 
//  DISPLAY '*221*   WS-2-6B-T-FLD2 = (' WS-2-6B-T-FLD2 ')'
          logger.info("*221*   WS-2-6B-T-FLD2 = ({})", new String(bT26.getBTFld226())); 
//  DISPLAY '*222*   WS-2-6B-T-FLD3 = (' WS-2-6B-T-FLD3 ')'
          logger.info("*222*   WS-2-6B-T-FLD3 = ({})", new String(bT26.getBTFld326())); 

// *
//  INITIALIZE WS-2-6B-S WS-2-6B-T
          bSGrp26.setBS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT26.initialize();
//  MOVE ALL 'ABCD' TO WS-2-6B-S
          bSGrp26.setBS26(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-6B-T-FLD3
          bT26.setBTFld326(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-6B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_26_LENGTH);
//  MOVE LENGTH OF WS-2-6B-T TO WS-2-T-LEN
          work.setTLen2((short) BT26.getBT26FieldLength());
//  MOVE WS-2-6B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-6B-T ( WS-ONE : WS-2-T-LEN )
          bT26.replace(bSGrp26/*parent*/,3+work.getOne() - 1/*fromOffset - (bT26) */,work.getSLen2()/*fromLen*/,0+work.getOne() - 1/*toOffset - (bS26) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*223* WS-2-6B-S-GRP    = (' WS-2-6B-S-GRP ')'
          logger.info("*223* WS-2-6B-S-GRP    = ({})", bSGrp26.toString()); 
//  DISPLAY '*224* WS-2-6B-S        = (' WS-2-6B-S ')'
          logger.info("*224* WS-2-6B-S        = ({})", new String(bSGrp26.getBS26())); 
//  DISPLAY '*225* WS-2-6B-T        = (' WS-2-6B-T ')'
          logger.info("*225* WS-2-6B-T        = ({})", bT26.toString()); 
//  DISPLAY '*226*   WS-2-6B-T-FLD1 = (' WS-2-6B-T-FLD1 ')'
          logger.info("*226*   WS-2-6B-T-FLD1 = ({})", new String(bT26.getBTFld126())); 
//  DISPLAY '*227*   WS-2-6B-T-FLD2 = (' WS-2-6B-T-FLD2 ')'
          logger.info("*227*   WS-2-6B-T-FLD2 = ({})", new String(bT26.getBTFld226())); 
//  DISPLAY '*228*   WS-2-6B-T-FLD3 = (' WS-2-6B-T-FLD3 ')'
          logger.info("*228*   WS-2-6B-T-FLD3 = ({})", new String(bT26.getBTFld326())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; tgt offset 5
// *
//  INITIALIZE WS-2-7A-S WS-2-7A-T
          aS27.initialize();
          aTGrp27.getAT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7A-S-FLD1
          aS27.setASFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7A-S-FLD2
          aS27.setASFld227(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-7A-S ( WS-ONE : LENGTH OF WS-2-7A-S ) TO WS-2-7A-T ( WS-ONE : LENGTH OF WS-2-7A-T )
          aTGrp27.getAT27().replace(aS27,(work.getOne()-1),AS27.getAS27FieldLength(), (aTGrp27.getAT27().begin + (work.getOne()-1)) ,AT27.getAT27FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*229* WS-2-7A-S        = (' WS-2-7A-S ')'
          logger.info("*229* WS-2-7A-S        = ({})", aS27.toString()); 
//  DISPLAY '*230*   WS-2-7A-S-FLD1 = (' WS-2-7A-S-FLD1 ')'
          logger.info("*230*   WS-2-7A-S-FLD1 = ({})", new String(aS27.getASFld127())); 
//  DISPLAY '*231*   WS-2-7A-S-FLD2 = (' WS-2-7A-S-FLD2 ')'
          logger.info("*231*   WS-2-7A-S-FLD2 = ({})", new String(aS27.getASFld227())); 
//  DISPLAY '*232* WS-2-7A-T-GRP    = (' WS-2-7A-T-GRP ')'
          logger.info("*232* WS-2-7A-T-GRP    = ({})", aTGrp27.toString()); 
//  DISPLAY '*233* WS-2-7A-T        = (' WS-2-7A-T ')'
          logger.info("*233* WS-2-7A-T        = ({})", aTGrp27.getAT27().toString()); 
//  DISPLAY '*234*   WS-2-7A-T-FLD1 = (' WS-2-7A-T-FLD1 ')'
          logger.info("*234*   WS-2-7A-T-FLD1 = ({})", new String(aT27.getATFld127())); 
  
//  DISPLAY '*235*   WS-2-7A-T-FLD2 = (' WS-2-7A-T-FLD2 ')'
          logger.info("*235*   WS-2-7A-T-FLD2 = ({})", new String(aT27.getATFld227())); 
  

// *
//  INITIALIZE WS-2-7A-S WS-2-7A-T
          aS27.initialize();
          aTGrp27.getAT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7A-S-FLD1
          aS27.setASFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7A-S-FLD2
          aS27.setASFld227(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-7A-S TO WS-2-S-LEN
          work.setSLen2((short) AS27.getAS27FieldLength());
//  MOVE LENGTH OF WS-2-7A-T TO WS-2-T-LEN
          work.setTLen2((short) AT27.getAT27FieldLength());
//  MOVE WS-2-7A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-7A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp27.getAT27().replace(aS27,(work.getOne()-1),work.getSLen2(), (aTGrp27.getAT27().begin + (work.getOne()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*236* WS-2-7A-S        = (' WS-2-7A-S ')'
          logger.info("*236* WS-2-7A-S        = ({})", aS27.toString()); 
//  DISPLAY '*237*   WS-2-7A-S-FLD1 = (' WS-2-7A-S-FLD1 ')'
          logger.info("*237*   WS-2-7A-S-FLD1 = ({})", new String(aS27.getASFld127())); 
//  DISPLAY '*238*   WS-2-7A-S-FLD2 = (' WS-2-7A-S-FLD2 ')'
          logger.info("*238*   WS-2-7A-S-FLD2 = ({})", new String(aS27.getASFld227())); 
//  DISPLAY '*239* WS-2-7A-T-GRP    = (' WS-2-7A-T-GRP ')'
          logger.info("*239* WS-2-7A-T-GRP    = ({})", aTGrp27.toString()); 
//  DISPLAY '*240* WS-2-7A-T        = (' WS-2-7A-T ')'
          logger.info("*240* WS-2-7A-T        = ({})", aTGrp27.getAT27().toString()); 
//  DISPLAY '*241*   WS-2-7A-T-FLD1 = (' WS-2-7A-T-FLD1 ')'
          logger.info("*241*   WS-2-7A-T-FLD1 = ({})", new String(aT27.getATFld127())); 
  
//  DISPLAY '*242*   WS-2-7A-T-FLD2 = (' WS-2-7A-T-FLD2 ')'
          logger.info("*242*   WS-2-7A-T-FLD2 = ({})", new String(aT27.getATFld227())); 
  
      
      }
      /**
      * mainlineSplit9 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT9 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTGrp27                        COBOL Name: WS-2-7B-T-GRP
      * - aTGrp28                        COBOL Name: WS-2-8A-T-GRP
      * - bTGrp28                        COBOL Name: WS-2-8B-T-GRP
      *
      * Output :  

      * - bS27                           COBOL Name: WS-2-7B-S
      * - bT27                           COBOL Name: WS-2-7B-T
      * - bSFld127                       COBOL Name: WS-2-7B-S-FLD1
      * - bSFld227                       COBOL Name: WS-2-7B-S-FLD2
      * - bTFld327                       COBOL Name: WS-2-7B-T-FLD3
      * - bTFld127                       COBOL Name: WS-2-7B-T-FLD1
      * - bTFld227                       COBOL Name: WS-2-7B-T-FLD2
      * - aS28                           COBOL Name: WS-2-8A-S
      * - aT28                           COBOL Name: WS-2-8A-T
      * - aTFld128                       COBOL Name: WS-2-8A-T-FLD1
      * - aTFld228                       COBOL Name: WS-2-8A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS28                           COBOL Name: WS-2-8B-S
      * - bT28                           COBOL Name: WS-2-8B-T
      * - bTFld328                       COBOL Name: WS-2-8B-T-FLD3
      * - bTFld128                       COBOL Name: WS-2-8B-T-FLD1
      * - bTFld228                       COBOL Name: WS-2-8B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit9() throws Exception {
			// Declare local variables used in the method
			BT27 bT27 = bTGrp27.getBT27();
			 final int A_S_28_LENGTH = 70;
			 final int B_S_28_LENGTH = 70;
			AT28 aT28 = aTGrp28.getAT28();
			BT28 bT28 = bTGrp28.getBT28();
			// End of variable declaration


// *
// * Src -> group; tgt -> group ; src smaller than tgt ;tgt offset 5
// *
//  INITIALIZE WS-2-7B-S WS-2-7B-T
          bS27.initialize();
          bTGrp27.getBT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7B-S-FLD1
          bS27.setBSFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7B-S-FLD2
          bS27.setBSFld227(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-7B-T-FLD3
          bT27.setBTFld327(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-7B-S ( WS-ONE : LENGTH OF WS-2-7B-S ) TO WS-2-7B-T ( WS-ONE : LENGTH OF WS-2-7B-T )
          bTGrp27.getBT27().replace(bS27,(work.getOne()-1),BS27.getBS27FieldLength(), (bTGrp27.getBT27().begin + (work.getOne()-1)) ,BT27.getBT27FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*243* WS-2-7B-S        = (' WS-2-7B-S ')'
          logger.info("*243* WS-2-7B-S        = ({})", bS27.toString()); 
//  DISPLAY '*244*   WS-2-7B-S-FLD1 = (' WS-2-7B-S-FLD1 ')'
          logger.info("*244*   WS-2-7B-S-FLD1 = ({})", new String(bS27.getBSFld127())); 
//  DISPLAY '*245*   WS-2-7B-S-FLD2 = (' WS-2-7B-S-FLD2 ')'
          logger.info("*245*   WS-2-7B-S-FLD2 = ({})", new String(bS27.getBSFld227())); 
//  DISPLAY '*246* WS-2-7B-T-GRP    = (' WS-2-7B-T-GRP ')'
          logger.info("*246* WS-2-7B-T-GRP    = ({})", bTGrp27.toString()); 
//  DISPLAY '*247* WS-2-7B-T        = (' WS-2-7B-T ')'
          logger.info("*247* WS-2-7B-T        = ({})", bTGrp27.getBT27().toString()); 
//  DISPLAY '*248*   WS-2-7B-T-FLD1 = (' WS-2-7B-T-FLD1 ')'
          logger.info("*248*   WS-2-7B-T-FLD1 = ({})", new String(bT27.getBTFld127())); 
  
//  DISPLAY '*249*   WS-2-7B-T-FLD2 = (' WS-2-7B-T-FLD2 ')'
          logger.info("*249*   WS-2-7B-T-FLD2 = ({})", new String(bT27.getBTFld227())); 
  
//  DISPLAY '*250*   WS-2-7B-T-FLD3 = (' WS-2-7B-T-FLD3 ')'
          logger.info("*250*   WS-2-7B-T-FLD3 = ({})", new String(bT27.getBTFld327())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; tgtoffset 5
// *
//  INITIALIZE WS-2-8A-S WS-2-8A-T
          work.setAS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp28.getAT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8A-S
          work.setAS28(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-8A-S ( WS-ONE : LENGTH OF WS-2-8A-S ) TO WS-2-8A-T ( WS-ONE : LENGTH OF WS-2-8A-T )
          aTGrp28.setAT28(work.getAS28(),(work.getOne()-1)/* aS28 */ ,A_S_28_LENGTH,(work.getOne()-1),AT28.getAT28FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*251* WS-2-8A-S        = (' WS-2-8A-S ')'
          logger.info("*251* WS-2-8A-S        = ({})", new String(work.getAS28())); 
//  DISPLAY '*252* WS-2-8A-T-GRP    = (' WS-2-8A-T-GRP ')'
          logger.info("*252* WS-2-8A-T-GRP    = ({})", aTGrp28.toString()); 
//  DISPLAY '*253* WS-2-8A-T        = (' WS-2-8A-T ')'
          logger.info("*253* WS-2-8A-T        = ({})", aTGrp28.getAT28().toString()); 
//  DISPLAY '*254*   WS-2-8A-T-FLD1 = (' WS-2-8A-T-FLD1 ')'
          logger.info("*254*   WS-2-8A-T-FLD1 = ({})", new String(aT28.getATFld128())); 
  
//  DISPLAY '*255*   WS-2-8A-T-FLD2 = (' WS-2-8A-T-FLD2 ')'
          logger.info("*255*   WS-2-8A-T-FLD2 = ({})", new String(aT28.getATFld228())); 
  

// *
//  INITIALIZE WS-2-8A-S WS-2-8A-T
          work.setAS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp28.getAT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8A-S
          work.setAS28(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-8A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_28_LENGTH);
//  MOVE LENGTH OF WS-2-8A-T TO WS-2-T-LEN
          work.setTLen2((short) AT28.getAT28FieldLength());
//  MOVE WS-2-8A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-8A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp28.setAT28(work.getAS28(),(work.getOne()-1)/* aS28 */ ,work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*256* WS-2-8A-S        = (' WS-2-8A-S ')'
          logger.info("*256* WS-2-8A-S        = ({})", new String(work.getAS28())); 
//  DISPLAY '*257* WS-2-8A-T-GRP    = (' WS-2-8A-T-GRP ')'
          logger.info("*257* WS-2-8A-T-GRP    = ({})", aTGrp28.toString()); 
//  DISPLAY '*258* WS-2-8A-T        = (' WS-2-8A-T ')'
          logger.info("*258* WS-2-8A-T        = ({})", aTGrp28.getAT28().toString()); 
//  DISPLAY '*259*   WS-2-8A-T-FLD1 = (' WS-2-8A-T-FLD1 ')'
          logger.info("*259*   WS-2-8A-T-FLD1 = ({})", new String(aT28.getATFld128())); 
  
//  DISPLAY '*260*   WS-2-8A-T-FLD2 = (' WS-2-8A-T-FLD2 ')'
          logger.info("*260*   WS-2-8A-T-FLD2 = ({})", new String(aT28.getATFld228())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt; tgtoffset 5
// *
//  INITIALIZE WS-2-8B-S WS-2-8B-T
          work.setBS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp28.getBT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8B-S
          work.setBS28(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-8B-T-FLD3
          bT28.setBTFld328(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-8B-S ( WS-ONE : LENGTH OF WS-2-8B-S ) TO WS-2-8B-T ( WS-ONE : LENGTH OF WS-2-8B-T )
          bTGrp28.setBT28(work.getBS28(),(work.getOne()-1)/* bS28 */ ,B_S_28_LENGTH,(work.getOne()-1),BT28.getBT28FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*261* WS-2-8B-S        = (' WS-2-8B-S ')'
          logger.info("*261* WS-2-8B-S        = ({})", new String(work.getBS28())); 
//  DISPLAY '*262* WS-2-8B-T-GRP    = (' WS-2-8B-T-GRP ')'
          logger.info("*262* WS-2-8B-T-GRP    = ({})", bTGrp28.toString()); 
//  DISPLAY '*263* WS-2-8B-T        = (' WS-2-8B-T ')'
          logger.info("*263* WS-2-8B-T        = ({})", bTGrp28.getBT28().toString()); 
//  DISPLAY '*264*   WS-2-8B-T-FLD1 = (' WS-2-8B-T-FLD1 ')'
          logger.info("*264*   WS-2-8B-T-FLD1 = ({})", new String(bT28.getBTFld128())); 
  
//  DISPLAY '*265*   WS-2-8B-T-FLD2 = (' WS-2-8B-T-FLD2 ')'
          logger.info("*265*   WS-2-8B-T-FLD2 = ({})", new String(bT28.getBTFld228())); 
  
//  DISPLAY '*266*   WS-2-8B-T-FLD3 = (' WS-2-8B-T-FLD3 ')'
          logger.info("*266*   WS-2-8B-T-FLD3 = ({})", new String(bT28.getBTFld328())); 
  

// *
//  INITIALIZE WS-2-8B-S WS-2-8B-T
          work.setBS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp28.getBT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8B-S
          work.setBS28(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-8B-T-FLD3
          bT28.setBTFld328(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-8B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_28_LENGTH);
//  MOVE LENGTH OF WS-2-8B-T TO WS-2-T-LEN
          work.setTLen2((short) BT28.getBT28FieldLength());
//  MOVE WS-2-8B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-8B-T ( WS-ONE : WS-2-T-LEN )
          bTGrp28.setBT28(work.getBS28(),(work.getOne()-1)/* bS28 */ ,work.getSLen2(),(work.getOne()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*267* WS-2-8B-S        = (' WS-2-8B-S ')'
          logger.info("*267* WS-2-8B-S        = ({})", new String(work.getBS28())); 
//  DISPLAY '*268* WS-2-8B-T-GRP    = (' WS-2-8B-T-GRP ')'
          logger.info("*268* WS-2-8B-T-GRP    = ({})", bTGrp28.toString()); 
//  DISPLAY '*269* WS-2-8B-T        = (' WS-2-8B-T ')'
          logger.info("*269* WS-2-8B-T        = ({})", bTGrp28.getBT28().toString()); 
//  DISPLAY '*270*   WS-2-8B-T-FLD1 = (' WS-2-8B-T-FLD1 ')'
          logger.info("*270*   WS-2-8B-T-FLD1 = ({})", new String(bT28.getBTFld128())); 
  
      
      }
      /**
      * mainlineSplit10 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT10 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld228                       COBOL Name: WS-2-8B-T-FLD2
      * - bTFld328                       COBOL Name: WS-2-8B-T-FLD3
      * - aSGrp29                        COBOL Name: WS-2-9A-S-GRP
      * - aTGrp29                        COBOL Name: WS-2-9A-T-GRP
      * - bSGrp29                        COBOL Name: WS-2-9B-S-GRP
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      *
      * Output :  

      * - aS29                           COBOL Name: WS-2-9A-S
      * - aT29                           COBOL Name: WS-2-9A-T
      * - aSFld129                       COBOL Name: WS-2-9A-S-FLD1
      * - aSFld229                       COBOL Name: WS-2-9A-S-FLD2
      * - aTFld129                       COBOL Name: WS-2-9A-T-FLD1
      * - aTFld229                       COBOL Name: WS-2-9A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS29                           COBOL Name: WS-2-9B-S
      * - bT29                           COBOL Name: WS-2-9B-T
      * - bSFld129                       COBOL Name: WS-2-9B-S-FLD1
      * - bSFld229                       COBOL Name: WS-2-9B-S-FLD2
      * - bTFld329                       COBOL Name: WS-2-9B-T-FLD3
      * - bTFld129                       COBOL Name: WS-2-9B-T-FLD1
      * - bTFld229                       COBOL Name: WS-2-9B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit10() throws Exception {
			// Declare local variables used in the method
			BT28 bT28 = bTGrp28.getBT28();
			AS29 aS29 = aSGrp29.getAS29();
			AT29 aT29 = aTGrp29.getAT29();
			BS29 bS29 = bSGrp29.getBS29();
			BT29 bT29 = bTGrp29.getBT29();
			// End of variable declaration

//  DISPLAY '*271*   WS-2-8B-T-FLD2 = (' WS-2-8B-T-FLD2 ')'
          logger.info("*271*   WS-2-8B-T-FLD2 = ({})", new String(bT28.getBTFld228())); 
  
//  DISPLAY '*272*   WS-2-8B-T-FLD3 = (' WS-2-8B-T-FLD3 ')'
          logger.info("*272*   WS-2-8B-T-FLD3 = ({})", new String(bT28.getBTFld328())); 
  

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-9A-S WS-2-9A-T
          aSGrp29.getAS29().initialize();
          aTGrp29.getAT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9A-S-FLD1
          aS29.setASFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-9A-S-FLD2
          aS29.setASFld229(CONSTANTS.LITERAL_645286444);
  
//  MOVE WS-2-9A-S ( WS-ONE : LENGTH OF WS-2-9A-S ) TO WS-2-9A-T ( WS-ONE : LENGTH OF WS-2-9A-T )
          aTGrp29.replace(aSGrp29/*parent*/,3+work.getOne() - 1/*fromOffset - (aT29) */,AS29.getAS29FieldLength()/*fromLen*/,5+work.getOne() - 1/*toOffset - (aS29) */,AT29.getAT29FieldLength()/*toLen*/);

// *
//  DISPLAY '*273* WS-2-9A-S-GRP    = (' WS-2-9A-S-GRP ')'
          logger.info("*273* WS-2-9A-S-GRP    = ({})", aSGrp29.toString()); 
//  DISPLAY '*274* WS-2-9A-S        = (' WS-2-9A-S ')'
          logger.info("*274* WS-2-9A-S        = ({})", aSGrp29.getAS29().toString()); 
//  DISPLAY '*275*   WS-2-9A-S-FLD1 = (' WS-2-9A-S-FLD1 ')'
          logger.info("*275*   WS-2-9A-S-FLD1 = ({})", new String(aS29.getASFld129())); 
  
//  DISPLAY '*276*   WS-2-9A-S-FLD2 = (' WS-2-9A-S-FLD2 ')'
          logger.info("*276*   WS-2-9A-S-FLD2 = ({})", new String(aS29.getASFld229())); 
  
//  DISPLAY '*277* WS-2-9A-T-GRP    = (' WS-2-9A-T-GRP ')'
          logger.info("*277* WS-2-9A-T-GRP    = ({})", aTGrp29.toString()); 
//  DISPLAY '*278* WS-2-9A-T        = (' WS-2-9A-T ')'
          logger.info("*278* WS-2-9A-T        = ({})", aTGrp29.getAT29().toString()); 
//  DISPLAY '*279*   WS-2-9A-T-FLD1 = (' WS-2-9A-T-FLD1 ')'
          logger.info("*279*   WS-2-9A-T-FLD1 = ({})", new String(aT29.getATFld129())); 
  
//  DISPLAY '*280*   WS-2-9A-T-FLD2 = (' WS-2-9A-T-FLD2 ')'
          logger.info("*280*   WS-2-9A-T-FLD2 = ({})", new String(aT29.getATFld229())); 
  

// *
//  INITIALIZE WS-2-9A-S WS-2-9A-T
          aSGrp29.getAS29().initialize();
          aTGrp29.getAT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9A-S-FLD1
          aS29.setASFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-9A-S-FLD2
          aS29.setASFld229(CONSTANTS.LITERAL_645286444);
  
//  MOVE LENGTH OF WS-2-9A-S TO WS-2-S-LEN
          work.setSLen2((short) AS29.getAS29FieldLength());
//  MOVE LENGTH OF WS-2-9A-T TO WS-2-T-LEN
          work.setTLen2((short) AT29.getAT29FieldLength());
//  MOVE WS-2-9A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-9A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp29.replace(aSGrp29/*parent*/,3+work.getOne() - 1/*fromOffset - (aT29) */,work.getSLen2()/*fromLen*/,5+work.getOne() - 1/*toOffset - (aS29) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*281* WS-2-9A-S-GRP    = (' WS-2-9A-S-GRP ')'
          logger.info("*281* WS-2-9A-S-GRP    = ({})", aSGrp29.toString()); 
//  DISPLAY '*282* WS-2-9A-S        = (' WS-2-9A-S ')'
          logger.info("*282* WS-2-9A-S        = ({})", aSGrp29.getAS29().toString()); 
//  DISPLAY '*283*   WS-2-9A-S-FLD1 = (' WS-2-9A-S-FLD1 ')'
          logger.info("*283*   WS-2-9A-S-FLD1 = ({})", new String(aS29.getASFld129())); 
  
//  DISPLAY '*284*   WS-2-9A-S-FLD2 = (' WS-2-9A-S-FLD2 ')'
          logger.info("*284*   WS-2-9A-S-FLD2 = ({})", new String(aS29.getASFld229())); 
  
//  DISPLAY '*285* WS-2-9A-T-GRP    = (' WS-2-9A-T-GRP ')'
          logger.info("*285* WS-2-9A-T-GRP    = ({})", aTGrp29.toString()); 
//  DISPLAY '*286* WS-2-9A-T        = (' WS-2-9A-T ')'
          logger.info("*286* WS-2-9A-T        = ({})", aTGrp29.getAT29().toString()); 
//  DISPLAY '*287*   WS-2-9A-T-FLD1 = (' WS-2-9A-T-FLD1 ')'
          logger.info("*287*   WS-2-9A-T-FLD1 = ({})", new String(aT29.getATFld129())); 
  
//  DISPLAY '*288*   WS-2-9A-T-FLD2 = (' WS-2-9A-T-FLD2 ')'
          logger.info("*288*   WS-2-9A-T-FLD2 = ({})", new String(aT29.getATFld229())); 
  

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-9B-S WS-2-9B-T
          bSGrp29.getBS29().initialize();
          bTGrp29.getBT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9B-S-FLD1
          bS29.setBSFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-9B-S-FLD2
          bS29.setBSFld229(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-9B-T-FLD3
          bT29.setBTFld329(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-9B-S ( WS-ONE : LENGTH OF WS-2-9B-S ) TO WS-2-9B-T ( WS-ONE : LENGTH OF WS-2-9B-T )
          bTGrp29.replace(bSGrp29/*parent*/,3+work.getOne() - 1/*fromOffset - (bT29) */,BS29.getBS29FieldLength()/*fromLen*/,5+work.getOne() - 1/*toOffset - (bS29) */,BT29.getBT29FieldLength()/*toLen*/);

// *
//  DISPLAY '*289* WS-2-9B-S-GRP    = (' WS-2-9B-S-GRP ')'
          logger.info("*289* WS-2-9B-S-GRP    = ({})", bSGrp29.toString()); 
//  DISPLAY '*290* WS-2-9B-S        = (' WS-2-9B-S ')'
          logger.info("*290* WS-2-9B-S        = ({})", bSGrp29.getBS29().toString()); 
//  DISPLAY '*291*   WS-2-9B-S-FLD1 = (' WS-2-9B-S-FLD1 ')'
          logger.info("*291*   WS-2-9B-S-FLD1 = ({})", new String(bS29.getBSFld129())); 
  
//  DISPLAY '*292*   WS-2-9B-S-FLD2 = (' WS-2-9B-S-FLD2 ')'
          logger.info("*292*   WS-2-9B-S-FLD2 = ({})", new String(bS29.getBSFld229())); 
  
//  DISPLAY '*293* WS-2-9B-T-GRP    = (' WS-2-9B-T-GRP ')'
          logger.info("*293* WS-2-9B-T-GRP    = ({})", bTGrp29.toString()); 
//  DISPLAY '*294* WS-2-9B-T        = (' WS-2-9B-T ')'
          logger.info("*294* WS-2-9B-T        = ({})", bTGrp29.getBT29().toString()); 
//  DISPLAY '*295*   WS-2-9B-T-FLD1 = (' WS-2-9B-T-FLD1 ')'
          logger.info("*295*   WS-2-9B-T-FLD1 = ({})", new String(bT29.getBTFld129())); 
  
//  DISPLAY '*296*   WS-2-9B-T-FLD2 = (' WS-2-9B-T-FLD2 ')'
          logger.info("*296*   WS-2-9B-T-FLD2 = ({})", new String(bT29.getBTFld229())); 
  
//  DISPLAY '*297*   WS-2-9B-T-FLD3 = (' WS-2-9B-T-FLD3 ')'
          logger.info("*297*   WS-2-9B-T-FLD3 = ({})", new String(bT29.getBTFld329())); 
  

// *
//  INITIALIZE WS-2-9B-S WS-2-9B-T
          bSGrp29.getBS29().initialize();
          bTGrp29.getBT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9B-S-FLD1
          bS29.setBSFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-9B-S-FLD2
          bS29.setBSFld229(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-9B-T-FLD3
          bT29.setBTFld329(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-9B-S TO WS-2-S-LEN
          work.setSLen2((short) BS29.getBS29FieldLength());
//  MOVE LENGTH OF WS-2-9B-T TO WS-2-T-LEN
          work.setTLen2((short) BT29.getBT29FieldLength());
//  MOVE WS-2-9B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-9B-T ( WS-ONE : WS-2-T-LEN )
          bTGrp29.replace(bSGrp29/*parent*/,3+work.getOne() - 1/*fromOffset - (bT29) */,work.getSLen2()/*fromLen*/,5+work.getOne() - 1/*toOffset - (bS29) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*298* WS-2-9B-S-GRP    = (' WS-2-9B-S-GRP ')'
          logger.info("*298* WS-2-9B-S-GRP    = ({})", bSGrp29.toString()); 
//  DISPLAY '*299* WS-2-9B-S        = (' WS-2-9B-S ')'
          logger.info("*299* WS-2-9B-S        = ({})", bSGrp29.getBS29().toString()); 
      
      }
      /**
      * mainlineSplit11 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT11 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bSFld129                       COBOL Name: WS-2-9B-S-FLD1
      * - bSFld229                       COBOL Name: WS-2-9B-S-FLD2
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      * - bT29                           COBOL Name: WS-2-9B-T
      * - bTFld129                       COBOL Name: WS-2-9B-T-FLD1
      * - bTFld229                       COBOL Name: WS-2-9B-T-FLD2
      * - bTFld329                       COBOL Name: WS-2-9B-T-FLD3
      * - aSGrp210                       COBOL Name: WS-2-10A-S-GRP
      * - aTGrp210                       COBOL Name: WS-2-10A-T-GRP
      * - bSGrp210                       COBOL Name: WS-2-10B-S-GRP
      * - bTGrp210                       COBOL Name: WS-2-10B-T-GRP
      *
      * Output :  

      * - aS210                          COBOL Name: WS-2-10A-S
      * - aT210                          COBOL Name: WS-2-10A-T
      * - aTFld1210                      COBOL Name: WS-2-10A-T-FLD1
      * - aTFld2210                      COBOL Name: WS-2-10A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS210                          COBOL Name: WS-2-10B-S
      * - bT210                          COBOL Name: WS-2-10B-T
      * - bTFld3210                      COBOL Name: WS-2-10B-T-FLD3
      * - bTFld1210                      COBOL Name: WS-2-10B-T-FLD1
      * - bTFld2210                      COBOL Name: WS-2-10B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit11() throws Exception {
			// Declare local variables used in the method
			BS29 bS29 = bSGrp29.getBS29();
			BT29 bT29 = bTGrp29.getBT29();
			 final int A_S_210_LENGTH = 70;
			 final int B_S_210_LENGTH = 70;
			AT210 aT210 = aTGrp210.getAT210();
			BT210 bT210 = bTGrp210.getBT210();
			// End of variable declaration

//  DISPLAY '*300*   WS-2-9B-S-FLD1 = (' WS-2-9B-S-FLD1 ')'
          logger.info("*300*   WS-2-9B-S-FLD1 = ({})", new String(bS29.getBSFld129())); 
  
//  DISPLAY '*301*   WS-2-9B-S-FLD2 = (' WS-2-9B-S-FLD2 ')'
          logger.info("*301*   WS-2-9B-S-FLD2 = ({})", new String(bS29.getBSFld229())); 
  
//  DISPLAY '*302* WS-2-9B-T-GRP    = (' WS-2-9B-T-GRP ')'
          logger.info("*302* WS-2-9B-T-GRP    = ({})", bTGrp29.toString()); 
//  DISPLAY '*303* WS-2-9B-T        = (' WS-2-9B-T ')'
          logger.info("*303* WS-2-9B-T        = ({})", bTGrp29.getBT29().toString()); 
//  DISPLAY '*304*   WS-2-9B-T-FLD1 = (' WS-2-9B-T-FLD1 ')'
          logger.info("*304*   WS-2-9B-T-FLD1 = ({})", new String(bT29.getBTFld129())); 
  
//  DISPLAY '*305*   WS-2-9B-T-FLD2 = (' WS-2-9B-T-FLD2 ')'
          logger.info("*305*   WS-2-9B-T-FLD2 = ({})", new String(bT29.getBTFld229())); 
  
//  DISPLAY '*306*   WS-2-9B-T-FLD3 = (' WS-2-9B-T-FLD3 ')'
          logger.info("*306*   WS-2-9B-T-FLD3 = ({})", new String(bT29.getBTFld329())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-10A-S WS-2-10A-T
          aSGrp210.setAS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp210.getAT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10A-S
          aSGrp210.setAS210(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-10A-S ( WS-ONE : LENGTH OF WS-2-10A-S ) TO WS-2-10A-T ( WS-ONE : LENGTH OF WS-2-10A-T )
          aTGrp210.replace(aSGrp210/*parent*/,3+work.getOne() - 1/*fromOffset - (aT210) */,A_S_210_LENGTH/*fromLen*/,5+work.getOne() - 1/*toOffset - (aS210) */,AT210.getAT210FieldLength()/*toLen*/);

// *
//  DISPLAY '*307* WS-2-10A-S-GRP   = (' WS-2-10A-S-GRP ')'
          logger.info("*307* WS-2-10A-S-GRP   = ({})", aSGrp210.toString()); 
//  DISPLAY '*308* WS-2-10A-S       = (' WS-2-10A-S ')'
          logger.info("*308* WS-2-10A-S       = ({})", new String(aSGrp210.getAS210())); 
//  DISPLAY '*309* WS-2-10A-T-GRP   = (' WS-2-10A-T-GRP ')'
          logger.info("*309* WS-2-10A-T-GRP   = ({})", aTGrp210.toString()); 
//  DISPLAY '*310* WS-2-10A-T       = (' WS-2-10A-T ')'
          logger.info("*310* WS-2-10A-T       = ({})", aTGrp210.getAT210().toString()); 
//  DISPLAY '*311*   WS-2-10A-T-FLD1= (' WS-2-10A-T-FLD1 ')'
          logger.info("*311*   WS-2-10A-T-FLD1= ({})", new String(aT210.getATFld1210())); 
  
//  DISPLAY '*312*   WS-2-10A-T-FLD2= (' WS-2-10A-T-FLD2 ')'
          logger.info("*312*   WS-2-10A-T-FLD2= ({})", new String(aT210.getATFld2210())); 
  

// *
//  INITIALIZE WS-2-10A-S WS-2-10A-T
          aSGrp210.setAS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp210.getAT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10A-S
          aSGrp210.setAS210(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-10A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_210_LENGTH);
//  MOVE LENGTH OF WS-2-10A-T TO WS-2-T-LEN
          work.setTLen2((short) AT210.getAT210FieldLength());
//  MOVE WS-2-10A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-10A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp210.replace(aSGrp210/*parent*/,3+work.getOne() - 1/*fromOffset - (aT210) */,work.getSLen2()/*fromLen*/,5+work.getOne() - 1/*toOffset - (aS210) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*313* WS-2-10A-S-GRP   = (' WS-2-10A-S-GRP ')'
          logger.info("*313* WS-2-10A-S-GRP   = ({})", aSGrp210.toString()); 
//  DISPLAY '*314* WS-2-10A-S       = (' WS-2-10A-S ')'
          logger.info("*314* WS-2-10A-S       = ({})", new String(aSGrp210.getAS210())); 
//  DISPLAY '*315* WS-2-10A-T-GRP   = (' WS-2-10A-T-GRP ')'
          logger.info("*315* WS-2-10A-T-GRP   = ({})", aTGrp210.toString()); 
//  DISPLAY '*316* WS-2-10A-T       = (' WS-2-10A-T ')'
          logger.info("*316* WS-2-10A-T       = ({})", aTGrp210.getAT210().toString()); 
//  DISPLAY '*317*   WS-2-10A-T-FLD1= (' WS-2-10A-T-FLD1 ')'
          logger.info("*317*   WS-2-10A-T-FLD1= ({})", new String(aT210.getATFld1210())); 
  
//  DISPLAY '*318*   WS-2-10A-T-FLD2= (' WS-2-10A-T-FLD2 ')'
          logger.info("*318*   WS-2-10A-T-FLD2= ({})", new String(aT210.getATFld2210())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-10B-S WS-2-10B-T
          bSGrp210.setBS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp210.getBT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10B-S
          bSGrp210.setBS210(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-10B-T-FLD3
          bT210.setBTFld3210(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-10B-S ( WS-ONE : LENGTH OF WS-2-10B-S ) TO WS-2-10B-T ( WS-ONE : LENGTH OF WS-2-10B-T )
          bTGrp210.replace(bSGrp210/*parent*/,3+work.getOne() - 1/*fromOffset - (bT210) */,B_S_210_LENGTH/*fromLen*/,5+work.getOne() - 1/*toOffset - (bS210) */,BT210.getBT210FieldLength()/*toLen*/);

// *
//  DISPLAY '*319* WS-2-10B-S-GRP   = (' WS-2-10B-S-GRP ')'
          logger.info("*319* WS-2-10B-S-GRP   = ({})", bSGrp210.toString()); 
//  DISPLAY '*320* WS-2-10B-S       = (' WS-2-10B-S ')'
          logger.info("*320* WS-2-10B-S       = ({})", new String(bSGrp210.getBS210())); 
//  DISPLAY '*321* WS-2-10B-T-GRP   = (' WS-2-10B-T-GRP ')'
          logger.info("*321* WS-2-10B-T-GRP   = ({})", bTGrp210.toString()); 
//  DISPLAY '*322* WS-2-10B-T       = (' WS-2-10B-T ')'
          logger.info("*322* WS-2-10B-T       = ({})", bTGrp210.getBT210().toString()); 
//  DISPLAY '*323*   WS-2-10B-T-FLD1= (' WS-2-10B-T-FLD1 ')'
          logger.info("*323*   WS-2-10B-T-FLD1= ({})", new String(bT210.getBTFld1210())); 
  
//  DISPLAY '*324*   WS-2-10B-T-FLD2= (' WS-2-10B-T-FLD2 ')'
          logger.info("*324*   WS-2-10B-T-FLD2= ({})", new String(bT210.getBTFld2210())); 
  
//  DISPLAY '*325*   WS-2-10B-T-FLD3= (' WS-2-10B-T-FLD3 ')'
          logger.info("*325*   WS-2-10B-T-FLD3= ({})", new String(bT210.getBTFld3210())); 
  

// *
//  INITIALIZE WS-2-10B-S WS-2-10B-T
          bSGrp210.setBS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp210.getBT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10B-S
          bSGrp210.setBS210(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-10B-T-FLD3
          bT210.setBTFld3210(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-10B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_210_LENGTH);
//  MOVE LENGTH OF WS-2-10B-T TO WS-2-T-LEN
          work.setTLen2((short) BT210.getBT210FieldLength());
//  MOVE WS-2-10B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-10B-T ( WS-ONE : WS-2-T-LEN )
          bTGrp210.replace(bSGrp210/*parent*/,3+work.getOne() - 1/*fromOffset - (bT210) */,work.getSLen2()/*fromLen*/,5+work.getOne() - 1/*toOffset - (bS210) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*326* WS-2-10B-S-GRP   = (' WS-2-10B-S-GRP ')'
          logger.info("*326* WS-2-10B-S-GRP   = ({})", bSGrp210.toString()); 
//  DISPLAY '*327* WS-2-10B-S       = (' WS-2-10B-S ')'
          logger.info("*327* WS-2-10B-S       = ({})", new String(bSGrp210.getBS210())); 
//  DISPLAY '*328* WS-2-10B-T-GRP   = (' WS-2-10B-T-GRP ')'
          logger.info("*328* WS-2-10B-T-GRP   = ({})", bTGrp210.toString()); 
//  DISPLAY '*329* WS-2-10B-T       = (' WS-2-10B-T ')'
          logger.info("*329* WS-2-10B-T       = ({})", bTGrp210.getBT210().toString()); 
//  DISPLAY '*330*   WS-2-10B-T-FLD1= (' WS-2-10B-T-FLD1 ')'
          logger.info("*330*   WS-2-10B-T-FLD1= ({})", new String(bT210.getBTFld1210())); 
  
//  DISPLAY '*331*   WS-2-10B-T-FLD2= (' WS-2-10B-T-FLD2 ')'
          logger.info("*331*   WS-2-10B-T-FLD2= ({})", new String(bT210.getBTFld2210())); 
  
//  DISPLAY '*332*   WS-2-10B-T-FLD3= (' WS-2-10B-T-FLD3 ')'
          logger.info("*332*   WS-2-10B-T-FLD3= ({})", new String(bT210.getBTFld3210())); 
  
      
      }
      /**
      * mainlineSplit12 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT12 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp211                       COBOL Name: WS-2-11A-T-GRP
      * - bTGrp211                       COBOL Name: WS-2-11B-T-GRP
      *
      * Output :  

      * - aS211                          COBOL Name: WS-2-11A-S
      * - aT211                          COBOL Name: WS-2-11A-T
      * - aSFld1211                      COBOL Name: WS-2-11A-S-FLD1
      * - aSFld2211                      COBOL Name: WS-2-11A-S-FLD2
      * - aTFld1211                      COBOL Name: WS-2-11A-T-FLD1
      * - aTFld2211                      COBOL Name: WS-2-11A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS211                          COBOL Name: WS-2-11B-S
      * - bT211                          COBOL Name: WS-2-11B-T
      * - bSFld1211                      COBOL Name: WS-2-11B-S-FLD1
      * - bSFld2211                      COBOL Name: WS-2-11B-S-FLD2
      * - bTFld3211                      COBOL Name: WS-2-11B-T-FLD3
      * - bTFld1211                      COBOL Name: WS-2-11B-T-FLD1
      * - bTFld2211                      COBOL Name: WS-2-11B-T-FLD2
      * - aS212                          COBOL Name: WS-2-12A-S
      * - aT212                          COBOL Name: WS-2-12A-T
      *
      * @throws CFException
      */
      private void mainlineSplit12() throws Exception {
			// Declare local variables used in the method
			AT211 aT211 = aTGrp211.getAT211();
			BT211 bT211 = bTGrp211.getBT211();
			// End of variable declaration


// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-11A-S WS-2-11A-T
          aS211.initialize();
          aTGrp211.getAT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11A-S-FLD1
          aS211.setASFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11A-S-FLD2
          aS211.setASFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-11A-S TO WS-2-11A-T ( WS-ONE : LENGTH OF WS-2-11A-T )
          aTGrp211.getAT211().replace(aS211.getCharArray(),0,aS211.length(), (aTGrp211.getAT211().begin + (work.getOne()-1)) ,AT211.getAT211FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*333* WS-2-11A-S       = (' WS-2-11A-S ')'
          logger.info("*333* WS-2-11A-S       = ({})", aS211.toString()); 
//  DISPLAY '*334*   WS-2-11A-S-FLD1= (' WS-2-11A-S-FLD1 ')'
          logger.info("*334*   WS-2-11A-S-FLD1= ({})", new String(aS211.getASFld1211())); 
//  DISPLAY '*335*   WS-2-11A-S-FLD2= (' WS-2-11A-S-FLD2 ')'
          logger.info("*335*   WS-2-11A-S-FLD2= ({})", new String(aS211.getASFld2211())); 
//  DISPLAY '*336* WS-2-11A-T-GRP   = (' WS-2-11A-T-GRP ')'
          logger.info("*336* WS-2-11A-T-GRP   = ({})", aTGrp211.toString()); 
//  DISPLAY '*337* WS-2-11A-T       = (' WS-2-11A-T ')'
          logger.info("*337* WS-2-11A-T       = ({})", aTGrp211.getAT211().toString()); 
//  DISPLAY '*338*   WS-2-11A-T-FLD1= (' WS-2-11A-T-FLD1 ')'
          logger.info("*338*   WS-2-11A-T-FLD1= ({})", new String(aT211.getATFld1211())); 
  
//  DISPLAY '*339*   WS-2-11A-T-FLD2= (' WS-2-11A-T-FLD2 ')'
          logger.info("*339*   WS-2-11A-T-FLD2= ({})", new String(aT211.getATFld2211())); 
  

// *
//  INITIALIZE WS-2-11A-S WS-2-11A-T
          aS211.initialize();
          aTGrp211.getAT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11A-S-FLD1
          aS211.setASFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11A-S-FLD2
          aS211.setASFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-11A-T TO WS-2-T-LEN
          work.setTLen2((short) AT211.getAT211FieldLength());
//  MOVE WS-2-11A-S TO WS-2-11A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp211.getAT211().replace(aS211.getCharArray(),0,aS211.length(), (aTGrp211.getAT211().begin + (work.getOne()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*340* WS-2-11A-S       = (' WS-2-11A-S ')'
          logger.info("*340* WS-2-11A-S       = ({})", aS211.toString()); 
//  DISPLAY '*341*   WS-2-11A-S-FLD1= (' WS-2-11A-S-FLD1 ')'
          logger.info("*341*   WS-2-11A-S-FLD1= ({})", new String(aS211.getASFld1211())); 
//  DISPLAY '*342*   WS-2-11A-S-FLD2= (' WS-2-11A-S-FLD2 ')'
          logger.info("*342*   WS-2-11A-S-FLD2= ({})", new String(aS211.getASFld2211())); 
//  DISPLAY '*343* WS-2-11A-T-GRP   = (' WS-2-11A-T-GRP ')'
          logger.info("*343* WS-2-11A-T-GRP   = ({})", aTGrp211.toString()); 
//  DISPLAY '*344* WS-2-11A-T       = (' WS-2-11A-T ')'
          logger.info("*344* WS-2-11A-T       = ({})", aTGrp211.getAT211().toString()); 
//  DISPLAY '*345*   WS-2-11A-T-FLD1= (' WS-2-11A-T-FLD1 ')'
          logger.info("*345*   WS-2-11A-T-FLD1= ({})", new String(aT211.getATFld1211())); 
  
//  DISPLAY '*346*   WS-2-11A-T-FLD2= (' WS-2-11A-T-FLD2 ')'
          logger.info("*346*   WS-2-11A-T-FLD2= ({})", new String(aT211.getATFld2211())); 
  

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-11B-S WS-2-11B-T
          bS211.initialize();
          bTGrp211.getBT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11B-S-FLD1
          bS211.setBSFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11B-S-FLD2
          bS211.setBSFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-11B-T-FLD3
          bT211.setBTFld3211(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-11B-S TO WS-2-11B-T ( WS-ONE : LENGTH OF WS-2-11B-T )
          bTGrp211.getBT211().replace(bS211.getCharArray(),0,bS211.length(), (bTGrp211.getBT211().begin + (work.getOne()-1)) ,BT211.getBT211FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*347* WS-2-11B-S       = (' WS-2-11B-S ')'
          logger.info("*347* WS-2-11B-S       = ({})", bS211.toString()); 
//  DISPLAY '*348*   WS-2-11B-S-FLD1= (' WS-2-11B-S-FLD1 ')'
          logger.info("*348*   WS-2-11B-S-FLD1= ({})", new String(bS211.getBSFld1211())); 
//  DISPLAY '*349*   WS-2-11B-S-FLD2= (' WS-2-11B-S-FLD2 ')'
          logger.info("*349*   WS-2-11B-S-FLD2= ({})", new String(bS211.getBSFld2211())); 
//  DISPLAY '*350* WS-2-11B-T-GRP   = (' WS-2-11B-T-GRP ')'
          logger.info("*350* WS-2-11B-T-GRP   = ({})", bTGrp211.toString()); 
//  DISPLAY '*351* WS-2-11B-T       = (' WS-2-11B-T ')'
          logger.info("*351* WS-2-11B-T       = ({})", bTGrp211.getBT211().toString()); 
//  DISPLAY '*352*   WS-2-11B-T-FLD1= (' WS-2-11B-T-FLD1 ')'
          logger.info("*352*   WS-2-11B-T-FLD1= ({})", new String(bT211.getBTFld1211())); 
  
//  DISPLAY '*353*   WS-2-11B-T-FLD2= (' WS-2-11B-T-FLD2 ')'
          logger.info("*353*   WS-2-11B-T-FLD2= ({})", new String(bT211.getBTFld2211())); 
  
//  DISPLAY '*354*   WS-2-11B-T-FLD3= (' WS-2-11B-T-FLD3 ')'
          logger.info("*354*   WS-2-11B-T-FLD3= ({})", new String(bT211.getBTFld3211())); 
  

// *
//  INITIALIZE WS-2-11B-S WS-2-11B-T
          bS211.initialize();
          bTGrp211.getBT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11B-S-FLD1
          bS211.setBSFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11B-S-FLD2
          bS211.setBSFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-11B-T-FLD3
          bT211.setBTFld3211(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-11B-T TO WS-2-T-LEN
          work.setTLen2((short) BT211.getBT211FieldLength());
//  MOVE WS-2-11B-S TO WS-2-11B-T ( WS-ONE : WS-2-T-LEN )
          bTGrp211.getBT211().replace(bS211.getCharArray(),0,bS211.length(), (bTGrp211.getBT211().begin + (work.getOne()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*355* WS-2-11B-S       = (' WS-2-11B-S ')'
          logger.info("*355* WS-2-11B-S       = ({})", bS211.toString()); 
//  DISPLAY '*356*   WS-2-11B-S-FLD1= (' WS-2-11B-S-FLD1 ')'
          logger.info("*356*   WS-2-11B-S-FLD1= ({})", new String(bS211.getBSFld1211())); 
//  DISPLAY '*357*   WS-2-11B-S-FLD2= (' WS-2-11B-S-FLD2 ')'
          logger.info("*357*   WS-2-11B-S-FLD2= ({})", new String(bS211.getBSFld2211())); 
//  DISPLAY '*358* WS-2-11B-T-GRP   = (' WS-2-11B-T-GRP ')'
          logger.info("*358* WS-2-11B-T-GRP   = ({})", bTGrp211.toString()); 
//  DISPLAY '*359* WS-2-11B-T       = (' WS-2-11B-T ')'
          logger.info("*359* WS-2-11B-T       = ({})", bTGrp211.getBT211().toString()); 
//  DISPLAY '*360*   WS-2-11B-T-FLD1= (' WS-2-11B-T-FLD1 ')'
          logger.info("*360*   WS-2-11B-T-FLD1= ({})", new String(bT211.getBTFld1211())); 
  
//  DISPLAY '*361*   WS-2-11B-T-FLD2= (' WS-2-11B-T-FLD2 ')'
          logger.info("*361*   WS-2-11B-T-FLD2= ({})", new String(bT211.getBTFld2211())); 
  
//  DISPLAY '*362*   WS-2-11B-T-FLD3= (' WS-2-11B-T-FLD3 ')'
          logger.info("*362*   WS-2-11B-T-FLD3= ({})", new String(bT211.getBTFld3211())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-12A-S WS-2-12A-T
          work.setAS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp212.getAT212().initialize();
      
      }
      /**
      * mainlineSplit13 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT13 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp212                       COBOL Name: WS-2-12A-T-GRP
      * - bTGrp212                       COBOL Name: WS-2-12B-T-GRP
      * - aSGrp213                       COBOL Name: WS-2-13A-S-GRP
      * - aTGrp213                       COBOL Name: WS-2-13A-T-GRP
      *
      * Output :  

      * - aS212                          COBOL Name: WS-2-12A-S
      * - aT212                          COBOL Name: WS-2-12A-T
      * - aTFld1212                      COBOL Name: WS-2-12A-T-FLD1
      * - aTFld2212                      COBOL Name: WS-2-12A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS212                          COBOL Name: WS-2-12B-S
      * - bT212                          COBOL Name: WS-2-12B-T
      * - bTFld3212                      COBOL Name: WS-2-12B-T-FLD3
      * - bTFld1212                      COBOL Name: WS-2-12B-T-FLD1
      * - bTFld2212                      COBOL Name: WS-2-12B-T-FLD2
      * - aS213                          COBOL Name: WS-2-13A-S
      * - aT213                          COBOL Name: WS-2-13A-T
      * - aSFld1213                      COBOL Name: WS-2-13A-S-FLD1
      * - aSFld2213                      COBOL Name: WS-2-13A-S-FLD2
      * - aTFld1213                      COBOL Name: WS-2-13A-T-FLD1
      * - aTFld2213                      COBOL Name: WS-2-13A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      *
      * @throws CFException
      */
      private void mainlineSplit13() throws Exception {
			// Declare local variables used in the method
			AT212 aT212 = aTGrp212.getAT212();
			BT212 bT212 = bTGrp212.getBT212();
			AS213 aS213 = aSGrp213.getAS213();
			AT213 aT213 = aTGrp213.getAT213();
			// End of variable declaration

          // MOVE ALL 'ABCD' TO WS-2-12A-S
          work.setAS212(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-12A-S TO WS-2-12A-T ( WS-ONE : LENGTH OF WS-2-12A-T )
          aTGrp212.setAT212(work.getAS212(),0,work.getAS212().length,(work.getOne()-1),AT212.getAT212FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*363* WS-2-12A-S       = (' WS-2-12A-S ')'
          logger.info("*363* WS-2-12A-S       = ({})", new String(work.getAS212())); 
//  DISPLAY '*364* WS-2-12A-T-GRP   = (' WS-2-12A-T-GRP ')'
          logger.info("*364* WS-2-12A-T-GRP   = ({})", aTGrp212.toString()); 
//  DISPLAY '*365* WS-2-12A-T       = (' WS-2-12A-T ')'
          logger.info("*365* WS-2-12A-T       = ({})", aTGrp212.getAT212().toString()); 
//  DISPLAY '*366*   WS-2-12A-T-FLD1= (' WS-2-12A-T-FLD1 ')'
          logger.info("*366*   WS-2-12A-T-FLD1= ({})", new String(aT212.getATFld1212())); 
  
//  DISPLAY '*367*   WS-2-12A-T-FLD2= (' WS-2-12A-T-FLD2 ')'
          logger.info("*367*   WS-2-12A-T-FLD2= ({})", new String(aT212.getATFld2212())); 
  

// *
// *
//  INITIALIZE WS-2-12A-S WS-2-12A-T
          work.setAS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp212.getAT212().initialize();
          // MOVE ALL 'ABCD' TO WS-2-12A-S
          work.setAS212(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-12A-T TO WS-2-T-LEN
          work.setTLen2((short) AT212.getAT212FieldLength());
//  MOVE WS-2-12A-S TO WS-2-12A-T ( WS-ONE : WS-2-T-LEN )
          aTGrp212.setAT212(work.getAS212(),0,work.getAS212().length,(work.getOne()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*368* WS-2-12A-S       = (' WS-2-12A-S ')'
          logger.info("*368* WS-2-12A-S       = ({})", new String(work.getAS212())); 
//  DISPLAY '*369* WS-2-12A-T-GRP   = (' WS-2-12A-T-GRP ')'
          logger.info("*369* WS-2-12A-T-GRP   = ({})", aTGrp212.toString()); 
//  DISPLAY '*370* WS-2-12A-T       = (' WS-2-12A-T ')'
          logger.info("*370* WS-2-12A-T       = ({})", aTGrp212.getAT212().toString()); 
//  DISPLAY '*371*   WS-2-12A-T-FLD1= (' WS-2-12A-T-FLD1 ')'
          logger.info("*371*   WS-2-12A-T-FLD1= ({})", new String(aT212.getATFld1212())); 
  
//  DISPLAY '*372*   WS-2-12A-T-FLD2= (' WS-2-12A-T-FLD2 ')'
          logger.info("*372*   WS-2-12A-T-FLD2= ({})", new String(aT212.getATFld2212())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-12B-S WS-2-12B-T
          work.setBS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp212.getBT212().initialize();
          // MOVE ALL 'ABCD' TO WS-2-12B-S
          work.setBS212(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-12B-T-FLD3
          bT212.setBTFld3212(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-12B-S TO WS-2-12B-T ( WS-ONE : LENGTH OF WS-2-12B-T )
          bTGrp212.setBT212(work.getBS212(),0,work.getBS212().length,(work.getOne()-1),BT212.getBT212FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*373* WS-2-12B-S       = (' WS-2-12B-S ')'
          logger.info("*373* WS-2-12B-S       = ({})", new String(work.getBS212())); 
//  DISPLAY '*374* WS-2-12B-T-GRP   = (' WS-2-12B-T-GRP ')'
          logger.info("*374* WS-2-12B-T-GRP   = ({})", bTGrp212.toString()); 
//  DISPLAY '*375* WS-2-12B-T       = (' WS-2-12B-T ')'
          logger.info("*375* WS-2-12B-T       = ({})", bTGrp212.getBT212().toString()); 
//  DISPLAY '*376*   WS-2-12B-T-FLD1= (' WS-2-12B-T-FLD1 ')'
          logger.info("*376*   WS-2-12B-T-FLD1= ({})", new String(bT212.getBTFld1212())); 
  
//  DISPLAY '*377*   WS-2-12B-T-FLD2= (' WS-2-12B-T-FLD2 ')'
          logger.info("*377*   WS-2-12B-T-FLD2= ({})", new String(bT212.getBTFld2212())); 
  
//  DISPLAY '*378*   WS-2-12B-T-FLD3= (' WS-2-12B-T-FLD3 ')'
          logger.info("*378*   WS-2-12B-T-FLD3= ({})", new String(bT212.getBTFld3212())); 
  

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-13A-S WS-2-13A-T
          aSGrp213.getAS213().initialize();
          aTGrp213.getAT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13A-S-FLD1
          aS213.setASFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-13A-S-FLD2
          aS213.setASFld2213(CONSTANTS.LITERAL_645286444);
  
//  MOVE WS-2-13A-S ( WS-THREE : LENGTH OF WS-2-13A-S - 3 ) TO WS-2-13A-T ( WS-FIVE : LENGTH OF WS-2-13A-T - 5)
          aTGrp213.replace(aSGrp213/*parent*/,3+work.getThree() - 1/*fromOffset - (aT213) */,AS213.getAS213FieldLength() - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (aS213) */,AT213.getAT213FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*379* WS-2-13A-S-GRP   = (' WS-2-13A-S-GRP ')'
          logger.info("*379* WS-2-13A-S-GRP   = ({})", aSGrp213.toString()); 
//  DISPLAY '*380* WS-2-13A-S       = (' WS-2-13A-S ')'
          logger.info("*380* WS-2-13A-S       = ({})", aSGrp213.getAS213().toString()); 
//  DISPLAY '*381*   WS-2-13A-S-FLD1= (' WS-2-13A-S-FLD1 ')'
          logger.info("*381*   WS-2-13A-S-FLD1= ({})", new String(aS213.getASFld1213())); 
  
//  DISPLAY '*382*   WS-2-13A-S-FLD2= (' WS-2-13A-S-FLD2 ')'
          logger.info("*382*   WS-2-13A-S-FLD2= ({})", new String(aS213.getASFld2213())); 
  
//  DISPLAY '*383* WS-2-13A-T-GRP   = (' WS-2-13A-T-GRP ')'
          logger.info("*383* WS-2-13A-T-GRP   = ({})", aTGrp213.toString()); 
//  DISPLAY '*384* WS-2-13A-T       = (' WS-2-13A-T ')'
          logger.info("*384* WS-2-13A-T       = ({})", aTGrp213.getAT213().toString()); 
//  DISPLAY '*385*   WS-2-13A-T-FLD1= (' WS-2-13A-T-FLD1 ')'
          logger.info("*385*   WS-2-13A-T-FLD1= ({})", new String(aT213.getATFld1213())); 
  
//  DISPLAY '*386*   WS-2-13A-T-FLD2= (' WS-2-13A-T-FLD2 ')'
          logger.info("*386*   WS-2-13A-T-FLD2= ({})", new String(aT213.getATFld2213())); 
  

// *
//  INITIALIZE WS-2-13A-S WS-2-13A-T
          aSGrp213.getAS213().initialize();
          aTGrp213.getAT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13A-S-FLD1
          aS213.setASFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-13A-S-FLD2
          aS213.setASFld2213(CONSTANTS.LITERAL_645286444);
  
//  MOVE LENGTH OF WS-2-13A-S TO WS-2-S-LEN
          work.setSLen2((short) AS213.getAS213FieldLength());
//  MOVE LENGTH OF WS-2-13A-T TO WS-2-T-LEN
          work.setTLen2((short) AT213.getAT213FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-13A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-13A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp213.replace(aSGrp213/*parent*/,3+work.getThree() - 1/*fromOffset - (aT213) */,work.getSLen2()/*fromLen*/,5+work.getFive() - 1/*toOffset - (aS213) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*387* WS-2-13A-S-GRP   = (' WS-2-13A-S-GRP ')'
          logger.info("*387* WS-2-13A-S-GRP   = ({})", aSGrp213.toString()); 
//  DISPLAY '*388* WS-2-13A-S       = (' WS-2-13A-S ')'
          logger.info("*388* WS-2-13A-S       = ({})", aSGrp213.getAS213().toString()); 
//  DISPLAY '*389*   WS-2-13A-S-FLD1= (' WS-2-13A-S-FLD1 ')'
          logger.info("*389*   WS-2-13A-S-FLD1= ({})", new String(aS213.getASFld1213())); 
  
//  DISPLAY '*390*   WS-2-13A-S-FLD2= (' WS-2-13A-S-FLD2 ')'
          logger.info("*390*   WS-2-13A-S-FLD2= ({})", new String(aS213.getASFld2213())); 
  
//  DISPLAY '*391* WS-2-13A-T-GRP   = (' WS-2-13A-T-GRP ')'
          logger.info("*391* WS-2-13A-T-GRP   = ({})", aTGrp213.toString()); 
      
      }
      /**
      * mainlineSplit14 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT14 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aT213                          COBOL Name: WS-2-13A-T
      * - aTFld1213                      COBOL Name: WS-2-13A-T-FLD1
      * - aTFld2213                      COBOL Name: WS-2-13A-T-FLD2
      * - bSGrp213                       COBOL Name: WS-2-13B-S-GRP
      * - bTGrp213                       COBOL Name: WS-2-13B-T-GRP
      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      *
      * Output :  

      * - bS213                          COBOL Name: WS-2-13B-S
      * - bT213                          COBOL Name: WS-2-13B-T
      * - bSFld1213                      COBOL Name: WS-2-13B-S-FLD1
      * - bSFld2213                      COBOL Name: WS-2-13B-S-FLD2
      * - bTFld3213                      COBOL Name: WS-2-13B-T-FLD3
      * - bTFld1213                      COBOL Name: WS-2-13B-T-FLD1
      * - bTFld2213                      COBOL Name: WS-2-13B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS214                          COBOL Name: WS-2-14A-S
      * - aT214                          COBOL Name: WS-2-14A-T
      * - aTFld1214                      COBOL Name: WS-2-14A-T-FLD1
      * - aTFld2214                      COBOL Name: WS-2-14A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit14() throws Exception {
			// Declare local variables used in the method
			AT213 aT213 = aTGrp213.getAT213();
			BS213 bS213 = bSGrp213.getBS213();
			BT213 bT213 = bTGrp213.getBT213();
			 final int A_S_214_LENGTH = 70;
			AT214 aT214 = aTGrp214.getAT214();
			// End of variable declaration

//  DISPLAY '*392* WS-2-13A-T       = (' WS-2-13A-T ')'
          logger.info("*392* WS-2-13A-T       = ({})", aTGrp213.getAT213().toString()); 
//  DISPLAY '*393*   WS-2-13A-T-FLD1= (' WS-2-13A-T-FLD1 ')'
          logger.info("*393*   WS-2-13A-T-FLD1= ({})", new String(aT213.getATFld1213())); 
  
//  DISPLAY '*394*   WS-2-13A-T-FLD2= (' WS-2-13A-T-FLD2 ')'
          logger.info("*394*   WS-2-13A-T-FLD2= ({})", new String(aT213.getATFld2213())); 
  

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-13B-S WS-2-13B-T
          bSGrp213.getBS213().initialize();
          bTGrp213.getBT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13B-S-FLD1
          bS213.setBSFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-13B-S-FLD2
          bS213.setBSFld2213(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-13B-T-FLD3
          bT213.setBTFld3213(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-13B-S ( WS-THREE : LENGTH OF WS-2-13B-S - 3 ) TO WS-2-13B-T ( WS-FIVE : LENGTH OF WS-2-13B-T - 5)
          bTGrp213.replace(bSGrp213/*parent*/,3+work.getThree() - 1/*fromOffset - (bT213) */,BS213.getBS213FieldLength() - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (bS213) */,BT213.getBT213FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*395* WS-2-13B-S-GRP   = (' WS-2-13B-S-GRP ')'
          logger.info("*395* WS-2-13B-S-GRP   = ({})", bSGrp213.toString()); 
//  DISPLAY '*396* WS-2-13B-S       = (' WS-2-13B-S ')'
          logger.info("*396* WS-2-13B-S       = ({})", bSGrp213.getBS213().toString()); 
//  DISPLAY '*397*   WS-2-13B-S-FLD1= (' WS-2-13B-S-FLD1 ')'
          logger.info("*397*   WS-2-13B-S-FLD1= ({})", new String(bS213.getBSFld1213())); 
  
//  DISPLAY '*398*   WS-2-13B-S-FLD2= (' WS-2-13B-S-FLD2 ')'
          logger.info("*398*   WS-2-13B-S-FLD2= ({})", new String(bS213.getBSFld2213())); 
  
//  DISPLAY '*399* WS-2-13B-T-GRP   = (' WS-2-13B-T-GRP ')'
          logger.info("*399* WS-2-13B-T-GRP   = ({})", bTGrp213.toString()); 
//  DISPLAY '*400* WS-2-13B-T       = (' WS-2-13B-T ')'
          logger.info("*400* WS-2-13B-T       = ({})", bTGrp213.getBT213().toString()); 
//  DISPLAY '*401*   WS-2-13B-T-FLD1= (' WS-2-13B-T-FLD1 ')'
          logger.info("*401*   WS-2-13B-T-FLD1= ({})", new String(bT213.getBTFld1213())); 
  
//  DISPLAY '*402*   WS-2-13B-T-FLD2= (' WS-2-13B-T-FLD2 ')'
          logger.info("*402*   WS-2-13B-T-FLD2= ({})", new String(bT213.getBTFld2213())); 
  
//  DISPLAY '*403*   WS-2-13B-T-FLD3= (' WS-2-13B-T-FLD3 ')'
          logger.info("*403*   WS-2-13B-T-FLD3= ({})", new String(bT213.getBTFld3213())); 
  

// *
//  INITIALIZE WS-2-13B-S WS-2-13B-T
          bSGrp213.getBS213().initialize();
          bTGrp213.getBT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13B-S-FLD1
          bS213.setBSFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-13B-S-FLD2
          bS213.setBSFld2213(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-13B-T-FLD3
          bT213.setBTFld3213(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-13B-S TO WS-2-S-LEN
          work.setSLen2((short) BS213.getBS213FieldLength());
//  MOVE LENGTH OF WS-2-13B-T TO WS-2-T-LEN
          work.setTLen2((short) BT213.getBT213FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-13B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-13B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp213.replace(bSGrp213/*parent*/,3+work.getThree() - 1/*fromOffset - (bT213) */,work.getSLen2()/*fromLen*/,5+work.getFive() - 1/*toOffset - (bS213) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*404* WS-2-13B-S-GRP   = (' WS-2-13B-S-GRP ')'
          logger.info("*404* WS-2-13B-S-GRP   = ({})", bSGrp213.toString()); 
//  DISPLAY '*405* WS-2-13B-S       = (' WS-2-13B-S ')'
          logger.info("*405* WS-2-13B-S       = ({})", bSGrp213.getBS213().toString()); 
//  DISPLAY '*406*   WS-2-13B-S-FLD1= (' WS-2-13B-S-FLD1 ')'
          logger.info("*406*   WS-2-13B-S-FLD1= ({})", new String(bS213.getBSFld1213())); 
  
//  DISPLAY '*407*   WS-2-13B-S-FLD2= (' WS-2-13B-S-FLD2 ')'
          logger.info("*407*   WS-2-13B-S-FLD2= ({})", new String(bS213.getBSFld2213())); 
  
//  DISPLAY '*408* WS-2-13B-T-GRP   = (' WS-2-13B-T-GRP ')'
          logger.info("*408* WS-2-13B-T-GRP   = ({})", bTGrp213.toString()); 
//  DISPLAY '*409* WS-2-13B-T       = (' WS-2-13B-T ')'
          logger.info("*409* WS-2-13B-T       = ({})", bTGrp213.getBT213().toString()); 
//  DISPLAY '*410*   WS-2-13B-T-FLD1= (' WS-2-13B-T-FLD1 ')'
          logger.info("*410*   WS-2-13B-T-FLD1= ({})", new String(bT213.getBTFld1213())); 
  
//  DISPLAY '*411*   WS-2-13B-T-FLD2= (' WS-2-13B-T-FLD2 ')'
          logger.info("*411*   WS-2-13B-T-FLD2= ({})", new String(bT213.getBTFld2213())); 
  
//  DISPLAY '*412*   WS-2-13B-T-FLD3= (' WS-2-13B-T-FLD3 ')'
          logger.info("*412*   WS-2-13B-T-FLD3= ({})", new String(bT213.getBTFld3213())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-14A-S WS-2-14A-T
          aSGrp214.setAS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp214.getAT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14A-S
          aSGrp214.setAS214(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-14A-S ( WS-THREE : LENGTH OF WS-2-14A-S - 3 ) TO WS-2-14A-T ( WS-FIVE : LENGTH OF WS-2-14A-T - 5)
          aTGrp214.replace(aSGrp214/*parent*/,3+work.getThree() - 1/*fromOffset - (aT214) */,A_S_214_LENGTH - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (aS214) */,AT214.getAT214FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*413* WS-2-14A-S-GRP   = (' WS-2-14A-S-GRP ')'
          logger.info("*413* WS-2-14A-S-GRP   = ({})", aSGrp214.toString()); 
//  DISPLAY '*414* WS-2-14A-S       = (' WS-2-14A-S ')'
          logger.info("*414* WS-2-14A-S       = ({})", new String(aSGrp214.getAS214())); 
//  DISPLAY '*415* WS-2-14A-T-GRP   = (' WS-2-14A-T-GRP ')'
          logger.info("*415* WS-2-14A-T-GRP   = ({})", aTGrp214.toString()); 
//  DISPLAY '*416* WS-2-14A-T       = (' WS-2-14A-T ')'
          logger.info("*416* WS-2-14A-T       = ({})", aTGrp214.getAT214().toString()); 
//  DISPLAY '*417*   WS-2-14A-T-FLD1= (' WS-2-14A-T-FLD1 ')'
          logger.info("*417*   WS-2-14A-T-FLD1= ({})", new String(aT214.getATFld1214())); 
  
//  DISPLAY '*418*   WS-2-14A-T-FLD2= (' WS-2-14A-T-FLD2 ')'
          logger.info("*418*   WS-2-14A-T-FLD2= ({})", new String(aT214.getATFld2214())); 
  

// *
//  INITIALIZE WS-2-14A-S WS-2-14A-T
          aSGrp214.setAS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp214.getAT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14A-S
          aSGrp214.setAS214(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-14A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_214_LENGTH);
//  MOVE LENGTH OF WS-2-14A-T TO WS-2-T-LEN
          work.setTLen2((short) AT214.getAT214FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-14A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-14A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp214.replace(aSGrp214/*parent*/,3+work.getThree() - 1/*fromOffset - (aT214) */,work.getSLen2()/*fromLen*/,5+work.getFive() - 1/*toOffset - (aS214) */,work.getTLen2()/*toLen*/);
      
      }
      /**
      * mainlineSplit15 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT15 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aS214                          COBOL Name: WS-2-14A-S
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      * - aT214                          COBOL Name: WS-2-14A-T
      * - aTFld1214                      COBOL Name: WS-2-14A-T-FLD1
      * - aTFld2214                      COBOL Name: WS-2-14A-T-FLD2
      * - bSGrp214                       COBOL Name: WS-2-14B-S-GRP
      * - bTGrp214                       COBOL Name: WS-2-14B-T-GRP
      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      *
      * Output :  

      * - bS214                          COBOL Name: WS-2-14B-S
      * - bT214                          COBOL Name: WS-2-14B-T
      * - bTFld3214                      COBOL Name: WS-2-14B-T-FLD3
      * - bTFld1214                      COBOL Name: WS-2-14B-T-FLD1
      * - bTFld2214                      COBOL Name: WS-2-14B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS215                          COBOL Name: WS-2-15A-S
      * - aT215                          COBOL Name: WS-2-15A-T
      * - aSFld1215                      COBOL Name: WS-2-15A-S-FLD1
      * - aSFld2215                      COBOL Name: WS-2-15A-S-FLD2
      * - aTFld1215                      COBOL Name: WS-2-15A-T-FLD1
      * - aTFld2215                      COBOL Name: WS-2-15A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit15() throws Exception {
			// Declare local variables used in the method
			AT214 aT214 = aTGrp214.getAT214();
			BT214 bT214 = bTGrp214.getBT214();
			 final int B_S_214_LENGTH = 70;
			AS215 aS215 = aSGrp215.getAS215();
			// End of variable declaration


// *
//  DISPLAY '*419* WS-2-14A-S-GRP   = (' WS-2-14A-S-GRP ')'
          logger.info("*419* WS-2-14A-S-GRP   = ({})", aSGrp214.toString()); 
//  DISPLAY '*420* WS-2-14A-S       = (' WS-2-14A-S ')'
          logger.info("*420* WS-2-14A-S       = ({})", new String(aSGrp214.getAS214())); 
//  DISPLAY '*421* WS-2-14A-T-GRP   = (' WS-2-14A-T-GRP ')'
          logger.info("*421* WS-2-14A-T-GRP   = ({})", aTGrp214.toString()); 
//  DISPLAY '*422* WS-2-14A-T       = (' WS-2-14A-T ')'
          logger.info("*422* WS-2-14A-T       = ({})", aTGrp214.getAT214().toString()); 
//  DISPLAY '*423*   WS-2-14A-T-FLD1= (' WS-2-14A-T-FLD1 ')'
          logger.info("*423*   WS-2-14A-T-FLD1= ({})", new String(aT214.getATFld1214())); 
  
//  DISPLAY '*424*   WS-2-14A-T-FLD2= (' WS-2-14A-T-FLD2 ')'
          logger.info("*424*   WS-2-14A-T-FLD2= ({})", new String(aT214.getATFld2214())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-14B-S WS-2-14B-T
          bSGrp214.setBS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp214.getBT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14B-S
          bSGrp214.setBS214(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-14B-T-FLD3
          bT214.setBTFld3214(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-14B-S ( WS-THREE : LENGTH OF WS-2-14B-S - 3 ) TO WS-2-14B-T ( WS-FIVE : LENGTH OF WS-2-14B-T - 5)
          bTGrp214.replace(bSGrp214/*parent*/,3+work.getThree() - 1/*fromOffset - (bT214) */,B_S_214_LENGTH - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (bS214) */,BT214.getBT214FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*425* WS-2-14B-S-GRP   = (' WS-2-14B-S-GRP ')'
          logger.info("*425* WS-2-14B-S-GRP   = ({})", bSGrp214.toString()); 
//  DISPLAY '*426* WS-2-14B-S       = (' WS-2-14B-S ')'
          logger.info("*426* WS-2-14B-S       = ({})", new String(bSGrp214.getBS214())); 
//  DISPLAY '*427* WS-2-14B-T-GRP   = (' WS-2-14B-T-GRP ')'
          logger.info("*427* WS-2-14B-T-GRP   = ({})", bTGrp214.toString()); 
//  DISPLAY '*428* WS-2-14B-T       = (' WS-2-14B-T ')'
          logger.info("*428* WS-2-14B-T       = ({})", bTGrp214.getBT214().toString()); 
//  DISPLAY '*429*   WS-2-14B-T-FLD1= (' WS-2-14B-T-FLD1 ')'
          logger.info("*429*   WS-2-14B-T-FLD1= ({})", new String(bT214.getBTFld1214())); 
  
//  DISPLAY '*430*   WS-2-14B-T-FLD2= (' WS-2-14B-T-FLD2 ')'
          logger.info("*430*   WS-2-14B-T-FLD2= ({})", new String(bT214.getBTFld2214())); 
  
//  DISPLAY '*431*   WS-2-14B-T-FLD3= (' WS-2-14B-T-FLD3 ')'
          logger.info("*431*   WS-2-14B-T-FLD3= ({})", new String(bT214.getBTFld3214())); 
  

// *
//  INITIALIZE WS-2-14B-S WS-2-14B-T
          bSGrp214.setBS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp214.getBT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14B-S
          bSGrp214.setBS214(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-14B-T-FLD3
          bT214.setBTFld3214(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-14B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_214_LENGTH);
//  MOVE LENGTH OF WS-2-14B-T TO WS-2-T-LEN
          work.setTLen2((short) BT214.getBT214FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-14B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-14B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp214.replace(bSGrp214/*parent*/,3+work.getThree() - 1/*fromOffset - (bT214) */,work.getSLen2()/*fromLen*/,5+work.getFive() - 1/*toOffset - (bS214) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*432* WS-2-14B-S-GRP   = (' WS-2-14B-S-GRP ')'
          logger.info("*432* WS-2-14B-S-GRP   = ({})", bSGrp214.toString()); 
//  DISPLAY '*433* WS-2-14B-S       = (' WS-2-14B-S ')'
          logger.info("*433* WS-2-14B-S       = ({})", new String(bSGrp214.getBS214())); 
//  DISPLAY '*434* WS-2-14B-T-GRP   = (' WS-2-14B-T-GRP ')'
          logger.info("*434* WS-2-14B-T-GRP   = ({})", bTGrp214.toString()); 
//  DISPLAY '*435* WS-2-14B-T       = (' WS-2-14B-T ')'
          logger.info("*435* WS-2-14B-T       = ({})", bTGrp214.getBT214().toString()); 
//  DISPLAY '*436*   WS-2-14B-T-FLD1= (' WS-2-14B-T-FLD1 ')'
          logger.info("*436*   WS-2-14B-T-FLD1= ({})", new String(bT214.getBTFld1214())); 
  
//  DISPLAY '*437*   WS-2-14B-T-FLD2= (' WS-2-14B-T-FLD2 ')'
          logger.info("*437*   WS-2-14B-T-FLD2= ({})", new String(bT214.getBTFld2214())); 
  
//  DISPLAY '*438*   WS-2-14B-T-FLD3= (' WS-2-14B-T-FLD3 ')'
          logger.info("*438*   WS-2-14B-T-FLD3= ({})", new String(bT214.getBTFld3214())); 
  

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-15A-S WS-2-15A-T
          aSGrp215.getAS215().initialize();
          aT215.initialize();
//  MOVE ALL 'ABCD' TO WS-2-15A-S-FLD1
          aS215.setASFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-15A-S-FLD2
          aS215.setASFld2215(CONSTANTS.LITERAL_645286444);
  
//  MOVE WS-2-15A-S ( WS-THREE : LENGTH OF WS-2-15A-S - 3 ) TO WS-2-15A-T ( WS-FIVE : LENGTH OF WS-2-15A-T - 5)
          aT215.replace(aSGrp215/*parent*/,3+work.getThree() - 1/*fromOffset - (aT215) */,AS215.getAS215FieldLength() - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (aS215) */,AT215.getAT215FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*439* WS-2-15A-S-GRP   = (' WS-2-15A-S-GRP ')'
          logger.info("*439* WS-2-15A-S-GRP   = ({})", aSGrp215.toString()); 
//  DISPLAY '*440* WS-2-15A-S       = (' WS-2-15A-S ')'
          logger.info("*440* WS-2-15A-S       = ({})", aSGrp215.getAS215().toString()); 
//  DISPLAY '*441*   WS-2-15A-S-FLD1= (' WS-2-15A-S-FLD1 ')'
          logger.info("*441*   WS-2-15A-S-FLD1= ({})", new String(aS215.getASFld1215())); 
  
//  DISPLAY '*442*   WS-2-15A-S-FLD2= (' WS-2-15A-S-FLD2 ')'
          logger.info("*442*   WS-2-15A-S-FLD2= ({})", new String(aS215.getASFld2215())); 
  
//  DISPLAY '*443* WS-2-15A-T       = (' WS-2-15A-T ')'
          logger.info("*443* WS-2-15A-T       = ({})", aT215.toString()); 
//  DISPLAY '*444*   WS-2-15A-T-FLD1= (' WS-2-15A-T-FLD1 ')'
          logger.info("*444*   WS-2-15A-T-FLD1= ({})", new String(aT215.getATFld1215())); 
//  DISPLAY '*445*   WS-2-15A-T-FLD2= (' WS-2-15A-T-FLD2 ')'
          logger.info("*445*   WS-2-15A-T-FLD2= ({})", new String(aT215.getATFld2215())); 

// *
//  INITIALIZE WS-2-15A-S WS-2-15A-T
          aSGrp215.getAS215().initialize();
          aT215.initialize();
//  MOVE ALL 'ABCD' TO WS-2-15A-S-FLD1
          aS215.setASFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-15A-S-FLD2
          aS215.setASFld2215(CONSTANTS.LITERAL_645286444);
  
//  MOVE LENGTH OF WS-2-15A-S TO WS-2-S-LEN
          work.setSLen2((short) AS215.getAS215FieldLength());
//  MOVE LENGTH OF WS-2-15A-T TO WS-2-T-LEN
          work.setTLen2((short) AT215.getAT215FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-15A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-15A-T ( WS-FIVE : WS-2-T-LEN )
          aT215.replace(aSGrp215/*parent*/,3+work.getThree() - 1/*fromOffset - (aT215) */,work.getSLen2()/*fromLen*/,0+work.getFive() - 1/*toOffset - (aS215) */,work.getTLen2()/*toLen*/);
      
      }
      /**
      * mainlineSplit16 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT16 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      * - aS215                          COBOL Name: WS-2-15A-S
      * - aSFld1215                      COBOL Name: WS-2-15A-S-FLD1
      * - aSFld2215                      COBOL Name: WS-2-15A-S-FLD2
      * - aT215                          COBOL Name: WS-2-15A-T
      * - aTFld1215                      COBOL Name: WS-2-15A-T-FLD1
      * - aTFld2215                      COBOL Name: WS-2-15A-T-FLD2
      * - bSGrp215                       COBOL Name: WS-2-15B-S-GRP
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      *
      * Output :  

      * - bS215                          COBOL Name: WS-2-15B-S
      * - bT215                          COBOL Name: WS-2-15B-T
      * - bSFld1215                      COBOL Name: WS-2-15B-S-FLD1
      * - bSFld2215                      COBOL Name: WS-2-15B-S-FLD2
      * - bTFld3215                      COBOL Name: WS-2-15B-T-FLD3
      * - bTFld1215                      COBOL Name: WS-2-15B-T-FLD1
      * - bTFld2215                      COBOL Name: WS-2-15B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS216                          COBOL Name: WS-2-16A-S
      * - aT216                          COBOL Name: WS-2-16A-T
      * - aTFld1216                      COBOL Name: WS-2-16A-T-FLD1
      * - aTFld2216                      COBOL Name: WS-2-16A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit16() throws Exception {
			// Declare local variables used in the method
			AS215 aS215 = aSGrp215.getAS215();
			BS215 bS215 = bSGrp215.getBS215();
			 final int A_S_216_LENGTH = 70;
			// End of variable declaration


// *
//  DISPLAY '*446* WS-2-15A-S-GRP   = (' WS-2-15A-S-GRP ')'
          logger.info("*446* WS-2-15A-S-GRP   = ({})", aSGrp215.toString()); 
//  DISPLAY '*447* WS-2-15A-S       = (' WS-2-15A-S ')'
          logger.info("*447* WS-2-15A-S       = ({})", aSGrp215.getAS215().toString()); 
//  DISPLAY '*448*   WS-2-15A-S-FLD1= (' WS-2-15A-S-FLD1 ')'
          logger.info("*448*   WS-2-15A-S-FLD1= ({})", new String(aS215.getASFld1215())); 
  
//  DISPLAY '*449*   WS-2-15A-S-FLD2= (' WS-2-15A-S-FLD2 ')'
          logger.info("*449*   WS-2-15A-S-FLD2= ({})", new String(aS215.getASFld2215())); 
  
//  DISPLAY '*450* WS-2-15A-T       = (' WS-2-15A-T ')'
          logger.info("*450* WS-2-15A-T       = ({})", aT215.toString()); 
//  DISPLAY '*451*   WS-2-15A-T-FLD1= (' WS-2-15A-T-FLD1 ')'
          logger.info("*451*   WS-2-15A-T-FLD1= ({})", new String(aT215.getATFld1215())); 
//  DISPLAY '*452*   WS-2-15A-T-FLD2= (' WS-2-15A-T-FLD2 ')'
          logger.info("*452*   WS-2-15A-T-FLD2= ({})", new String(aT215.getATFld2215())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-15B-S WS-2-15B-T
          bSGrp215.getBS215().initialize();
          bT215.initialize();
//  MOVE ALL 'ABCD' TO WS-2-15B-S-FLD1
          bS215.setBSFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-15B-S-FLD2
          bS215.setBSFld2215(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-15B-T-FLD3
          bT215.setBTFld3215(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-15B-S ( WS-THREE : LENGTH OF WS-2-15B-S - 3 ) TO WS-2-15B-T ( WS-FIVE : LENGTH OF WS-2-15B-T - 5)
          bT215.replace(bSGrp215/*parent*/,3+work.getThree() - 1/*fromOffset - (bT215) */,BS215.getBS215FieldLength() - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (bS215) */,BT215.getBT215FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*453* WS-2-15B-S-GRP   = (' WS-2-15B-S-GRP ')'
          logger.info("*453* WS-2-15B-S-GRP   = ({})", bSGrp215.toString()); 
//  DISPLAY '*454* WS-2-15B-S       = (' WS-2-15B-S ')'
          logger.info("*454* WS-2-15B-S       = ({})", bSGrp215.getBS215().toString()); 
//  DISPLAY '*455*   WS-2-15B-S-FLD1= (' WS-2-15B-S-FLD1 ')'
          logger.info("*455*   WS-2-15B-S-FLD1= ({})", new String(bS215.getBSFld1215())); 
  
//  DISPLAY '*456*   WS-2-15B-S-FLD2= (' WS-2-15B-S-FLD2 ')'
          logger.info("*456*   WS-2-15B-S-FLD2= ({})", new String(bS215.getBSFld2215())); 
  
//  DISPLAY '*457* WS-2-15B-T       = (' WS-2-15B-T ')'
          logger.info("*457* WS-2-15B-T       = ({})", bT215.toString()); 
//  DISPLAY '*458*   WS-2-15B-T-FLD1= (' WS-2-15B-T-FLD1 ')'
          logger.info("*458*   WS-2-15B-T-FLD1= ({})", new String(bT215.getBTFld1215())); 
//  DISPLAY '*459*   WS-2-15B-T-FLD2= (' WS-2-15B-T-FLD2 ')'
          logger.info("*459*   WS-2-15B-T-FLD2= ({})", new String(bT215.getBTFld2215())); 
//  DISPLAY '*460*   WS-2-15B-T-FLD3= (' WS-2-15B-T-FLD3 ')'
          logger.info("*460*   WS-2-15B-T-FLD3= ({})", new String(bT215.getBTFld3215())); 

// *
//  INITIALIZE WS-2-15B-S WS-2-15B-T
          bSGrp215.getBS215().initialize();
          bT215.initialize();
//  MOVE ALL 'ABCD' TO WS-2-15B-S-FLD1
          bS215.setBSFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WS-2-15B-S-FLD2
          bS215.setBSFld2215(CONSTANTS.LITERAL_645286444);
  
//  MOVE ALL 'MNOP' TO WS-2-15B-T-FLD3
          bT215.setBTFld3215(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-15B-S TO WS-2-S-LEN
          work.setSLen2((short) BS215.getBS215FieldLength());
//  MOVE LENGTH OF WS-2-15B-T TO WS-2-T-LEN
          work.setTLen2((short) BT215.getBT215FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-15B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-15B-T ( WS-FIVE : WS-2-T-LEN )
          bT215.replace(bSGrp215/*parent*/,3+work.getThree() - 1/*fromOffset - (bT215) */,work.getSLen2()/*fromLen*/,0+work.getFive() - 1/*toOffset - (bS215) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*461* WS-2-15B-S-GRP   = (' WS-2-15B-S-GRP ')'
          logger.info("*461* WS-2-15B-S-GRP   = ({})", bSGrp215.toString()); 
//  DISPLAY '*462* WS-2-15B-S       = (' WS-2-15B-S ')'
          logger.info("*462* WS-2-15B-S       = ({})", bSGrp215.getBS215().toString()); 
//  DISPLAY '*463*   WS-2-15B-S-FLD1= (' WS-2-15B-S-FLD1 ')'
          logger.info("*463*   WS-2-15B-S-FLD1= ({})", new String(bS215.getBSFld1215())); 
  
//  DISPLAY '*464*   WS-2-15B-S-FLD2= (' WS-2-15B-S-FLD2 ')'
          logger.info("*464*   WS-2-15B-S-FLD2= ({})", new String(bS215.getBSFld2215())); 
  
//  DISPLAY '*465* WS-2-15B-T       = (' WS-2-15B-T ')'
          logger.info("*465* WS-2-15B-T       = ({})", bT215.toString()); 
//  DISPLAY '*466*   WS-2-15B-T-FLD1= (' WS-2-15B-T-FLD1 ')'
          logger.info("*466*   WS-2-15B-T-FLD1= ({})", new String(bT215.getBTFld1215())); 
//  DISPLAY '*467*   WS-2-15B-T-FLD2= (' WS-2-15B-T-FLD2 ')'
          logger.info("*467*   WS-2-15B-T-FLD2= ({})", new String(bT215.getBTFld2215())); 
//  DISPLAY '*468*   WS-2-15B-T-FLD3= (' WS-2-15B-T-FLD3 ')'
          logger.info("*468*   WS-2-15B-T-FLD3= ({})", new String(bT215.getBTFld3215())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-16A-S WS-2-16A-T
          aSGrp216.setAS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT216.initialize();
//  MOVE ALL 'ABCD' TO WS-2-16A-S
          aSGrp216.setAS216(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-16A-S ( WS-THREE : LENGTH OF WS-2-16A-S - 3 ) TO WS-2-16A-T ( WS-FIVE : LENGTH OF WS-2-16A-T - 5)
          aT216.replace(aSGrp216/*parent*/,3+work.getThree() - 1/*fromOffset - (aT216) */,A_S_216_LENGTH - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (aS216) */,AT216.getAT216FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*469* WS-2-16A-S-GRP   = (' WS-2-16A-S-GRP ')'
          logger.info("*469* WS-2-16A-S-GRP   = ({})", aSGrp216.toString()); 
//  DISPLAY '*470* WS-2-16A-S       = (' WS-2-16A-S ')'
          logger.info("*470* WS-2-16A-S       = ({})", new String(aSGrp216.getAS216())); 
//  DISPLAY '*471* WS-2-16A-T       = (' WS-2-16A-T ')'
          logger.info("*471* WS-2-16A-T       = ({})", aT216.toString()); 
//  DISPLAY '*472*   WS-2-16A-T-FLD1= (' WS-2-16A-T-FLD1 ')'
          logger.info("*472*   WS-2-16A-T-FLD1= ({})", new String(aT216.getATFld1216())); 
//  DISPLAY '*473*   WS-2-16A-T-FLD2= (' WS-2-16A-T-FLD2 ')'
          logger.info("*473*   WS-2-16A-T-FLD2= ({})", new String(aT216.getATFld2216())); 

// *
//  INITIALIZE WS-2-16A-S WS-2-16A-T
          aSGrp216.setAS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aT216.initialize();
//  MOVE ALL 'ABCD' TO WS-2-16A-S
          aSGrp216.setAS216(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-16A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_216_LENGTH);
//  MOVE LENGTH OF WS-2-16A-T TO WS-2-T-LEN
          work.setTLen2((short) AT216.getAT216FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
      
      }
      /**
      * mainlineSplit17 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT17 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS216                          COBOL Name: WS-2-16A-S
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      * - bSGrp216                       COBOL Name: WS-2-16B-S-GRP
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      *
      * Output :  

      * - aT216                          COBOL Name: WS-2-16A-T
      * - aS216                          COBOL Name: WS-2-16A-S
      * - aTFld1216                      COBOL Name: WS-2-16A-T-FLD1
      * - aTFld2216                      COBOL Name: WS-2-16A-T-FLD2
      * - bS216                          COBOL Name: WS-2-16B-S
      * - bT216                          COBOL Name: WS-2-16B-T
      * - bTFld3216                      COBOL Name: WS-2-16B-T-FLD3
      * - bTFld1216                      COBOL Name: WS-2-16B-T-FLD1
      * - bTFld2216                      COBOL Name: WS-2-16B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS217                          COBOL Name: WS-2-17A-S
      * - aT217                          COBOL Name: WS-2-17A-T
      * - aSFld1217                      COBOL Name: WS-2-17A-S-FLD1
      * - aSFld2217                      COBOL Name: WS-2-17A-S-FLD2
      * - aTFld1217                      COBOL Name: WS-2-17A-T-FLD1
      * - aTFld2217                      COBOL Name: WS-2-17A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit17() throws Exception {
			// Declare local variables used in the method
			 final int B_S_216_LENGTH = 70;
			AT217 aT217 = aTGrp217.getAT217();
			// End of variable declaration

//  MOVE WS-2-16A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-16A-T ( WS-FIVE : WS-2-T-LEN )
          aT216.replace(aSGrp216/*parent*/,3+work.getThree() - 1/*fromOffset - (aT216) */,work.getSLen2()/*fromLen*/,0+work.getFive() - 1/*toOffset - (aS216) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*474* WS-2-16A-S-GRP   = (' WS-2-16A-S-GRP ')'
          logger.info("*474* WS-2-16A-S-GRP   = ({})", aSGrp216.toString()); 
//  DISPLAY '*475* WS-2-16A-S       = (' WS-2-16A-S ')'
          logger.info("*475* WS-2-16A-S       = ({})", new String(aSGrp216.getAS216())); 
//  DISPLAY '*476* WS-2-16A-T       = (' WS-2-16A-T ')'
          logger.info("*476* WS-2-16A-T       = ({})", aT216.toString()); 
//  DISPLAY '*477*   WS-2-16A-T-FLD1= (' WS-2-16A-T-FLD1 ')'
          logger.info("*477*   WS-2-16A-T-FLD1= ({})", new String(aT216.getATFld1216())); 
//  DISPLAY '*478*   WS-2-16A-T-FLD2= (' WS-2-16A-T-FLD2 ')'
          logger.info("*478*   WS-2-16A-T-FLD2= ({})", new String(aT216.getATFld2216())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-16B-S WS-2-16B-T
          bSGrp216.setBS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT216.initialize();
//  MOVE ALL 'ABCD' TO WS-2-16B-S
          bSGrp216.setBS216(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-16B-T-FLD3
          bT216.setBTFld3216(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-16B-S ( WS-THREE : LENGTH OF WS-2-16B-S - 3 ) TO WS-2-16B-T ( WS-FIVE : LENGTH OF WS-2-16B-T - 5)
          bT216.replace(bSGrp216/*parent*/,3+work.getThree() - 1/*fromOffset - (bT216) */,B_S_216_LENGTH - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (bS216) */,BT216.getBT216FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*479* WS-2-16B-S-GRP   = (' WS-2-16B-S-GRP ')'
          logger.info("*479* WS-2-16B-S-GRP   = ({})", bSGrp216.toString()); 
//  DISPLAY '*480* WS-2-16B-S       = (' WS-2-16B-S ')'
          logger.info("*480* WS-2-16B-S       = ({})", new String(bSGrp216.getBS216())); 
//  DISPLAY '*481* WS-2-16B-T       = (' WS-2-16B-T ')'
          logger.info("*481* WS-2-16B-T       = ({})", bT216.toString()); 
//  DISPLAY '*482*   WS-2-16B-T-FLD1= (' WS-2-16B-T-FLD1 ')'
          logger.info("*482*   WS-2-16B-T-FLD1= ({})", new String(bT216.getBTFld1216())); 
//  DISPLAY '*483*   WS-2-16B-T-FLD2= (' WS-2-16B-T-FLD2 ')'
          logger.info("*483*   WS-2-16B-T-FLD2= ({})", new String(bT216.getBTFld2216())); 
//  DISPLAY '*484*   WS-2-16B-T-FLD3= (' WS-2-16B-T-FLD3 ')'
          logger.info("*484*   WS-2-16B-T-FLD3= ({})", new String(bT216.getBTFld3216())); 

// *
//  INITIALIZE WS-2-16B-S WS-2-16B-T
          bSGrp216.setBS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bT216.initialize();
//  MOVE ALL 'ABCD' TO WS-2-16B-S
          bSGrp216.setBS216(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-16B-T-FLD3
          bT216.setBTFld3216(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-16B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_216_LENGTH);
//  MOVE LENGTH OF WS-2-16B-T TO WS-2-T-LEN
          work.setTLen2((short) BT216.getBT216FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-16B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-16B-T ( WS-FIVE : WS-2-T-LEN )
          bT216.replace(bSGrp216/*parent*/,3+work.getThree() - 1/*fromOffset - (bT216) */,work.getSLen2()/*fromLen*/,0+work.getFive() - 1/*toOffset - (bS216) */,work.getTLen2()/*toLen*/);

// *
//  DISPLAY '*485* WS-2-16B-S-GRP   = (' WS-2-16B-S-GRP ')'
          logger.info("*485* WS-2-16B-S-GRP   = ({})", bSGrp216.toString()); 
//  DISPLAY '*486* WS-2-16B-S       = (' WS-2-16B-S ')'
          logger.info("*486* WS-2-16B-S       = ({})", new String(bSGrp216.getBS216())); 
//  DISPLAY '*487* WS-2-16B-T       = (' WS-2-16B-T ')'
          logger.info("*487* WS-2-16B-T       = ({})", bT216.toString()); 
//  DISPLAY '*488*   WS-2-16B-T-FLD1= (' WS-2-16B-T-FLD1 ')'
          logger.info("*488*   WS-2-16B-T-FLD1= ({})", new String(bT216.getBTFld1216())); 
//  DISPLAY '*489*   WS-2-16B-T-FLD2= (' WS-2-16B-T-FLD2 ')'
          logger.info("*489*   WS-2-16B-T-FLD2= ({})", new String(bT216.getBTFld2216())); 
//  DISPLAY '*490*   WS-2-16B-T-FLD3= (' WS-2-16B-T-FLD3 ')'
          logger.info("*490*   WS-2-16B-T-FLD3= ({})", new String(bT216.getBTFld3216())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-17A-S WS-2-17A-T
          aS217.initialize();
          aTGrp217.getAT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17A-S-FLD1
          aS217.setASFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17A-S-FLD2
          aS217.setASFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-17A-S ( WS-THREE : LENGTH OF WS-2-17A-S - 3 ) TO WS-2-17A-T ( WS-FIVE : LENGTH OF WS-2-17A-T - 5)
          aTGrp217.getAT217().replace(aS217,(work.getThree()-1),AS217.getAS217FieldLength() - 3, (aTGrp217.getAT217().begin + (work.getFive()-1)) ,AT217.getAT217FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*491* WS-2-17A-S       = (' WS-2-17A-S ')'
          logger.info("*491* WS-2-17A-S       = ({})", aS217.toString()); 
//  DISPLAY '*492*   WS-2-17A-S-FLD1= (' WS-2-17A-S-FLD1 ')'
          logger.info("*492*   WS-2-17A-S-FLD1= ({})", new String(aS217.getASFld1217())); 
//  DISPLAY '*493*   WS-2-17A-S-FLD2= (' WS-2-17A-S-FLD2 ')'
          logger.info("*493*   WS-2-17A-S-FLD2= ({})", new String(aS217.getASFld2217())); 
//  DISPLAY '*494* WS-2-17A-T-GRP   = (' WS-2-17A-T-GRP ')'
          logger.info("*494* WS-2-17A-T-GRP   = ({})", aTGrp217.toString()); 
//  DISPLAY '*495* WS-2-17A-T       = (' WS-2-17A-T ')'
          logger.info("*495* WS-2-17A-T       = ({})", aTGrp217.getAT217().toString()); 
//  DISPLAY '*496*   WS-2-17A-T-FLD1= (' WS-2-17A-T-FLD1 ')'
          logger.info("*496*   WS-2-17A-T-FLD1= ({})", new String(aT217.getATFld1217())); 
  
//  DISPLAY '*497*   WS-2-17A-T-FLD2= (' WS-2-17A-T-FLD2 ')'
          logger.info("*497*   WS-2-17A-T-FLD2= ({})", new String(aT217.getATFld2217())); 
  

// *
//  INITIALIZE WS-2-17A-S WS-2-17A-T
          aS217.initialize();
          aTGrp217.getAT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17A-S-FLD1
          aS217.setASFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17A-S-FLD2
          aS217.setASFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-17A-S TO WS-2-S-LEN
          work.setSLen2((short) AS217.getAS217FieldLength());
//  MOVE LENGTH OF WS-2-17A-T TO WS-2-T-LEN
          work.setTLen2((short) AT217.getAT217FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-17A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-17A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp217.getAT217().replace(aS217,(work.getThree()-1),work.getSLen2(), (aTGrp217.getAT217().begin + (work.getFive()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*498* WS-2-17A-S       = (' WS-2-17A-S ')'
          logger.info("*498* WS-2-17A-S       = ({})", aS217.toString()); 
//  DISPLAY '*499*   WS-2-17A-S-FLD1= (' WS-2-17A-S-FLD1 ')'
          logger.info("*499*   WS-2-17A-S-FLD1= ({})", new String(aS217.getASFld1217())); 
      
      }
      /**
      * mainlineSplit18 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT18 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSFld2217                      COBOL Name: WS-2-17A-S-FLD2
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      * - aT217                          COBOL Name: WS-2-17A-T
      * - aTFld1217                      COBOL Name: WS-2-17A-T-FLD1
      * - aTFld2217                      COBOL Name: WS-2-17A-T-FLD2
      * - bTGrp217                       COBOL Name: WS-2-17B-T-GRP
      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      *
      * Output :  

      * - bS217                          COBOL Name: WS-2-17B-S
      * - bT217                          COBOL Name: WS-2-17B-T
      * - bSFld1217                      COBOL Name: WS-2-17B-S-FLD1
      * - bSFld2217                      COBOL Name: WS-2-17B-S-FLD2
      * - bTFld3217                      COBOL Name: WS-2-17B-T-FLD3
      * - bTFld1217                      COBOL Name: WS-2-17B-T-FLD1
      * - bTFld2217                      COBOL Name: WS-2-17B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS218                          COBOL Name: WS-2-18A-S
      * - aT218                          COBOL Name: WS-2-18A-T
      * - aTFld1218                      COBOL Name: WS-2-18A-T-FLD1
      * - aTFld2218                      COBOL Name: WS-2-18A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit18() throws Exception {
			// Declare local variables used in the method
			AT217 aT217 = aTGrp217.getAT217();
			BT217 bT217 = bTGrp217.getBT217();
			 final int A_S_218_LENGTH = 70;
			AT218 aT218 = aTGrp218.getAT218();
			// End of variable declaration

//  DISPLAY '*500*   WS-2-17A-S-FLD2= (' WS-2-17A-S-FLD2 ')'
          logger.info("*500*   WS-2-17A-S-FLD2= ({})", new String(aS217.getASFld2217())); 
//  DISPLAY '*501* WS-2-17A-T-GRP   = (' WS-2-17A-T-GRP ')'
          logger.info("*501* WS-2-17A-T-GRP   = ({})", aTGrp217.toString()); 
//  DISPLAY '*502* WS-2-17A-T       = (' WS-2-17A-T ')'
          logger.info("*502* WS-2-17A-T       = ({})", aTGrp217.getAT217().toString()); 
//  DISPLAY '*503*   WS-2-17A-T-FLD1= (' WS-2-17A-T-FLD1 ')'
          logger.info("*503*   WS-2-17A-T-FLD1= ({})", new String(aT217.getATFld1217())); 
  
//  DISPLAY '*504*   WS-2-17A-T-FLD2= (' WS-2-17A-T-FLD2 ')'
          logger.info("*504*   WS-2-17A-T-FLD2= ({})", new String(aT217.getATFld2217())); 
  

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-17B-S WS-2-17B-T
          bS217.initialize();
          bTGrp217.getBT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17B-S-FLD1
          bS217.setBSFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17B-S-FLD2
          bS217.setBSFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-17B-T-FLD3
          bT217.setBTFld3217(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-17B-S ( WS-THREE : LENGTH OF WS-2-17B-S - 3 ) TO WS-2-17B-T ( WS-FIVE : LENGTH OF WS-2-17B-T - 5)
          bTGrp217.getBT217().replace(bS217,(work.getThree()-1),BS217.getBS217FieldLength() - 3, (bTGrp217.getBT217().begin + (work.getFive()-1)) ,BT217.getBT217FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*505* WS-2-17B-S       = (' WS-2-17B-S ')'
          logger.info("*505* WS-2-17B-S       = ({})", bS217.toString()); 
//  DISPLAY '*506*   WS-2-17B-S-FLD1= (' WS-2-17B-S-FLD1 ')'
          logger.info("*506*   WS-2-17B-S-FLD1= ({})", new String(bS217.getBSFld1217())); 
//  DISPLAY '*507*   WS-2-17B-S-FLD2= (' WS-2-17B-S-FLD2 ')'
          logger.info("*507*   WS-2-17B-S-FLD2= ({})", new String(bS217.getBSFld2217())); 
//  DISPLAY '*508* WS-2-17B-T-GRP   = (' WS-2-17B-T-GRP ')'
          logger.info("*508* WS-2-17B-T-GRP   = ({})", bTGrp217.toString()); 
//  DISPLAY '*509* WS-2-17B-T       = (' WS-2-17B-T ')'
          logger.info("*509* WS-2-17B-T       = ({})", bTGrp217.getBT217().toString()); 
//  DISPLAY '*510*   WS-2-17B-T-FLD1= (' WS-2-17B-T-FLD1 ')'
          logger.info("*510*   WS-2-17B-T-FLD1= ({})", new String(bT217.getBTFld1217())); 
  
//  DISPLAY '*511*   WS-2-17B-T-FLD2= (' WS-2-17B-T-FLD2 ')'
          logger.info("*511*   WS-2-17B-T-FLD2= ({})", new String(bT217.getBTFld2217())); 
  
//  DISPLAY '*512*   WS-2-17B-T-FLD3= (' WS-2-17B-T-FLD3 ')'
          logger.info("*512*   WS-2-17B-T-FLD3= ({})", new String(bT217.getBTFld3217())); 
  

// *
//  INITIALIZE WS-2-17B-S WS-2-17B-T
          bS217.initialize();
          bTGrp217.getBT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17B-S-FLD1
          bS217.setBSFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17B-S-FLD2
          bS217.setBSFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-17B-T-FLD3
          bT217.setBTFld3217(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-17B-S TO WS-2-S-LEN
          work.setSLen2((short) BS217.getBS217FieldLength());
//  MOVE LENGTH OF WS-2-17B-T TO WS-2-T-LEN
          work.setTLen2((short) BT217.getBT217FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-17B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-17B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp217.getBT217().replace(bS217,(work.getThree()-1),work.getSLen2(), (bTGrp217.getBT217().begin + (work.getFive()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*513* WS-2-17B-S       = (' WS-2-17B-S ')'
          logger.info("*513* WS-2-17B-S       = ({})", bS217.toString()); 
//  DISPLAY '*514*   WS-2-17B-S-FLD1= (' WS-2-17B-S-FLD1 ')'
          logger.info("*514*   WS-2-17B-S-FLD1= ({})", new String(bS217.getBSFld1217())); 
//  DISPLAY '*515*   WS-2-17B-S-FLD2= (' WS-2-17B-S-FLD2 ')'
          logger.info("*515*   WS-2-17B-S-FLD2= ({})", new String(bS217.getBSFld2217())); 
//  DISPLAY '*516* WS-2-17B-T-GRP   = (' WS-2-17B-T-GRP ')'
          logger.info("*516* WS-2-17B-T-GRP   = ({})", bTGrp217.toString()); 
//  DISPLAY '*517* WS-2-17B-T       = (' WS-2-17B-T ')'
          logger.info("*517* WS-2-17B-T       = ({})", bTGrp217.getBT217().toString()); 
//  DISPLAY '*518*   WS-2-17B-T-FLD1= (' WS-2-17B-T-FLD1 ')'
          logger.info("*518*   WS-2-17B-T-FLD1= ({})", new String(bT217.getBTFld1217())); 
  
//  DISPLAY '*519*   WS-2-17B-T-FLD2= (' WS-2-17B-T-FLD2 ')'
          logger.info("*519*   WS-2-17B-T-FLD2= ({})", new String(bT217.getBTFld2217())); 
  
//  DISPLAY '*520*   WS-2-17B-T-FLD3= (' WS-2-17B-T-FLD3 ')'
          logger.info("*520*   WS-2-17B-T-FLD3= ({})", new String(bT217.getBTFld3217())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-18A-S WS-2-18A-T
          work.setAS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp218.getAT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18A-S
          work.setAS218(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-18A-S ( WS-THREE : LENGTH OF WS-2-18A-S - 3 ) TO WS-2-18A-T ( WS-FIVE : LENGTH OF WS-2-18A-T - 5)
          aTGrp218.setAT218(work.getAS218(),(work.getThree()-1)/* aS218 */ ,A_S_218_LENGTH - 3,(work.getFive()-1),AT218.getAT218FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*521* WS-2-18A-S       = (' WS-2-18A-S ')'
          logger.info("*521* WS-2-18A-S       = ({})", new String(work.getAS218())); 
//  DISPLAY '*522* WS-2-18A-T-GRP   = (' WS-2-18A-T-GRP ')'
          logger.info("*522* WS-2-18A-T-GRP   = ({})", aTGrp218.toString()); 
//  DISPLAY '*523* WS-2-18A-T       = (' WS-2-18A-T ')'
          logger.info("*523* WS-2-18A-T       = ({})", aTGrp218.getAT218().toString()); 
//  DISPLAY '*524*   WS-2-18A-T-FLD1= (' WS-2-18A-T-FLD1 ')'
          logger.info("*524*   WS-2-18A-T-FLD1= ({})", new String(aT218.getATFld1218())); 
  
//  DISPLAY '*525*   WS-2-18A-T-FLD2= (' WS-2-18A-T-FLD2 ')'
          logger.info("*525*   WS-2-18A-T-FLD2= ({})", new String(aT218.getATFld2218())); 
  

// *
//  INITIALIZE WS-2-18A-S WS-2-18A-T
          work.setAS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp218.getAT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18A-S
          work.setAS218(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-18A-S TO WS-2-S-LEN
          work.setSLen2((short) A_S_218_LENGTH);
//  MOVE LENGTH OF WS-2-18A-T TO WS-2-T-LEN
          work.setTLen2((short) AT218.getAT218FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-18A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-18A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp218.setAT218(work.getAS218(),(work.getThree()-1)/* aS218 */ ,work.getSLen2(),(work.getFive()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*526* WS-2-18A-S       = (' WS-2-18A-S ')'
          logger.info("*526* WS-2-18A-S       = ({})", new String(work.getAS218())); 
      
      }
      /**
      * mainlineSplit19 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT19 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      * - aT218                          COBOL Name: WS-2-18A-T
      * - aTFld1218                      COBOL Name: WS-2-18A-T-FLD1
      * - aTFld2218                      COBOL Name: WS-2-18A-T-FLD2
      * - bTGrp218                       COBOL Name: WS-2-18B-T-GRP
      * - aTGrp219                       COBOL Name: WS-2-19A-T-GRP
      *
      * Output :  

      * - bS218                          COBOL Name: WS-2-18B-S
      * - bT218                          COBOL Name: WS-2-18B-T
      * - bTFld3218                      COBOL Name: WS-2-18B-T-FLD3
      * - bTFld1218                      COBOL Name: WS-2-18B-T-FLD1
      * - bTFld2218                      COBOL Name: WS-2-18B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS219                          COBOL Name: WS-2-19A-S
      * - aT219                          COBOL Name: WS-2-19A-T
      * - aSFld1219                      COBOL Name: WS-2-19A-S-FLD1
      * - aSFld2219                      COBOL Name: WS-2-19A-S-FLD2
      * - aTFld1219                      COBOL Name: WS-2-19A-T-FLD1
      * - aTFld2219                      COBOL Name: WS-2-19A-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit19() throws Exception {
			// Declare local variables used in the method
			AT218 aT218 = aTGrp218.getAT218();
			BT218 bT218 = bTGrp218.getBT218();
			 final int B_S_218_LENGTH = 70;
			AT219 aT219 = aTGrp219.getAT219();
			// End of variable declaration

//  DISPLAY '*527* WS-2-18A-T-GRP   = (' WS-2-18A-T-GRP ')'
          logger.info("*527* WS-2-18A-T-GRP   = ({})", aTGrp218.toString()); 
//  DISPLAY '*528* WS-2-18A-T       = (' WS-2-18A-T ')'
          logger.info("*528* WS-2-18A-T       = ({})", aTGrp218.getAT218().toString()); 
//  DISPLAY '*529*   WS-2-18A-T-FLD1= (' WS-2-18A-T-FLD1 ')'
          logger.info("*529*   WS-2-18A-T-FLD1= ({})", new String(aT218.getATFld1218())); 
  
//  DISPLAY '*530*   WS-2-18A-T-FLD2= (' WS-2-18A-T-FLD2 ')'
          logger.info("*530*   WS-2-18A-T-FLD2= ({})", new String(aT218.getATFld2218())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-18B-S WS-2-18B-T
          work.setBS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp218.getBT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18B-S
          work.setBS218(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-18B-T-FLD3
          bT218.setBTFld3218(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-18B-S ( WS-THREE : LENGTH OF WS-2-18B-S - 3 ) TO WS-2-18B-T ( WS-FIVE : LENGTH OF WS-2-18B-T - 5)
          bTGrp218.setBT218(work.getBS218(),(work.getThree()-1)/* bS218 */ ,B_S_218_LENGTH - 3,(work.getFive()-1),BT218.getBT218FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*531* WS-2-18B-S       = (' WS-2-18B-S ')'
          logger.info("*531* WS-2-18B-S       = ({})", new String(work.getBS218())); 
//  DISPLAY '*532* WS-2-18B-T-GRP   = (' WS-2-18B-T-GRP ')'
          logger.info("*532* WS-2-18B-T-GRP   = ({})", bTGrp218.toString()); 
//  DISPLAY '*533* WS-2-18B-T       = (' WS-2-18B-T ')'
          logger.info("*533* WS-2-18B-T       = ({})", bTGrp218.getBT218().toString()); 
//  DISPLAY '*534*   WS-2-18B-T-FLD1= (' WS-2-18B-T-FLD1 ')'
          logger.info("*534*   WS-2-18B-T-FLD1= ({})", new String(bT218.getBTFld1218())); 
  
//  DISPLAY '*535*   WS-2-18B-T-FLD2= (' WS-2-18B-T-FLD2 ')'
          logger.info("*535*   WS-2-18B-T-FLD2= ({})", new String(bT218.getBTFld2218())); 
  
//  DISPLAY '*536*   WS-2-18B-T-FLD3= (' WS-2-18B-T-FLD3 ')'
          logger.info("*536*   WS-2-18B-T-FLD3= ({})", new String(bT218.getBTFld3218())); 
  

// *
//  INITIALIZE WS-2-18B-S WS-2-18B-T
          work.setBS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp218.getBT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18B-S
          work.setBS218(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-18B-T-FLD3
          bT218.setBTFld3218(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-18B-S TO WS-2-S-LEN
          work.setSLen2((short) B_S_218_LENGTH);
//  MOVE LENGTH OF WS-2-18B-T TO WS-2-T-LEN
          work.setTLen2((short) BT218.getBT218FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          work.setSLen2( (short) (work.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-18B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-18B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp218.setBT218(work.getBS218(),(work.getThree()-1)/* bS218 */ ,work.getSLen2(),(work.getFive()-1),work.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*537* WS-2-18B-S       = (' WS-2-18B-S ')'
          logger.info("*537* WS-2-18B-S       = ({})", new String(work.getBS218())); 
//  DISPLAY '*538* WS-2-18B-T-GRP   = (' WS-2-18B-T-GRP ')'
          logger.info("*538* WS-2-18B-T-GRP   = ({})", bTGrp218.toString()); 
//  DISPLAY '*539* WS-2-18B-T       = (' WS-2-18B-T ')'
          logger.info("*539* WS-2-18B-T       = ({})", bTGrp218.getBT218().toString()); 
//  DISPLAY '*540*   WS-2-18B-T-FLD1= (' WS-2-18B-T-FLD1 ')'
          logger.info("*540*   WS-2-18B-T-FLD1= ({})", new String(bT218.getBTFld1218())); 
  
//  DISPLAY '*541*   WS-2-18B-T-FLD2= (' WS-2-18B-T-FLD2 ')'
          logger.info("*541*   WS-2-18B-T-FLD2= ({})", new String(bT218.getBTFld2218())); 
  
//  DISPLAY '*542*   WS-2-18B-T-FLD3= (' WS-2-18B-T-FLD3 ')'
          logger.info("*542*   WS-2-18B-T-FLD3= ({})", new String(bT218.getBTFld3218())); 
  

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-19A-S WS-2-19A-T
          aS219.initialize();
          aTGrp219.getAT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19A-S-FLD1
          aS219.setASFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19A-S-FLD2
          aS219.setASFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-19A-S TO WS-2-19A-T ( WS-FIVE : LENGTH OF WS-2-19A-T - 5)
          aTGrp219.getAT219().replace(aS219.getCharArray(),0,aS219.length(), (aTGrp219.getAT219().begin + (work.getFive()-1)) ,AT219.getAT219FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*543* WS-2-19A-S       = (' WS-2-19A-S ')'
          logger.info("*543* WS-2-19A-S       = ({})", aS219.toString()); 
//  DISPLAY '*544*   WS-2-19A-S-FLD1= (' WS-2-19A-S-FLD1 ')'
          logger.info("*544*   WS-2-19A-S-FLD1= ({})", new String(aS219.getASFld1219())); 
//  DISPLAY '*545*   WS-2-19A-S-FLD2= (' WS-2-19A-S-FLD2 ')'
          logger.info("*545*   WS-2-19A-S-FLD2= ({})", new String(aS219.getASFld2219())); 
//  DISPLAY '*546* WS-2-19A-T-GRP   = (' WS-2-19A-T-GRP ')'
          logger.info("*546* WS-2-19A-T-GRP   = ({})", aTGrp219.toString()); 
//  DISPLAY '*547* WS-2-19A-T       = (' WS-2-19A-T ')'
          logger.info("*547* WS-2-19A-T       = ({})", aTGrp219.getAT219().toString()); 
//  DISPLAY '*548*   WS-2-19A-T-FLD1= (' WS-2-19A-T-FLD1 ')'
          logger.info("*548*   WS-2-19A-T-FLD1= ({})", new String(aT219.getATFld1219())); 
  
//  DISPLAY '*549*   WS-2-19A-T-FLD2= (' WS-2-19A-T-FLD2 ')'
          logger.info("*549*   WS-2-19A-T-FLD2= ({})", new String(aT219.getATFld2219())); 
  

// *
//  INITIALIZE WS-2-19A-S WS-2-19A-T
          aS219.initialize();
          aTGrp219.getAT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19A-S-FLD1
          aS219.setASFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19A-S-FLD2
          aS219.setASFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-19A-T TO WS-2-T-LEN
          work.setTLen2((short) AT219.getAT219FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-19A-S TO WS-2-19A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp219.getAT219().replace(aS219.getCharArray(),0,aS219.length(), (aTGrp219.getAT219().begin + (work.getFive()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*550* WS-2-19A-S       = (' WS-2-19A-S ')'
          logger.info("*550* WS-2-19A-S       = ({})", aS219.toString()); 
//  DISPLAY '*551*   WS-2-19A-S-FLD1= (' WS-2-19A-S-FLD1 ')'
          logger.info("*551*   WS-2-19A-S-FLD1= ({})", new String(aS219.getASFld1219())); 
//  DISPLAY '*552*   WS-2-19A-S-FLD2= (' WS-2-19A-S-FLD2 ')'
          logger.info("*552*   WS-2-19A-S-FLD2= ({})", new String(aS219.getASFld2219())); 
//  DISPLAY '*553* WS-2-19A-T-GRP   = (' WS-2-19A-T-GRP ')'
          logger.info("*553* WS-2-19A-T-GRP   = ({})", aTGrp219.toString()); 
//  DISPLAY '*554* WS-2-19A-T       = (' WS-2-19A-T ')'
          logger.info("*554* WS-2-19A-T       = ({})", aTGrp219.getAT219().toString()); 
//  DISPLAY '*555*   WS-2-19A-T-FLD1= (' WS-2-19A-T-FLD1 ')'
          logger.info("*555*   WS-2-19A-T-FLD1= ({})", new String(aT219.getATFld1219())); 
  
      
      }
      /**
      * mainlineSplit20 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT20 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTFld2219                      COBOL Name: WS-2-19A-T-FLD2
      * - bTGrp219                       COBOL Name: WS-2-19B-T-GRP
      * - aTGrp220                       COBOL Name: WS-2-20A-T-GRP
      *
      * Output :  

      * - bS219                          COBOL Name: WS-2-19B-S
      * - bT219                          COBOL Name: WS-2-19B-T
      * - bSFld1219                      COBOL Name: WS-2-19B-S-FLD1
      * - bSFld2219                      COBOL Name: WS-2-19B-S-FLD2
      * - bTFld3219                      COBOL Name: WS-2-19B-T-FLD3
      * - bTFld1219                      COBOL Name: WS-2-19B-T-FLD1
      * - bTFld2219                      COBOL Name: WS-2-19B-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS220                          COBOL Name: WS-2-20A-S
      * - aT220                          COBOL Name: WS-2-20A-T
      * - aTFld1220                      COBOL Name: WS-2-20A-T-FLD1
      * - aTFld2220                      COBOL Name: WS-2-20A-T-FLD2
      * - bS220                          COBOL Name: WS-2-20B-S
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      *
      * @throws CFException
      */
      private void mainlineSplit20() throws Exception {
			// Declare local variables used in the method
			AT219 aT219 = aTGrp219.getAT219();
			BT219 bT219 = bTGrp219.getBT219();
			AT220 aT220 = aTGrp220.getAT220();
			BT220 bT220 = bTGrp220.getBT220();
			// End of variable declaration

//  DISPLAY '*556*   WS-2-19A-T-FLD2= (' WS-2-19A-T-FLD2 ')'
          logger.info("*556*   WS-2-19A-T-FLD2= ({})", new String(aT219.getATFld2219())); 
  

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-19B-S WS-2-19B-T
          bS219.initialize();
          bTGrp219.getBT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19B-S-FLD1
          bS219.setBSFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19B-S-FLD2
          bS219.setBSFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-19B-T-FLD3
          bT219.setBTFld3219(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-19B-S TO WS-2-19B-T ( WS-FIVE : LENGTH OF WS-2-19B-T - 5)
          bTGrp219.getBT219().replace(bS219.getCharArray(),0,bS219.length(), (bTGrp219.getBT219().begin + (work.getFive()-1)) ,BT219.getBT219FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*557* WS-2-19B-S       = (' WS-2-19B-S ')'
          logger.info("*557* WS-2-19B-S       = ({})", bS219.toString()); 
//  DISPLAY '*558*   WS-2-19B-S-FLD1= (' WS-2-19B-S-FLD1 ')'
          logger.info("*558*   WS-2-19B-S-FLD1= ({})", new String(bS219.getBSFld1219())); 
//  DISPLAY '*559*   WS-2-19B-S-FLD2= (' WS-2-19B-S-FLD2 ')'
          logger.info("*559*   WS-2-19B-S-FLD2= ({})", new String(bS219.getBSFld2219())); 
//  DISPLAY '*560* WS-2-19B-T-GRP   = (' WS-2-19B-T-GRP ')'
          logger.info("*560* WS-2-19B-T-GRP   = ({})", bTGrp219.toString()); 
//  DISPLAY '*561* WS-2-19B-T       = (' WS-2-19B-T ')'
          logger.info("*561* WS-2-19B-T       = ({})", bTGrp219.getBT219().toString()); 
//  DISPLAY '*562*   WS-2-19B-T-FLD1= (' WS-2-19B-T-FLD1 ')'
          logger.info("*562*   WS-2-19B-T-FLD1= ({})", new String(bT219.getBTFld1219())); 
  
//  DISPLAY '*563*   WS-2-19B-T-FLD2= (' WS-2-19B-T-FLD2 ')'
          logger.info("*563*   WS-2-19B-T-FLD2= ({})", new String(bT219.getBTFld2219())); 
  
//  DISPLAY '*564*   WS-2-19B-T-FLD3= (' WS-2-19B-T-FLD3 ')'
          logger.info("*564*   WS-2-19B-T-FLD3= ({})", new String(bT219.getBTFld3219())); 
  

// *
//  INITIALIZE WS-2-19B-S WS-2-19B-T
          bS219.initialize();
          bTGrp219.getBT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19B-S-FLD1
          bS219.setBSFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19B-S-FLD2
          bS219.setBSFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-19B-T-FLD3
          bT219.setBTFld3219(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-19B-T TO WS-2-T-LEN
          work.setTLen2((short) BT219.getBT219FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-19B-S TO WS-2-19B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp219.getBT219().replace(bS219.getCharArray(),0,bS219.length(), (bTGrp219.getBT219().begin + (work.getFive()-1)) ,work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*565* WS-2-19B-S       = (' WS-2-19B-S ')'
          logger.info("*565* WS-2-19B-S       = ({})", bS219.toString()); 
//  DISPLAY '*566*   WS-2-19B-S-FLD1= (' WS-2-19B-S-FLD1 ')'
          logger.info("*566*   WS-2-19B-S-FLD1= ({})", new String(bS219.getBSFld1219())); 
//  DISPLAY '*567*   WS-2-19B-S-FLD2= (' WS-2-19B-S-FLD2 ')'
          logger.info("*567*   WS-2-19B-S-FLD2= ({})", new String(bS219.getBSFld2219())); 
//  DISPLAY '*568* WS-2-19B-T-GRP   = (' WS-2-19B-T-GRP ')'
          logger.info("*568* WS-2-19B-T-GRP   = ({})", bTGrp219.toString()); 
//  DISPLAY '*569* WS-2-19B-T       = (' WS-2-19B-T ')'
          logger.info("*569* WS-2-19B-T       = ({})", bTGrp219.getBT219().toString()); 
//  DISPLAY '*570*   WS-2-19B-T-FLD1= (' WS-2-19B-T-FLD1 ')'
          logger.info("*570*   WS-2-19B-T-FLD1= ({})", new String(bT219.getBTFld1219())); 
  
//  DISPLAY '*571*   WS-2-19B-T-FLD2= (' WS-2-19B-T-FLD2 ')'
          logger.info("*571*   WS-2-19B-T-FLD2= ({})", new String(bT219.getBTFld2219())); 
  
//  DISPLAY '*572*   WS-2-19B-T-FLD3= (' WS-2-19B-T-FLD3 ')'
          logger.info("*572*   WS-2-19B-T-FLD3= ({})", new String(bT219.getBTFld3219())); 
  

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-20A-S WS-2-20A-T
          work.setAS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp220.getAT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20A-S
          work.setAS220(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-20A-S TO WS-2-20A-T ( WS-FIVE : LENGTH OF WS-2-20A-T - 5)
          aTGrp220.setAT220(work.getAS220(),0,work.getAS220().length,(work.getFive()-1),AT220.getAT220FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*573* WS-2-20A-S       = (' WS-2-20A-S ')'
          logger.info("*573* WS-2-20A-S       = ({})", new String(work.getAS220())); 
//  DISPLAY '*574* WS-2-20A-T-GRP   = (' WS-2-20A-T-GRP ')'
          logger.info("*574* WS-2-20A-T-GRP   = ({})", aTGrp220.toString()); 
//  DISPLAY '*575* WS-2-20A-T       = (' WS-2-20A-T ')'
          logger.info("*575* WS-2-20A-T       = ({})", aTGrp220.getAT220().toString()); 
//  DISPLAY '*576*   WS-2-20A-T-FLD1= (' WS-2-20A-T-FLD1 ')'
          logger.info("*576*   WS-2-20A-T-FLD1= ({})", new String(aT220.getATFld1220())); 
  
//  DISPLAY '*577*   WS-2-20A-T-FLD2= (' WS-2-20A-T-FLD2 ')'
          logger.info("*577*   WS-2-20A-T-FLD2= ({})", new String(aT220.getATFld2220())); 
  

// *
//  INITIALIZE WS-2-20A-S WS-2-20A-T
          work.setAS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          aTGrp220.getAT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20A-S
          work.setAS220(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-20A-T TO WS-2-T-LEN
          work.setTLen2((short) AT220.getAT220FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-20A-S TO WS-2-20A-T ( WS-FIVE : WS-2-T-LEN )
          aTGrp220.setAT220(work.getAS220(),0,work.getAS220().length,(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*578* WS-2-20A-S       = (' WS-2-20A-S ')'
          logger.info("*578* WS-2-20A-S       = ({})", new String(work.getAS220())); 
//  DISPLAY '*579* WS-2-20A-T-GRP   = (' WS-2-20A-T-GRP ')'
          logger.info("*579* WS-2-20A-T-GRP   = ({})", aTGrp220.toString()); 
//  DISPLAY '*580* WS-2-20A-T       = (' WS-2-20A-T ')'
          logger.info("*580* WS-2-20A-T       = ({})", aTGrp220.getAT220().toString()); 
//  DISPLAY '*581*   WS-2-20A-T-FLD1= (' WS-2-20A-T-FLD1 ')'
          logger.info("*581*   WS-2-20A-T-FLD1= ({})", new String(aT220.getATFld1220())); 
  
//  DISPLAY '*582*   WS-2-20A-T-FLD2= (' WS-2-20A-T-FLD2 ')'
          logger.info("*582*   WS-2-20A-T-FLD2= ({})", new String(aT220.getATFld2220())); 
  

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-20B-S WS-2-20B-T
          work.setBS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp220.getBT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20B-S
          work.setBS220(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-20B-T-FLD3
          bT220.setBTFld3220(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WS-2-20B-S TO WS-2-20B-T ( WS-FIVE : LENGTH OF WS-2-20B-T - 5)
          bTGrp220.setBT220(work.getBS220(),0,work.getBS220().length,(work.getFive()-1),BT220.getBT220FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      }
      /**
      * mainlineSplit21 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT21 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS220                          COBOL Name: WS-2-20B-S
      * - bTGrp220                       COBOL Name: WS-2-20B-T-GRP
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld1220                      COBOL Name: WS-2-20B-T-FLD1
      * - bTFld2220                      COBOL Name: WS-2-20B-T-FLD2
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      *
      * Output :  

      * - bS220                          COBOL Name: WS-2-20B-S
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - wse21aS                        COBOL Name: WSE-2-1A-S
      * - wse21aT                        COBOL Name: WSE-2-1A-T
      * - wse21aSFld1                    COBOL Name: WSE-2-1A-S-FLD1
      * - wse21aSFld2                    COBOL Name: WSE-2-1A-S-FLD2
      * - wse21aTFld1                    COBOL Name: WSE-2-1A-T-FLD1
      * - wse21aTFld2                    COBOL Name: WSE-2-1A-T-FLD2
      * - wse21bS                        COBOL Name: WSE-2-1B-S
      * - wse21bT                        COBOL Name: WSE-2-1B-T
      * - wse21bSFld1                    COBOL Name: WSE-2-1B-S-FLD1
      * - wse21bSFld2                    COBOL Name: WSE-2-1B-S-FLD2
      * - wse21bTFld3                    COBOL Name: WSE-2-1B-T-FLD3
      * - wse21bTFld1                    COBOL Name: WSE-2-1B-T-FLD1
      * - wse21bTFld2                    COBOL Name: WSE-2-1B-T-FLD2
      * - wse22aS                        COBOL Name: WSE-2-2A-S
      * - wse22aT                        COBOL Name: WSE-2-2A-T
      * - wse22aTFld1                    COBOL Name: WSE-2-2A-T-FLD1
      * - wse22aTFld2                    COBOL Name: WSE-2-2A-T-FLD2
      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      *
      * @throws CFException
      */
      private void mainlineSplit21() throws Exception {
			// Declare local variables used in the method
			BT220 bT220 = bTGrp220.getBT220();
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			// End of variable declaration


// *
//  DISPLAY '*583* WS-2-20B-S       = (' WS-2-20B-S ')'
          logger.info("*583* WS-2-20B-S       = ({})", new String(work.getBS220())); 
//  DISPLAY '*584* WS-2-20B-T-GRP   = (' WS-2-20B-T-GRP ')'
          logger.info("*584* WS-2-20B-T-GRP   = ({})", bTGrp220.toString()); 
//  DISPLAY '*585* WS-2-20B-T       = (' WS-2-20B-T ')'
          logger.info("*585* WS-2-20B-T       = ({})", bTGrp220.getBT220().toString()); 
//  DISPLAY '*586*   WS-2-20B-T-FLD1= (' WS-2-20B-T-FLD1 ')'
          logger.info("*586*   WS-2-20B-T-FLD1= ({})", new String(bT220.getBTFld1220())); 
  
//  DISPLAY '*587*   WS-2-20B-T-FLD2= (' WS-2-20B-T-FLD2 ')'
          logger.info("*587*   WS-2-20B-T-FLD2= ({})", new String(bT220.getBTFld2220())); 
  
//  DISPLAY '*588*   WS-2-20B-T-FLD3= (' WS-2-20B-T-FLD3 ')'
          logger.info("*588*   WS-2-20B-T-FLD3= ({})", new String(bT220.getBTFld3220())); 
  

// *
//  INITIALIZE WS-2-20B-S WS-2-20B-T
          work.setBS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          bTGrp220.getBT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20B-S
          work.setBS220(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-20B-T-FLD3
          bT220.setBTFld3220(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE LENGTH OF WS-2-20B-T TO WS-2-T-LEN
          work.setTLen2((short) BT220.getBT220FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          work.setTLen2( (short) (work.getTLen2()-(short)5));
//  MOVE WS-2-20B-S TO WS-2-20B-T ( WS-FIVE : WS-2-T-LEN )
          bTGrp220.setBT220(work.getBS220(),0,work.getBS220().length,(work.getFive()-1),work.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*589* WS-2-20B-S       = (' WS-2-20B-S ')'
          logger.info("*589* WS-2-20B-S       = ({})", new String(work.getBS220())); 
//  DISPLAY '*590* WS-2-20B-T-GRP   = (' WS-2-20B-T-GRP ')'
          logger.info("*590* WS-2-20B-T-GRP   = ({})", bTGrp220.toString()); 
//  DISPLAY '*591* WS-2-20B-T       = (' WS-2-20B-T ')'
          logger.info("*591* WS-2-20B-T       = ({})", bTGrp220.getBT220().toString()); 
//  DISPLAY '*592*   WS-2-20B-T-FLD1= (' WS-2-20B-T-FLD1 ')'
          logger.info("*592*   WS-2-20B-T-FLD1= ({})", new String(bT220.getBTFld1220())); 
  
//  DISPLAY '*593*   WS-2-20B-T-FLD2= (' WS-2-20B-T-FLD2 ')'
          logger.info("*593*   WS-2-20B-T-FLD2= ({})", new String(bT220.getBTFld2220())); 
  
//  DISPLAY '*594*   WS-2-20B-T-FLD3= (' WS-2-20B-T-FLD3 ')'
          logger.info("*594*   WS-2-20B-T-FLD3= ({})", new String(bT220.getBTFld3220())); 
  

// *
// * Below usecases are repeat of above one with equal src and tgt
// *
// * src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1A-S WSE-2-1A-T
          wse21aS.initialize();
          wse21aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1A-S-FLD1
          wse21aS.setWse21aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1A-S-FLD2
          wse21aS.setWse21aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-1A-S ( WS-ONE : LENGTH OF WSE-2-1A-S ) TO WSE-2-1A-T ( WS-ONE : LENGTH OF WSE-2-1A-T )
          wse21aT.replace(wse21aS,(work.getOne()-1),Wse21aS.getWse21aSFieldLength(),(work.getOne()-1),Wse21aT.getWse21aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*595* WSE-2-1A-S        = (' WSE-2-1A-S ')'
          logger.info("*595* WSE-2-1A-S        = ({})", wse21aS.toString()); 
//  DISPLAY '*596*   WSE-2-1A-S-FLD1 = (' WSE-2-1A-S-FLD1 ')'
          logger.info("*596*   WSE-2-1A-S-FLD1 = ({})", new String(wse21aS.getWse21aSFld1())); 
//  DISPLAY '*597*   WSE-2-1A-S-FLD2 = (' WSE-2-1A-S-FLD2 ')'
          logger.info("*597*   WSE-2-1A-S-FLD2 = ({})", new String(wse21aS.getWse21aSFld2())); 
//  DISPLAY '*598* WSE-2-1A-T        = (' WSE-2-1A-T ')'
          logger.info("*598* WSE-2-1A-T        = ({})", wse21aT.toString()); 
//  DISPLAY '*599*   WSE-2-1A-T-FLD1 = (' WSE-2-1A-T-FLD1 ')'
          logger.info("*599*   WSE-2-1A-T-FLD1 = ({})", new String(wse21aT.getWse21aTFld1())); 
//  DISPLAY '*600*   WSE-2-1A-T-FLD2 = (' WSE-2-1A-T-FLD2 ')'
          logger.info("*600*   WSE-2-1A-T-FLD2 = ({})", new String(wse21aT.getWse21aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1B-S WSE-2-1B-T
          wse21bS.initialize();
          wse21bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1B-S-FLD1
          wse21bS.setWse21bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1B-S-FLD2
          wse21bS.setWse21bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-1B-T-FLD3
          wse21bT.setWse21bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-1B-S ( WS-ONE : LENGTH OF WSE-2-1B-S ) TO WSE-2-1B-T ( WS-ONE : LENGTH OF WSE-2-1B-T )
          wse21bT.replace(wse21bS,(work.getOne()-1),Wse21bS.getWse21bSFieldLength(),(work.getOne()-1),Wse21bT.getWse21bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*601* WSE-2-1B-S        = (' WSE-2-1B-S ')'
          logger.info("*601* WSE-2-1B-S        = ({})", wse21bS.toString()); 
//  DISPLAY '*602*   WSE-2-1B-S-FLD1 = (' WSE-2-1B-S-FLD1 ')'
          logger.info("*602*   WSE-2-1B-S-FLD1 = ({})", new String(wse21bS.getWse21bSFld1())); 
//  DISPLAY '*603*   WSE-2-1B-S-FLD2 = (' WSE-2-1B-S-FLD2 ')'
          logger.info("*603*   WSE-2-1B-S-FLD2 = ({})", new String(wse21bS.getWse21bSFld2())); 
//  DISPLAY '*604* WSE-2-1B-T        = (' WSE-2-1B-T ')'
          logger.info("*604* WSE-2-1B-T        = ({})", wse21bT.toString()); 
//  DISPLAY '*605*   WSE-2-1B-T-FLD1 = (' WSE-2-1B-T-FLD1 ')'
          logger.info("*605*   WSE-2-1B-T-FLD1 = ({})", new String(wse21bT.getWse21bTFld1())); 
//  DISPLAY '*606*   WSE-2-1B-T-FLD2 = (' WSE-2-1B-T-FLD2 ')'
          logger.info("*606*   WSE-2-1B-T-FLD2 = ({})", new String(wse21bT.getWse21bTFld2())); 
//  DISPLAY '*607*   WSE-2-1B-T-FLD3 = (' WSE-2-1B-T-FLD3 ')'
          logger.info("*607*   WSE-2-1B-T-FLD3 = ({})", new String(wse21bT.getWse21bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2A-S WSE-2-2A-T
          work.setWse22aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse22aT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2A-S
          work.setWse22aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-2A-S ( WS-ONE : LENGTH OF WSE-2-2A-S ) TO WSE-2-2A-T ( WS-ONE : LENGTH OF WSE-2-2A-T )
          wse22aT.replace(work.getWse22aS(),(work.getOne()-1)/* wse22aS */ ,WSE_22A_S_LENGTH,(work.getOne()-1),Wse22aT.getWse22aTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*608* WSE-2-2A-S        = (' WSE-2-2A-S ')'
          logger.info("*608* WSE-2-2A-S        = ({})", new String(work.getWse22aS())); 
//  DISPLAY '*609* WSE-2-2A-T        = (' WSE-2-2A-T ')'
          logger.info("*609* WSE-2-2A-T        = ({})", wse22aT.toString()); 
//  DISPLAY '*610*   WSE-2-2A-T-FLD1 = (' WSE-2-2A-T-FLD1 ')'
          logger.info("*610*   WSE-2-2A-T-FLD1 = ({})", new String(wse22aT.getWse22aTFld1())); 
//  DISPLAY '*611*   WSE-2-2A-T-FLD2 = (' WSE-2-2A-T-FLD2 ')'
          logger.info("*611*   WSE-2-2A-T-FLD2 = ({})", new String(wse22aT.getWse22aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2B-S WSE-2-2B-T
          work.setWse22bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse22bT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2B-S
          work.setWse22bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-2B-T-FLD3
          wse22bT.setWse22bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-2B-S ( WS-ONE : LENGTH OF WSE-2-2B-S ) TO WSE-2-2B-T ( WS-ONE : LENGTH OF WSE-2-2B-T )
          wse22bT.replace(work.getWse22bS(),(work.getOne()-1)/* wse22bS */ ,WSE_22B_S_LENGTH,(work.getOne()-1),Wse22bT.getWse22bTFieldLength() /* replace,startIndex,targetLen */);
      
      }
      /**
      * mainlineSplit22 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT22 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld1                    COBOL Name: WSE-2-2B-T-FLD1
      * - wse22bTFld2                    COBOL Name: WSE-2-2B-T-FLD2
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      *
      * Output :  

      * - wse23aS                        COBOL Name: WSE-2-3A-S
      * - wse23aT                        COBOL Name: WSE-2-3A-T
      * - wse23aSFld1                    COBOL Name: WSE-2-3A-S-FLD1
      * - wse23aSFld2                    COBOL Name: WSE-2-3A-S-FLD2
      * - wse23aTFld1                    COBOL Name: WSE-2-3A-T-FLD1
      * - wse23aTFld2                    COBOL Name: WSE-2-3A-T-FLD2
      * - wse23bS                        COBOL Name: WSE-2-3B-S
      * - wse23bT                        COBOL Name: WSE-2-3B-T
      * - wse23bSFld1                    COBOL Name: WSE-2-3B-S-FLD1
      * - wse23bSFld2                    COBOL Name: WSE-2-3B-S-FLD2
      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse23bTFld1                    COBOL Name: WSE-2-3B-T-FLD1
      * - wse23bTFld2                    COBOL Name: WSE-2-3B-T-FLD2
      * - wse24aS                        COBOL Name: WSE-2-4A-S
      * - wse24aT                        COBOL Name: WSE-2-4A-T
      * - wse24aTFld1                    COBOL Name: WSE-2-4A-T-FLD1
      * - wse24aTFld2                    COBOL Name: WSE-2-4A-T-FLD2
      * - wse24bS                        COBOL Name: WSE-2-4B-S
      * - wse24bT                        COBOL Name: WSE-2-4B-T
      * - wse24bTFld3                    COBOL Name: WSE-2-4B-T-FLD3
      * - wse24bTFld1                    COBOL Name: WSE-2-4B-T-FLD1
      * - wse24bTFld2                    COBOL Name: WSE-2-4B-T-FLD2
      * - wse21aS                        COBOL Name: WSE-2-1A-S
      * - wse21aT                        COBOL Name: WSE-2-1A-T
      * - wse21aSFld1                    COBOL Name: WSE-2-1A-S-FLD1
      * - wse21aSFld2                    COBOL Name: WSE-2-1A-S-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit22() throws Exception {

// *
//  DISPLAY '*612* WSE-2-2B-S        = (' WSE-2-2B-S ')'
          logger.info("*612* WSE-2-2B-S        = ({})", new String(work.getWse22bS())); 
//  DISPLAY '*613* WSE-2-2B-T        = (' WSE-2-2B-T ')'
          logger.info("*613* WSE-2-2B-T        = ({})", wse22bT.toString()); 
//  DISPLAY '*614*   WSE-2-2B-T-FLD1 = (' WSE-2-2B-T-FLD1 ')'
          logger.info("*614*   WSE-2-2B-T-FLD1 = ({})", new String(wse22bT.getWse22bTFld1())); 
//  DISPLAY '*615*   WSE-2-2B-T-FLD2 = (' WSE-2-2B-T-FLD2 ')'
          logger.info("*615*   WSE-2-2B-T-FLD2 = ({})", new String(wse22bT.getWse22bTFld2())); 
//  DISPLAY '*616*   WSE-2-2B-T-FLD3 = (' WSE-2-2B-T-FLD3 ')'
          logger.info("*616*   WSE-2-2B-T-FLD3 = ({})", new String(wse22bT.getWse22bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3A-S WSE-2-3A-T
          wse23aS.initialize();
          wse23aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3A-S-FLD1
          wse23aS.setWse23aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3A-S-FLD2
          wse23aS.setWse23aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-3A-S TO WSE-2-3A-T ( WS-ONE : LENGTH OF WSE-2-3A-T )
          wse23aT.replace(wse23aS.getCharArray(),0,wse23aS.length(),(work.getOne()-1),Wse23aT.getWse23aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*617* WSE-2-3A-S        = (' WSE-2-3A-S ')'
          logger.info("*617* WSE-2-3A-S        = ({})", wse23aS.toString()); 
//  DISPLAY '*618*   WSE-2-3A-S-FLD1 = (' WSE-2-3A-S-FLD1 ')'
          logger.info("*618*   WSE-2-3A-S-FLD1 = ({})", new String(wse23aS.getWse23aSFld1())); 
//  DISPLAY '*619*   WSE-2-3A-S-FLD2 = (' WSE-2-3A-S-FLD2 ')'
          logger.info("*619*   WSE-2-3A-S-FLD2 = ({})", new String(wse23aS.getWse23aSFld2())); 
//  DISPLAY '*620* WSE-2-3A-T        = (' WSE-2-3A-T ')'
          logger.info("*620* WSE-2-3A-T        = ({})", wse23aT.toString()); 
//  DISPLAY '*621*   WSE-2-3A-T-FLD1 = (' WSE-2-3A-T-FLD1 ')'
          logger.info("*621*   WSE-2-3A-T-FLD1 = ({})", new String(wse23aT.getWse23aTFld1())); 
//  DISPLAY '*622*   WSE-2-3A-T-FLD2 = (' WSE-2-3A-T-FLD2 ')'
          logger.info("*622*   WSE-2-3A-T-FLD2 = ({})", new String(wse23aT.getWse23aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3B-S WSE-2-3B-T
          wse23bS.initialize();
          wse23bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3B-S-FLD1
          wse23bS.setWse23bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3B-S-FLD2
          wse23bS.setWse23bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-3B-T-FLD3
          wse23bT.setWse23bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-3B-S TO WSE-2-3B-T ( WS-ONE : LENGTH OF WSE-2-3B-T )
          wse23bT.replace(wse23bS.getCharArray(),0,wse23bS.length(),(work.getOne()-1),Wse23bT.getWse23bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*623* WSE-2-3B-S        = (' WSE-2-3B-S ')'
          logger.info("*623* WSE-2-3B-S        = ({})", wse23bS.toString()); 
//  DISPLAY '*624*   WSE-2-3B-S-FLD1 = (' WSE-2-3B-S-FLD1 ')'
          logger.info("*624*   WSE-2-3B-S-FLD1 = ({})", new String(wse23bS.getWse23bSFld1())); 
//  DISPLAY '*625*   WSE-2-3B-S-FLD2 = (' WSE-2-3B-S-FLD2 ')'
          logger.info("*625*   WSE-2-3B-S-FLD2 = ({})", new String(wse23bS.getWse23bSFld2())); 
//  DISPLAY '*626* WSE-2-3B-T        = (' WSE-2-3B-T ')'
          logger.info("*626* WSE-2-3B-T        = ({})", wse23bT.toString()); 
//  DISPLAY '*627*   WSE-2-3B-T-FLD1 = (' WSE-2-3B-T-FLD1 ')'
          logger.info("*627*   WSE-2-3B-T-FLD1 = ({})", new String(wse23bT.getWse23bTFld1())); 
//  DISPLAY '*628*   WSE-2-3B-T-FLD2 = (' WSE-2-3B-T-FLD2 ')'
          logger.info("*628*   WSE-2-3B-T-FLD2 = ({})", new String(wse23bT.getWse23bTFld2())); 
//  DISPLAY '*629*   WSE-2-3B-T-FLD3 = (' WSE-2-3B-T-FLD3 ')'
          logger.info("*629*   WSE-2-3B-T-FLD3 = ({})", new String(wse23bT.getWse23bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4A-S WSE-2-4A-T
          work.setWse24aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse24aT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4A-S
          work.setWse24aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-4A-S TO WSE-2-4A-T ( WS-ONE : LENGTH OF WSE-2-4A-T )
          wse24aT.replace(work.getWse24aS(),0,work.getWse24aS().length,(work.getOne()-1),Wse24aT.getWse24aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*630* WSE-2-4A-S        = (' WSE-2-4A-S ')'
          logger.info("*630* WSE-2-4A-S        = ({})", new String(work.getWse24aS())); 
//  DISPLAY '*631* WSE-2-4A-T        = (' WSE-2-4A-T ')'
          logger.info("*631* WSE-2-4A-T        = ({})", wse24aT.toString()); 
//  DISPLAY '*632*   WSE-2-4A-T-FLD1 = (' WSE-2-4A-T-FLD1 ')'
          logger.info("*632*   WSE-2-4A-T-FLD1 = ({})", new String(wse24aT.getWse24aTFld1())); 
//  DISPLAY '*633*   WSE-2-4A-T-FLD2 = (' WSE-2-4A-T-FLD2 ')'
          logger.info("*633*   WSE-2-4A-T-FLD2 = ({})", new String(wse24aT.getWse24aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4B-S WSE-2-4B-T
          work.setWse24bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse24bT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4B-S
          work.setWse24bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-4B-T-FLD3
          wse24bT.setWse24bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-4B-S TO WSE-2-4B-T ( WS-ONE : LENGTH OF WSE-2-4B-T )
          wse24bT.replace(work.getWse24bS(),0,work.getWse24bS().length,(work.getOne()-1),Wse24bT.getWse24bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*634* WSE-2-4B-S        = (' WSE-2-4B-S ')'
          logger.info("*634* WSE-2-4B-S        = ({})", new String(work.getWse24bS())); 
//  DISPLAY '*635* WSE-2-4B-T        = (' WSE-2-4B-T ')'
          logger.info("*635* WSE-2-4B-T        = ({})", wse24bT.toString()); 
//  DISPLAY '*636*   WSE-2-4B-T-FLD1 = (' WSE-2-4B-T-FLD1 ')'
          logger.info("*636*   WSE-2-4B-T-FLD1 = ({})", new String(wse24bT.getWse24bTFld1())); 
//  DISPLAY '*637*   WSE-2-4B-T-FLD2 = (' WSE-2-4B-T-FLD2 ')'
          logger.info("*637*   WSE-2-4B-T-FLD2 = ({})", new String(wse24bT.getWse24bTFld2())); 
//  DISPLAY '*638*   WSE-2-4B-T-FLD3 = (' WSE-2-4B-T-FLD3 ')'
          logger.info("*638*   WSE-2-4B-T-FLD3 = ({})", new String(wse24bT.getWse24bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1A-S WSE-2-1A-T
          wse21aS.initialize();
          wse21aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1A-S-FLD1
          wse21aS.setWse21aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1A-S-FLD2
          wse21aS.setWse21aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-1A-S ( WS-THREE : LENGTH OF WSE-2-1A-S - 3 ) TO WSE-2-1A-T ( WS-FIVE : LENGTH OF WSE-2-1A-T - 5)
          wse21aT.replace(wse21aS,(work.getThree()-1),Wse21aS.getWse21aSFieldLength() - 3,(work.getFive()-1),Wse21aT.getWse21aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*639* WSE-2-1A-S        = (' WSE-2-1A-S ')'
          logger.info("*639* WSE-2-1A-S        = ({})", wse21aS.toString()); 
//  DISPLAY '*640*   WSE-2-1A-S-FLD1 = (' WSE-2-1A-S-FLD1 ')'
          logger.info("*640*   WSE-2-1A-S-FLD1 = ({})", new String(wse21aS.getWse21aSFld1())); 
//  DISPLAY '*641*   WSE-2-1A-S-FLD2 = (' WSE-2-1A-S-FLD2 ')'
          logger.info("*641*   WSE-2-1A-S-FLD2 = ({})", new String(wse21aS.getWse21aSFld2())); 
//  DISPLAY '*642* WSE-2-1A-T        = (' WSE-2-1A-T ')'
          logger.info("*642* WSE-2-1A-T        = ({})", wse21aT.toString()); 
      
      }
      /**
      * mainlineSplit23 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT23 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse21aTFld1                    COBOL Name: WSE-2-1A-T-FLD1
      * - wse21aTFld2                    COBOL Name: WSE-2-1A-T-FLD2
      *
      * Output :  

      * - wse21bS                        COBOL Name: WSE-2-1B-S
      * - wse21bT                        COBOL Name: WSE-2-1B-T
      * - wse21bSFld1                    COBOL Name: WSE-2-1B-S-FLD1
      * - wse21bSFld2                    COBOL Name: WSE-2-1B-S-FLD2
      * - wse21bTFld3                    COBOL Name: WSE-2-1B-T-FLD3
      * - wse21bTFld1                    COBOL Name: WSE-2-1B-T-FLD1
      * - wse21bTFld2                    COBOL Name: WSE-2-1B-T-FLD2
      * - wse22aS                        COBOL Name: WSE-2-2A-S
      * - wse22aT                        COBOL Name: WSE-2-2A-T
      * - wse22aTFld1                    COBOL Name: WSE-2-2A-T-FLD1
      * - wse22aTFld2                    COBOL Name: WSE-2-2A-T-FLD2
      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      * - wse22bTFld1                    COBOL Name: WSE-2-2B-T-FLD1
      * - wse22bTFld2                    COBOL Name: WSE-2-2B-T-FLD2
      * - wse23aS                        COBOL Name: WSE-2-3A-S
      * - wse23aT                        COBOL Name: WSE-2-3A-T
      * - wse23aSFld1                    COBOL Name: WSE-2-3A-S-FLD1
      * - wse23aSFld2                    COBOL Name: WSE-2-3A-S-FLD2
      * - wse23aTFld1                    COBOL Name: WSE-2-3A-T-FLD1
      * - wse23aTFld2                    COBOL Name: WSE-2-3A-T-FLD2
      * - wse23bS                        COBOL Name: WSE-2-3B-S
      * - wse23bT                        COBOL Name: WSE-2-3B-T
      * - wse23bSFld1                    COBOL Name: WSE-2-3B-S-FLD1
      * - wse23bSFld2                    COBOL Name: WSE-2-3B-S-FLD2
      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse23bTFld1                    COBOL Name: WSE-2-3B-T-FLD1
      * - wse23bTFld2                    COBOL Name: WSE-2-3B-T-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit23() throws Exception {
			// Declare local variables used in the method
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			// End of variable declaration

//  DISPLAY '*643*   WSE-2-1A-T-FLD1 = (' WSE-2-1A-T-FLD1 ')'
          logger.info("*643*   WSE-2-1A-T-FLD1 = ({})", new String(wse21aT.getWse21aTFld1())); 
//  DISPLAY '*644*   WSE-2-1A-T-FLD2 = (' WSE-2-1A-T-FLD2 ')'
          logger.info("*644*   WSE-2-1A-T-FLD2 = ({})", new String(wse21aT.getWse21aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1B-S WSE-2-1B-T
          wse21bS.initialize();
          wse21bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1B-S-FLD1
          wse21bS.setWse21bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1B-S-FLD2
          wse21bS.setWse21bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-1B-T-FLD3
          wse21bT.setWse21bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-1B-S ( WS-THREE : LENGTH OF WSE-2-1B-S - 3 ) TO WSE-2-1B-T ( WS-FIVE : LENGTH OF WSE-2-1B-T - 5)
          wse21bT.replace(wse21bS,(work.getThree()-1),Wse21bS.getWse21bSFieldLength() - 3,(work.getFive()-1),Wse21bT.getWse21bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*645* WSE-2-1B-S        = (' WSE-2-1B-S ')'
          logger.info("*645* WSE-2-1B-S        = ({})", wse21bS.toString()); 
//  DISPLAY '*646*   WSE-2-1B-S-FLD1 = (' WSE-2-1B-S-FLD1 ')'
          logger.info("*646*   WSE-2-1B-S-FLD1 = ({})", new String(wse21bS.getWse21bSFld1())); 
//  DISPLAY '*647*   WSE-2-1B-S-FLD2 = (' WSE-2-1B-S-FLD2 ')'
          logger.info("*647*   WSE-2-1B-S-FLD2 = ({})", new String(wse21bS.getWse21bSFld2())); 
//  DISPLAY '*648* WSE-2-1B-T        = (' WSE-2-1B-T ')'
          logger.info("*648* WSE-2-1B-T        = ({})", wse21bT.toString()); 
//  DISPLAY '*649*   WSE-2-1B-T-FLD1 = (' WSE-2-1B-T-FLD1 ')'
          logger.info("*649*   WSE-2-1B-T-FLD1 = ({})", new String(wse21bT.getWse21bTFld1())); 
//  DISPLAY '*650*   WSE-2-1B-T-FLD2 = (' WSE-2-1B-T-FLD2 ')'
          logger.info("*650*   WSE-2-1B-T-FLD2 = ({})", new String(wse21bT.getWse21bTFld2())); 
//  DISPLAY '*651*   WSE-2-1B-T-FLD3 = (' WSE-2-1B-T-FLD3 ')'
          logger.info("*651*   WSE-2-1B-T-FLD3 = ({})", new String(wse21bT.getWse21bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2A-S WSE-2-2A-T
          work.setWse22aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse22aT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2A-S
          work.setWse22aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-2A-S ( WS-THREE : LENGTH OF WSE-2-2A-S - 3 ) TO WSE-2-2A-T ( WS-FIVE : LENGTH OF WSE-2-2A-T - 5)
          wse22aT.replace(work.getWse22aS(),(work.getThree()-1)/* wse22aS */ ,WSE_22A_S_LENGTH - 3,(work.getFive()-1),Wse22aT.getWse22aTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*652* WSE-2-2A-S        = (' WSE-2-2A-S ')'
          logger.info("*652* WSE-2-2A-S        = ({})", new String(work.getWse22aS())); 
//  DISPLAY '*653* WSE-2-2A-T        = (' WSE-2-2A-T ')'
          logger.info("*653* WSE-2-2A-T        = ({})", wse22aT.toString()); 
//  DISPLAY '*654*   WSE-2-2A-T-FLD1 = (' WSE-2-2A-T-FLD1 ')'
          logger.info("*654*   WSE-2-2A-T-FLD1 = ({})", new String(wse22aT.getWse22aTFld1())); 
//  DISPLAY '*655*   WSE-2-2A-T-FLD2 = (' WSE-2-2A-T-FLD2 ')'
          logger.info("*655*   WSE-2-2A-T-FLD2 = ({})", new String(wse22aT.getWse22aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2B-S WSE-2-2B-T
          work.setWse22bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse22bT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2B-S
          work.setWse22bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-2B-T-FLD3
          wse22bT.setWse22bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-2B-S ( WS-THREE : LENGTH OF WSE-2-2B-S - 3 ) TO WSE-2-2B-T ( WS-FIVE : LENGTH OF WSE-2-2B-T - 5)
          wse22bT.replace(work.getWse22bS(),(work.getThree()-1)/* wse22bS */ ,WSE_22B_S_LENGTH - 3,(work.getFive()-1),Wse22bT.getWse22bTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*656* WSE-2-2B-S        = (' WSE-2-2B-S ')'
          logger.info("*656* WSE-2-2B-S        = ({})", new String(work.getWse22bS())); 
//  DISPLAY '*657* WSE-2-2B-T        = (' WSE-2-2B-T ')'
          logger.info("*657* WSE-2-2B-T        = ({})", wse22bT.toString()); 
//  DISPLAY '*658*   WSE-2-2B-T-FLD1 = (' WSE-2-2B-T-FLD1 ')'
          logger.info("*658*   WSE-2-2B-T-FLD1 = ({})", new String(wse22bT.getWse22bTFld1())); 
//  DISPLAY '*659*   WSE-2-2B-T-FLD2 = (' WSE-2-2B-T-FLD2 ')'
          logger.info("*659*   WSE-2-2B-T-FLD2 = ({})", new String(wse22bT.getWse22bTFld2())); 
//  DISPLAY '*660*   WSE-2-2B-T-FLD3 = (' WSE-2-2B-T-FLD3 ')'
          logger.info("*660*   WSE-2-2B-T-FLD3 = ({})", new String(wse22bT.getWse22bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3A-S WSE-2-3A-T
          wse23aS.initialize();
          wse23aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3A-S-FLD1
          wse23aS.setWse23aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3A-S-FLD2
          wse23aS.setWse23aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-3A-S TO WSE-2-3A-T ( WS-FIVE : LENGTH OF WSE-2-3A-T - 5)
          wse23aT.replace(wse23aS.getCharArray(),0,wse23aS.length(),(work.getFive()-1),Wse23aT.getWse23aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*661* WSE-2-3A-S        = (' WSE-2-3A-S ')'
          logger.info("*661* WSE-2-3A-S        = ({})", wse23aS.toString()); 
//  DISPLAY '*662*   WSE-2-3A-S-FLD1 = (' WSE-2-3A-S-FLD1 ')'
          logger.info("*662*   WSE-2-3A-S-FLD1 = ({})", new String(wse23aS.getWse23aSFld1())); 
//  DISPLAY '*663*   WSE-2-3A-S-FLD2 = (' WSE-2-3A-S-FLD2 ')'
          logger.info("*663*   WSE-2-3A-S-FLD2 = ({})", new String(wse23aS.getWse23aSFld2())); 
//  DISPLAY '*664* WSE-2-3A-T        = (' WSE-2-3A-T ')'
          logger.info("*664* WSE-2-3A-T        = ({})", wse23aT.toString()); 
//  DISPLAY '*665*   WSE-2-3A-T-FLD1 = (' WSE-2-3A-T-FLD1 ')'
          logger.info("*665*   WSE-2-3A-T-FLD1 = ({})", new String(wse23aT.getWse23aTFld1())); 
//  DISPLAY '*666*   WSE-2-3A-T-FLD2 = (' WSE-2-3A-T-FLD2 ')'
          logger.info("*666*   WSE-2-3A-T-FLD2 = ({})", new String(wse23aT.getWse23aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3B-S WSE-2-3B-T
          wse23bS.initialize();
          wse23bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3B-S-FLD1
          wse23bS.setWse23bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3B-S-FLD2
          wse23bS.setWse23bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-3B-T-FLD3
          wse23bT.setWse23bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-3B-S TO WSE-2-3B-T ( WS-FIVE : LENGTH OF WSE-2-3B-T - 5)
          wse23bT.replace(wse23bS.getCharArray(),0,wse23bS.length(),(work.getFive()-1),Wse23bT.getWse23bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*667* WSE-2-3B-S        = (' WSE-2-3B-S ')'
          logger.info("*667* WSE-2-3B-S        = ({})", wse23bS.toString()); 
//  DISPLAY '*668*   WSE-2-3B-S-FLD1 = (' WSE-2-3B-S-FLD1 ')'
          logger.info("*668*   WSE-2-3B-S-FLD1 = ({})", new String(wse23bS.getWse23bSFld1())); 
//  DISPLAY '*669*   WSE-2-3B-S-FLD2 = (' WSE-2-3B-S-FLD2 ')'
          logger.info("*669*   WSE-2-3B-S-FLD2 = ({})", new String(wse23bS.getWse23bSFld2())); 
//  DISPLAY '*670* WSE-2-3B-T        = (' WSE-2-3B-T ')'
          logger.info("*670* WSE-2-3B-T        = ({})", wse23bT.toString()); 
//  DISPLAY '*671*   WSE-2-3B-T-FLD1 = (' WSE-2-3B-T-FLD1 ')'
          logger.info("*671*   WSE-2-3B-T-FLD1 = ({})", new String(wse23bT.getWse23bTFld1())); 
//  DISPLAY '*672*   WSE-2-3B-T-FLD2 = (' WSE-2-3B-T-FLD2 ')'
          logger.info("*672*   WSE-2-3B-T-FLD2 = ({})", new String(wse23bT.getWse23bTFld2())); 
      
      }
      /**
      * mainlineSplit24 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT24 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse25aSGrp                     COBOL Name: WSE-2-5A-S-GRP
      * - wse25bSGrp                     COBOL Name: WSE-2-5B-S-GRP
      * - wse26aSGrp                     COBOL Name: WSE-2-6A-S-GRP
      *
      * Output :  

      * - wse24aS                        COBOL Name: WSE-2-4A-S
      * - wse24aT                        COBOL Name: WSE-2-4A-T
      * - wse24aTFld1                    COBOL Name: WSE-2-4A-T-FLD1
      * - wse24aTFld2                    COBOL Name: WSE-2-4A-T-FLD2
      * - wse24bS                        COBOL Name: WSE-2-4B-S
      * - wse24bT                        COBOL Name: WSE-2-4B-T
      * - wse24bTFld3                    COBOL Name: WSE-2-4B-T-FLD3
      * - wse24bTFld1                    COBOL Name: WSE-2-4B-T-FLD1
      * - wse24bTFld2                    COBOL Name: WSE-2-4B-T-FLD2
      * - wse25aS                        COBOL Name: WSE-2-5A-S
      * - wse25aT                        COBOL Name: WSE-2-5A-T
      * - wse25aSFld1                    COBOL Name: WSE-2-5A-S-FLD1
      * - wse25aSFld2                    COBOL Name: WSE-2-5A-S-FLD2
      * - wse25aTFld1                    COBOL Name: WSE-2-5A-T-FLD1
      * - wse25aTFld2                    COBOL Name: WSE-2-5A-T-FLD2
      * - wse25bS                        COBOL Name: WSE-2-5B-S
      * - wse25bT                        COBOL Name: WSE-2-5B-T
      * - wse25bSFld1                    COBOL Name: WSE-2-5B-S-FLD1
      * - wse25bSFld2                    COBOL Name: WSE-2-5B-S-FLD2
      * - wse25bTFld3                    COBOL Name: WSE-2-5B-T-FLD3
      * - wse25bTFld1                    COBOL Name: WSE-2-5B-T-FLD1
      * - wse25bTFld2                    COBOL Name: WSE-2-5B-T-FLD2
      * - wse26aS                        COBOL Name: WSE-2-6A-S
      * - wse26aT                        COBOL Name: WSE-2-6A-T
      * - wse26aTFld1                    COBOL Name: WSE-2-6A-T-FLD1
      * - wse26aTFld2                    COBOL Name: WSE-2-6A-T-FLD2
      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bT                        COBOL Name: WSE-2-6B-T
      *
      * @throws CFException
      */
      private void mainlineSplit24() throws Exception {
			// Declare local variables used in the method
			Wse25aS wse25aS = wse25aSGrp.getWse25aS();
			Wse25bS wse25bS = wse25bSGrp.getWse25bS();
			 final int WSE_26A_S_LENGTH = 60;
			// End of variable declaration

//  DISPLAY '*673*   WSE-2-3B-T-FLD3 = (' WSE-2-3B-T-FLD3 ')'
          logger.info("*673*   WSE-2-3B-T-FLD3 = ({})", new String(wse23bT.getWse23bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4A-S WSE-2-4A-T
          work.setWse24aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse24aT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4A-S
          work.setWse24aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-4A-S TO WSE-2-4A-T ( WS-FIVE : LENGTH OF WSE-2-4A-T - 5)
          wse24aT.replace(work.getWse24aS(),0,work.getWse24aS().length,(work.getFive()-1),Wse24aT.getWse24aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*674* WSE-2-4A-S        = (' WSE-2-4A-S ')'
          logger.info("*674* WSE-2-4A-S        = ({})", new String(work.getWse24aS())); 
//  DISPLAY '*675* WSE-2-4A-T        = (' WSE-2-4A-T ')'
          logger.info("*675* WSE-2-4A-T        = ({})", wse24aT.toString()); 
//  DISPLAY '*676*   WSE-2-4A-T-FLD1 = (' WSE-2-4A-T-FLD1 ')'
          logger.info("*676*   WSE-2-4A-T-FLD1 = ({})", new String(wse24aT.getWse24aTFld1())); 
//  DISPLAY '*677*   WSE-2-4A-T-FLD2 = (' WSE-2-4A-T-FLD2 ')'
          logger.info("*677*   WSE-2-4A-T-FLD2 = ({})", new String(wse24aT.getWse24aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4B-S WSE-2-4B-T
          work.setWse24bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse24bT.initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4B-S
          work.setWse24bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-4B-T-FLD3
          wse24bT.setWse24bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-4B-S TO WSE-2-4B-T ( WS-FIVE : LENGTH OF WSE-2-4B-T - 5)
          wse24bT.replace(work.getWse24bS(),0,work.getWse24bS().length,(work.getFive()-1),Wse24bT.getWse24bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*678* WSE-2-4B-S        = (' WSE-2-4B-S ')'
          logger.info("*678* WSE-2-4B-S        = ({})", new String(work.getWse24bS())); 
//  DISPLAY '*679* WSE-2-4B-T        = (' WSE-2-4B-T ')'
          logger.info("*679* WSE-2-4B-T        = ({})", wse24bT.toString()); 
//  DISPLAY '*680*   WSE-2-4B-T-FLD1 = (' WSE-2-4B-T-FLD1 ')'
          logger.info("*680*   WSE-2-4B-T-FLD1 = ({})", new String(wse24bT.getWse24bTFld1())); 
//  DISPLAY '*681*   WSE-2-4B-T-FLD2 = (' WSE-2-4B-T-FLD2 ')'
          logger.info("*681*   WSE-2-4B-T-FLD2 = ({})", new String(wse24bT.getWse24bTFld2())); 
//  DISPLAY '*682*   WSE-2-4B-T-FLD3 = (' WSE-2-4B-T-FLD3 ')'
          logger.info("*682*   WSE-2-4B-T-FLD3 = ({})", new String(wse24bT.getWse24bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; src offset 3
// *
//  INITIALIZE WSE-2-5A-S WSE-2-5A-T
          wse25aSGrp.getWse25aS().initialize();
          wse25aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-5A-S-FLD1
          wse25aS.setWse25aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-5A-S-FLD2
          wse25aS.setWse25aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE WSE-2-5A-S ( WS-ONE : LENGTH OF WSE-2-5A-S ) TO WSE-2-5A-T ( WS-ONE : LENGTH OF WSE-2-5A-T )
          wse25aT.replace(wse25aSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse25aT) */,Wse25aS.getWse25aSFieldLength()/*fromLen*/,0+work.getOne() - 1/*toOffset - (wse25aS) */,Wse25aT.getWse25aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*683* WSE-2-5A-S-GRP    = (' WSE-2-5A-S-GRP ')'
          logger.info("*683* WSE-2-5A-S-GRP    = ({})", wse25aSGrp.toString()); 
//  DISPLAY '*684* WSE-2-5A-S        = (' WSE-2-5A-S ')'
          logger.info("*684* WSE-2-5A-S        = ({})", wse25aSGrp.getWse25aS().toString()); 
//  DISPLAY '*685*   WSE-2-5A-S-FLD1 = (' WSE-2-5A-S-FLD1 ')'
          logger.info("*685*   WSE-2-5A-S-FLD1 = ({})", new String(wse25aS.getWse25aSFld1())); 
  
//  DISPLAY '*686*   WSE-2-5A-S-FLD2 = (' WSE-2-5A-S-FLD2 ')'
          logger.info("*686*   WSE-2-5A-S-FLD2 = ({})", new String(wse25aS.getWse25aSFld2())); 
  
//  DISPLAY '*687* WSE-2-5A-T        = (' WSE-2-5A-T ')'
          logger.info("*687* WSE-2-5A-T        = ({})", wse25aT.toString()); 
//  DISPLAY '*688*   WSE-2-5A-T-FLD1 = (' WSE-2-5A-T-FLD1 ')'
          logger.info("*688*   WSE-2-5A-T-FLD1 = ({})", new String(wse25aT.getWse25aTFld1())); 
//  DISPLAY '*689*   WSE-2-5A-T-FLD2 = (' WSE-2-5A-T-FLD2 ')'
          logger.info("*689*   WSE-2-5A-T-FLD2 = ({})", new String(wse25aT.getWse25aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ;src offset 3
// *
//  INITIALIZE WSE-2-5B-S WSE-2-5B-T
          wse25bSGrp.getWse25bS().initialize();
          wse25bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-5B-S-FLD1
          wse25bS.setWse25bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-5B-S-FLD2
          wse25bS.setWse25bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE ALL 'MNOP' TO WSE-2-5B-T-FLD3
          wse25bT.setWse25bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-5B-S ( WS-ONE : LENGTH OF WSE-2-5B-S ) TO WSE-2-5B-T ( WS-ONE : LENGTH OF WSE-2-5B-T )
          wse25bT.replace(wse25bSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse25bT) */,Wse25bS.getWse25bSFieldLength()/*fromLen*/,0+work.getOne() - 1/*toOffset - (wse25bS) */,Wse25bT.getWse25bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*690* WSE-2-5B-S-GRP    = (' WSE-2-5B-S-GRP ')'
          logger.info("*690* WSE-2-5B-S-GRP    = ({})", wse25bSGrp.toString()); 
//  DISPLAY '*691* WSE-2-5B-S        = (' WSE-2-5B-S ')'
          logger.info("*691* WSE-2-5B-S        = ({})", wse25bSGrp.getWse25bS().toString()); 
//  DISPLAY '*692*   WSE-2-5B-S-FLD1 = (' WSE-2-5B-S-FLD1 ')'
          logger.info("*692*   WSE-2-5B-S-FLD1 = ({})", new String(wse25bS.getWse25bSFld1())); 
  
//  DISPLAY '*693*   WSE-2-5B-S-FLD2 = (' WSE-2-5B-S-FLD2 ')'
          logger.info("*693*   WSE-2-5B-S-FLD2 = ({})", new String(wse25bS.getWse25bSFld2())); 
  
//  DISPLAY '*694* WSE-2-5B-T        = (' WSE-2-5B-T ')'
          logger.info("*694* WSE-2-5B-T        = ({})", wse25bT.toString()); 
//  DISPLAY '*695*   WSE-2-5B-T-FLD1 = (' WSE-2-5B-T-FLD1 ')'
          logger.info("*695*   WSE-2-5B-T-FLD1 = ({})", new String(wse25bT.getWse25bTFld1())); 
//  DISPLAY '*696*   WSE-2-5B-T-FLD2 = (' WSE-2-5B-T-FLD2 ')'
          logger.info("*696*   WSE-2-5B-T-FLD2 = ({})", new String(wse25bT.getWse25bTFld2())); 
//  DISPLAY '*697*   WSE-2-5B-T-FLD3 = (' WSE-2-5B-T-FLD3 ')'
          logger.info("*697*   WSE-2-5B-T-FLD3 = ({})", new String(wse25bT.getWse25bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt ; srcoffset 3
// *
//  INITIALIZE WSE-2-6A-S WSE-2-6A-T
          wse26aSGrp.setWse26aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse26aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-6A-S
          wse26aSGrp.setWse26aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-6A-S ( WS-ONE : LENGTH OF WSE-2-6A-S ) TO WSE-2-6A-T ( WS-ONE : LENGTH OF WSE-2-6A-T )
          wse26aT.replace(wse26aSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse26aT) */,WSE_26A_S_LENGTH/*fromLen*/,0+work.getOne() - 1/*toOffset - (wse26aS) */,Wse26aT.getWse26aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*698* WSE-2-6A-S-GRP    = (' WSE-2-6A-S-GRP ')'
          logger.info("*698* WSE-2-6A-S-GRP    = ({})", wse26aSGrp.toString()); 
//  DISPLAY '*699* WSE-2-6A-S        = (' WSE-2-6A-S ')'
          logger.info("*699* WSE-2-6A-S        = ({})", new String(wse26aSGrp.getWse26aS())); 
//  DISPLAY '*700* WSE-2-6A-T        = (' WSE-2-6A-T ')'
          logger.info("*700* WSE-2-6A-T        = ({})", wse26aT.toString()); 
//  DISPLAY '*701*   WSE-2-6A-T-FLD1 = (' WSE-2-6A-T-FLD1 ')'
          logger.info("*701*   WSE-2-6A-T-FLD1 = ({})", new String(wse26aT.getWse26aTFld1())); 
//  DISPLAY '*702*   WSE-2-6A-T-FLD2 = (' WSE-2-6A-T-FLD2 ')'
          logger.info("*702*   WSE-2-6A-T-FLD2 = ({})", new String(wse26aT.getWse26aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt; srcoffset 3
// *
//  INITIALIZE WSE-2-6B-S WSE-2-6B-T
          wse26bSGrp.setWse26bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse26bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-6B-S
          wse26bSGrp.setWse26bS(CONSTANTS.LITERAL_1122147122);
      
      }
      /**
      * mainlineSplit25 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT25 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bSGrp                     COBOL Name: WSE-2-6B-S-GRP
      * - wse27aTGrp                     COBOL Name: WSE-2-7A-T-GRP
      * - wse27bTGrp                     COBOL Name: WSE-2-7B-T-GRP
      * - wse28aTGrp                     COBOL Name: WSE-2-8A-T-GRP
      * - wse28bTGrp                     COBOL Name: WSE-2-8B-T-GRP
      *
      * Output :  

      * - wse26bTFld3                    COBOL Name: WSE-2-6B-T-FLD3
      * - wse26bT                        COBOL Name: WSE-2-6B-T
      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bTFld1                    COBOL Name: WSE-2-6B-T-FLD1
      * - wse26bTFld2                    COBOL Name: WSE-2-6B-T-FLD2
      * - wse27aS                        COBOL Name: WSE-2-7A-S
      * - wse27aT                        COBOL Name: WSE-2-7A-T
      * - wse27aSFld1                    COBOL Name: WSE-2-7A-S-FLD1
      * - wse27aSFld2                    COBOL Name: WSE-2-7A-S-FLD2
      * - wse27aTFld1                    COBOL Name: WSE-2-7A-T-FLD1
      * - wse27aTFld2                    COBOL Name: WSE-2-7A-T-FLD2
      * - wse27bS                        COBOL Name: WSE-2-7B-S
      * - wse27bT                        COBOL Name: WSE-2-7B-T
      * - wse27bSFld1                    COBOL Name: WSE-2-7B-S-FLD1
      * - wse27bSFld2                    COBOL Name: WSE-2-7B-S-FLD2
      * - wse27bTFld3                    COBOL Name: WSE-2-7B-T-FLD3
      * - wse27bTFld1                    COBOL Name: WSE-2-7B-T-FLD1
      * - wse27bTFld2                    COBOL Name: WSE-2-7B-T-FLD2
      * - wse28aS                        COBOL Name: WSE-2-8A-S
      * - wse28aT                        COBOL Name: WSE-2-8A-T
      * - wse28aTFld1                    COBOL Name: WSE-2-8A-T-FLD1
      * - wse28aTFld2                    COBOL Name: WSE-2-8A-T-FLD2
      * - wse28bS                        COBOL Name: WSE-2-8B-S
      * - wse28bT                        COBOL Name: WSE-2-8B-T
      * - wse28bTFld3                    COBOL Name: WSE-2-8B-T-FLD3
      * - wse28bTFld1                    COBOL Name: WSE-2-8B-T-FLD1
      * - wse28bTFld2                    COBOL Name: WSE-2-8B-T-FLD2
      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aT                        COBOL Name: WSE-2-9A-T
      *
      * @throws CFException
      */
      private void mainlineSplit25() throws Exception {
			// Declare local variables used in the method
			 final int WSE_26B_S_LENGTH = 60;
			 final int WSE_28A_S_LENGTH = 60;
			 final int WSE_28B_S_LENGTH = 60;
			Wse27aT wse27aT = wse27aTGrp.getWse27aT();
			Wse27bT wse27bT = wse27bTGrp.getWse27bT();
			Wse28aT wse28aT = wse28aTGrp.getWse28aT();
			Wse28bT wse28bT = wse28bTGrp.getWse28bT();
			// End of variable declaration

//  MOVE ALL 'MNOP' TO WSE-2-6B-T-FLD3
          wse26bT.setWse26bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-6B-S ( WS-ONE : LENGTH OF WSE-2-6B-S ) TO WSE-2-6B-T ( WS-ONE : LENGTH OF WSE-2-6B-T )
          wse26bT.replace(wse26bSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse26bT) */,WSE_26B_S_LENGTH/*fromLen*/,0+work.getOne() - 1/*toOffset - (wse26bS) */,Wse26bT.getWse26bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*703* WSE-2-6B-S-GRP    = (' WSE-2-6B-S-GRP ')'
          logger.info("*703* WSE-2-6B-S-GRP    = ({})", wse26bSGrp.toString()); 
//  DISPLAY '*704* WSE-2-6B-S        = (' WSE-2-6B-S ')'
          logger.info("*704* WSE-2-6B-S        = ({})", new String(wse26bSGrp.getWse26bS())); 
//  DISPLAY '*705* WSE-2-6B-T        = (' WSE-2-6B-T ')'
          logger.info("*705* WSE-2-6B-T        = ({})", wse26bT.toString()); 
//  DISPLAY '*706*   WSE-2-6B-T-FLD1 = (' WSE-2-6B-T-FLD1 ')'
          logger.info("*706*   WSE-2-6B-T-FLD1 = ({})", new String(wse26bT.getWse26bTFld1())); 
//  DISPLAY '*707*   WSE-2-6B-T-FLD2 = (' WSE-2-6B-T-FLD2 ')'
          logger.info("*707*   WSE-2-6B-T-FLD2 = ({})", new String(wse26bT.getWse26bTFld2())); 
//  DISPLAY '*708*   WSE-2-6B-T-FLD3 = (' WSE-2-6B-T-FLD3 ')'
          logger.info("*708*   WSE-2-6B-T-FLD3 = ({})", new String(wse26bT.getWse26bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; tgt offset 5
// *
//  INITIALIZE WSE-2-7A-S WSE-2-7A-T
          wse27aS.initialize();
          wse27aTGrp.getWse27aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-7A-S-FLD1
          wse27aS.setWse27aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-7A-S-FLD2
          wse27aS.setWse27aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-7A-S ( WS-ONE : LENGTH OF WSE-2-7A-S ) TO WSE-2-7A-T ( WS-ONE : LENGTH OF WSE-2-7A-T )
          wse27aTGrp.getWse27aT().replace(wse27aS,(work.getOne()-1),Wse27aS.getWse27aSFieldLength(), (wse27aTGrp.getWse27aT().begin + (work.getOne()-1)) ,Wse27aT.getWse27aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*709* WSE-2-7A-S        = (' WSE-2-7A-S ')'
          logger.info("*709* WSE-2-7A-S        = ({})", wse27aS.toString()); 
//  DISPLAY '*710*   WSE-2-7A-S-FLD1 = (' WSE-2-7A-S-FLD1 ')'
          logger.info("*710*   WSE-2-7A-S-FLD1 = ({})", new String(wse27aS.getWse27aSFld1())); 
//  DISPLAY '*711*   WSE-2-7A-S-FLD2 = (' WSE-2-7A-S-FLD2 ')'
          logger.info("*711*   WSE-2-7A-S-FLD2 = ({})", new String(wse27aS.getWse27aSFld2())); 
//  DISPLAY '*712* WSE-2-7A-T-GRP    = (' WSE-2-7A-T-GRP ')'
          logger.info("*712* WSE-2-7A-T-GRP    = ({})", wse27aTGrp.toString()); 
//  DISPLAY '*713* WSE-2-7A-T        = (' WSE-2-7A-T ')'
          logger.info("*713* WSE-2-7A-T        = ({})", wse27aTGrp.getWse27aT().toString()); 
//  DISPLAY '*714*   WSE-2-7A-T-FLD1 = (' WSE-2-7A-T-FLD1 ')'
          logger.info("*714*   WSE-2-7A-T-FLD1 = ({})", new String(wse27aT.getWse27aTFld1())); 
  
//  DISPLAY '*715*   WSE-2-7A-T-FLD2 = (' WSE-2-7A-T-FLD2 ')'
          logger.info("*715*   WSE-2-7A-T-FLD2 = ({})", new String(wse27aT.getWse27aTFld2())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt ;tgt offset 5
// *
//  INITIALIZE WSE-2-7B-S WSE-2-7B-T
          wse27bS.initialize();
          wse27bTGrp.getWse27bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-7B-S-FLD1
          wse27bS.setWse27bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-7B-S-FLD2
          wse27bS.setWse27bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-7B-T-FLD3
          wse27bT.setWse27bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-7B-S ( WS-ONE : LENGTH OF WSE-2-7B-S ) TO WSE-2-7B-T ( WS-ONE : LENGTH OF WSE-2-7B-T )
          wse27bTGrp.getWse27bT().replace(wse27bS,(work.getOne()-1),Wse27bS.getWse27bSFieldLength(), (wse27bTGrp.getWse27bT().begin + (work.getOne()-1)) ,Wse27bT.getWse27bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*716* WSE-2-7B-S        = (' WSE-2-7B-S ')'
          logger.info("*716* WSE-2-7B-S        = ({})", wse27bS.toString()); 
//  DISPLAY '*717*   WSE-2-7B-S-FLD1 = (' WSE-2-7B-S-FLD1 ')'
          logger.info("*717*   WSE-2-7B-S-FLD1 = ({})", new String(wse27bS.getWse27bSFld1())); 
//  DISPLAY '*718*   WSE-2-7B-S-FLD2 = (' WSE-2-7B-S-FLD2 ')'
          logger.info("*718*   WSE-2-7B-S-FLD2 = ({})", new String(wse27bS.getWse27bSFld2())); 
//  DISPLAY '*719* WSE-2-7B-T-GRP    = (' WSE-2-7B-T-GRP ')'
          logger.info("*719* WSE-2-7B-T-GRP    = ({})", wse27bTGrp.toString()); 
//  DISPLAY '*720* WSE-2-7B-T        = (' WSE-2-7B-T ')'
          logger.info("*720* WSE-2-7B-T        = ({})", wse27bTGrp.getWse27bT().toString()); 
//  DISPLAY '*721*   WSE-2-7B-T-FLD1 = (' WSE-2-7B-T-FLD1 ')'
          logger.info("*721*   WSE-2-7B-T-FLD1 = ({})", new String(wse27bT.getWse27bTFld1())); 
  
//  DISPLAY '*722*   WSE-2-7B-T-FLD2 = (' WSE-2-7B-T-FLD2 ')'
          logger.info("*722*   WSE-2-7B-T-FLD2 = ({})", new String(wse27bT.getWse27bTFld2())); 
  
//  DISPLAY '*723*   WSE-2-7B-T-FLD3 = (' WSE-2-7B-T-FLD3 ')'
          logger.info("*723*   WSE-2-7B-T-FLD3 = ({})", new String(wse27bT.getWse27bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt ; tgtoffset 5
// *
//  INITIALIZE WSE-2-8A-S WSE-2-8A-T
          work.setWse28aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse28aTGrp.getWse28aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-8A-S
          work.setWse28aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-8A-S ( WS-ONE : LENGTH OF WSE-2-8A-S ) TO WSE-2-8A-T ( WS-ONE : LENGTH OF WSE-2-8A-T )
          wse28aTGrp.setWse28aT(work.getWse28aS(),(work.getOne()-1)/* wse28aS */ ,WSE_28A_S_LENGTH,(work.getOne()-1),Wse28aT.getWse28aTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*724* WSE-2-8A-S        = (' WSE-2-8A-S ')'
          logger.info("*724* WSE-2-8A-S        = ({})", new String(work.getWse28aS())); 
//  DISPLAY '*725* WSE-2-8A-T-GRP    = (' WSE-2-8A-T-GRP ')'
          logger.info("*725* WSE-2-8A-T-GRP    = ({})", wse28aTGrp.toString()); 
//  DISPLAY '*726* WSE-2-8A-T        = (' WSE-2-8A-T ')'
          logger.info("*726* WSE-2-8A-T        = ({})", wse28aTGrp.getWse28aT().toString()); 
//  DISPLAY '*727*   WSE-2-8A-T-FLD1 = (' WSE-2-8A-T-FLD1 ')'
          logger.info("*727*   WSE-2-8A-T-FLD1 = ({})", new String(wse28aT.getWse28aTFld1())); 
  
//  DISPLAY '*728*   WSE-2-8A-T-FLD2 = (' WSE-2-8A-T-FLD2 ')'
          logger.info("*728*   WSE-2-8A-T-FLD2 = ({})", new String(wse28aT.getWse28aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt; tgtoffset 5
// *
//  INITIALIZE WSE-2-8B-S WSE-2-8B-T
          work.setWse28bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse28bTGrp.getWse28bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-8B-S
          work.setWse28bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-8B-T-FLD3
          wse28bT.setWse28bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-8B-S ( WS-ONE : LENGTH OF WSE-2-8B-S ) TO WSE-2-8B-T ( WS-ONE : LENGTH OF WSE-2-8B-T )
          wse28bTGrp.setWse28bT(work.getWse28bS(),(work.getOne()-1)/* wse28bS */ ,WSE_28B_S_LENGTH,(work.getOne()-1),Wse28bT.getWse28bTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*729* WSE-2-8B-S        = (' WSE-2-8B-S ')'
          logger.info("*729* WSE-2-8B-S        = ({})", new String(work.getWse28bS())); 
//  DISPLAY '*730* WSE-2-8B-T-GRP    = (' WSE-2-8B-T-GRP ')'
          logger.info("*730* WSE-2-8B-T-GRP    = ({})", wse28bTGrp.toString()); 
//  DISPLAY '*731* WSE-2-8B-T        = (' WSE-2-8B-T ')'
          logger.info("*731* WSE-2-8B-T        = ({})", wse28bTGrp.getWse28bT().toString()); 
//  DISPLAY '*732*   WSE-2-8B-T-FLD1 = (' WSE-2-8B-T-FLD1 ')'
          logger.info("*732*   WSE-2-8B-T-FLD1 = ({})", new String(wse28bT.getWse28bTFld1())); 
  
//  DISPLAY '*733*   WSE-2-8B-T-FLD2 = (' WSE-2-8B-T-FLD2 ')'
          logger.info("*733*   WSE-2-8B-T-FLD2 = ({})", new String(wse28bT.getWse28bTFld2())); 
  
//  DISPLAY '*734*   WSE-2-8B-T-FLD3 = (' WSE-2-8B-T-FLD3 ')'
          logger.info("*734*   WSE-2-8B-T-FLD3 = ({})", new String(wse28bT.getWse28bTFld3())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-9A-S WSE-2-9A-T
          wse29aSGrp.getWse29aS().initialize();
          wse29aTGrp.getWse29aT().initialize();
      
      }
      /**
      * mainlineSplit26 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT26 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aSGrp                     COBOL Name: WSE-2-9A-S-GRP
      * - wse29aTGrp                     COBOL Name: WSE-2-9A-T-GRP
      * - wse29bSGrp                     COBOL Name: WSE-2-9B-S-GRP
      * - wse29bTGrp                     COBOL Name: WSE-2-9B-T-GRP
      * - wse210aSGrp                    COBOL Name: WSE-2-10A-S-GRP
      * - wse210aTGrp                    COBOL Name: WSE-2-10A-T-GRP
      * - wse210bSGrp                    COBOL Name: WSE-2-10B-S-GRP
      * - wse210bTGrp                    COBOL Name: WSE-2-10B-T-GRP
      *
      * Output :  

      * - wse29aSFld1                    COBOL Name: WSE-2-9A-S-FLD1
      * - wse29aSFld2                    COBOL Name: WSE-2-9A-S-FLD2
      * - wse29aT                        COBOL Name: WSE-2-9A-T
      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aTFld1                    COBOL Name: WSE-2-9A-T-FLD1
      * - wse29aTFld2                    COBOL Name: WSE-2-9A-T-FLD2
      * - wse29bS                        COBOL Name: WSE-2-9B-S
      * - wse29bT                        COBOL Name: WSE-2-9B-T
      * - wse29bSFld1                    COBOL Name: WSE-2-9B-S-FLD1
      * - wse29bSFld2                    COBOL Name: WSE-2-9B-S-FLD2
      * - wse29bTFld3                    COBOL Name: WSE-2-9B-T-FLD3
      * - wse29bTFld1                    COBOL Name: WSE-2-9B-T-FLD1
      * - wse29bTFld2                    COBOL Name: WSE-2-9B-T-FLD2
      * - wse210aS                       COBOL Name: WSE-2-10A-S
      * - wse210aT                       COBOL Name: WSE-2-10A-T
      * - wse210aTFld1                   COBOL Name: WSE-2-10A-T-FLD1
      * - wse210aTFld2                   COBOL Name: WSE-2-10A-T-FLD2
      * - wse210bS                       COBOL Name: WSE-2-10B-S
      * - wse210bT                       COBOL Name: WSE-2-10B-T
      * - wse210bTFld3                   COBOL Name: WSE-2-10B-T-FLD3
      * - wse210bTFld1                   COBOL Name: WSE-2-10B-T-FLD1
      * - wse210bTFld2                   COBOL Name: WSE-2-10B-T-FLD2
      * - wse211aS                       COBOL Name: WSE-2-11A-S
      * - wse211aT                       COBOL Name: WSE-2-11A-T
      * - wse211aSFld1                   COBOL Name: WSE-2-11A-S-FLD1
      * - wse211aSFld2                   COBOL Name: WSE-2-11A-S-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit26() throws Exception {
			// Declare local variables used in the method
			Wse29aS wse29aS = wse29aSGrp.getWse29aS();
			Wse29aT wse29aT = wse29aTGrp.getWse29aT();
			Wse29bS wse29bS = wse29bSGrp.getWse29bS();
			Wse29bT wse29bT = wse29bTGrp.getWse29bT();
			 final int WSE_210A_S_LENGTH = 60;
			 final int WSE_210B_S_LENGTH = 60;
			Wse210aT wse210aT = wse210aTGrp.getWse210aT();
			Wse210bT wse210bT = wse210bTGrp.getWse210bT();
			// End of variable declaration

//  MOVE ALL 'ABCD' TO WSE-2-9A-S-FLD1
          wse29aS.setWse29aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-9A-S-FLD2
          wse29aS.setWse29aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE WSE-2-9A-S ( WS-ONE : LENGTH OF WSE-2-9A-S ) TO WSE-2-9A-T ( WS-ONE : LENGTH OF WSE-2-9A-T )
          wse29aTGrp.replace(wse29aSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse29aT) */,Wse29aS.getWse29aSFieldLength()/*fromLen*/,5+work.getOne() - 1/*toOffset - (wse29aS) */,Wse29aT.getWse29aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*735* WSE-2-9A-S-GRP    = (' WSE-2-9A-S-GRP ')'
          logger.info("*735* WSE-2-9A-S-GRP    = ({})", wse29aSGrp.toString()); 
//  DISPLAY '*736* WSE-2-9A-S        = (' WSE-2-9A-S ')'
          logger.info("*736* WSE-2-9A-S        = ({})", wse29aSGrp.getWse29aS().toString()); 
//  DISPLAY '*737*   WSE-2-9A-S-FLD1 = (' WSE-2-9A-S-FLD1 ')'
          logger.info("*737*   WSE-2-9A-S-FLD1 = ({})", new String(wse29aS.getWse29aSFld1())); 
  
//  DISPLAY '*738*   WSE-2-9A-S-FLD2 = (' WSE-2-9A-S-FLD2 ')'
          logger.info("*738*   WSE-2-9A-S-FLD2 = ({})", new String(wse29aS.getWse29aSFld2())); 
  
//  DISPLAY '*739* WSE-2-9A-T-GRP    = (' WSE-2-9A-T-GRP ')'
          logger.info("*739* WSE-2-9A-T-GRP    = ({})", wse29aTGrp.toString()); 
//  DISPLAY '*740* WSE-2-9A-T        = (' WSE-2-9A-T ')'
          logger.info("*740* WSE-2-9A-T        = ({})", wse29aTGrp.getWse29aT().toString()); 
//  DISPLAY '*741*   WSE-2-9A-T-FLD1 = (' WSE-2-9A-T-FLD1 ')'
          logger.info("*741*   WSE-2-9A-T-FLD1 = ({})", new String(wse29aT.getWse29aTFld1())); 
  
//  DISPLAY '*742*   WSE-2-9A-T-FLD2 = (' WSE-2-9A-T-FLD2 ')'
          logger.info("*742*   WSE-2-9A-T-FLD2 = ({})", new String(wse29aT.getWse29aTFld2())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-9B-S WSE-2-9B-T
          wse29bSGrp.getWse29bS().initialize();
          wse29bTGrp.getWse29bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-9B-S-FLD1
          wse29bS.setWse29bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-9B-S-FLD2
          wse29bS.setWse29bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE ALL 'MNOP' TO WSE-2-9B-T-FLD3
          wse29bT.setWse29bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-9B-S ( WS-ONE : LENGTH OF WSE-2-9B-S ) TO WSE-2-9B-T ( WS-ONE : LENGTH OF WSE-2-9B-T )
          wse29bTGrp.replace(wse29bSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse29bT) */,Wse29bS.getWse29bSFieldLength()/*fromLen*/,5+work.getOne() - 1/*toOffset - (wse29bS) */,Wse29bT.getWse29bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*743* WSE-2-9B-S-GRP    = (' WSE-2-9B-S-GRP ')'
          logger.info("*743* WSE-2-9B-S-GRP    = ({})", wse29bSGrp.toString()); 
//  DISPLAY '*744* WSE-2-9B-S        = (' WSE-2-9B-S ')'
          logger.info("*744* WSE-2-9B-S        = ({})", wse29bSGrp.getWse29bS().toString()); 
//  DISPLAY '*745*   WSE-2-9B-S-FLD1 = (' WSE-2-9B-S-FLD1 ')'
          logger.info("*745*   WSE-2-9B-S-FLD1 = ({})", new String(wse29bS.getWse29bSFld1())); 
  
//  DISPLAY '*746*   WSE-2-9B-S-FLD2 = (' WSE-2-9B-S-FLD2 ')'
          logger.info("*746*   WSE-2-9B-S-FLD2 = ({})", new String(wse29bS.getWse29bSFld2())); 
  
//  DISPLAY '*747* WSE-2-9B-T-GRP    = (' WSE-2-9B-T-GRP ')'
          logger.info("*747* WSE-2-9B-T-GRP    = ({})", wse29bTGrp.toString()); 
//  DISPLAY '*748* WSE-2-9B-T        = (' WSE-2-9B-T ')'
          logger.info("*748* WSE-2-9B-T        = ({})", wse29bTGrp.getWse29bT().toString()); 
//  DISPLAY '*749*   WSE-2-9B-T-FLD1 = (' WSE-2-9B-T-FLD1 ')'
          logger.info("*749*   WSE-2-9B-T-FLD1 = ({})", new String(wse29bT.getWse29bTFld1())); 
  
//  DISPLAY '*750*   WSE-2-9B-T-FLD2 = (' WSE-2-9B-T-FLD2 ')'
          logger.info("*750*   WSE-2-9B-T-FLD2 = ({})", new String(wse29bT.getWse29bTFld2())); 
  
//  DISPLAY '*751*   WSE-2-9B-T-FLD3 = (' WSE-2-9B-T-FLD3 ')'
          logger.info("*751*   WSE-2-9B-T-FLD3 = ({})", new String(wse29bT.getWse29bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-10A-S WSE-2-10A-T
          wse210aSGrp.setWse210aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse210aTGrp.getWse210aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-10A-S
          wse210aSGrp.setWse210aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-10A-S ( WS-ONE : LENGTH OF WSE-2-10A-S ) TO WSE-2-10A-T ( WS-ONE : LENGTH OF WSE-2-10A-T )
          wse210aTGrp.replace(wse210aSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse210aT) */,WSE_210A_S_LENGTH/*fromLen*/,5+work.getOne() - 1/*toOffset - (wse210aS) */,Wse210aT.getWse210aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*752* WSE-2-10A-S-GRP   = (' WSE-2-10A-S-GRP ')'
          logger.info("*752* WSE-2-10A-S-GRP   = ({})", wse210aSGrp.toString()); 
//  DISPLAY '*753* WSE-2-10A-S       = (' WSE-2-10A-S ')'
          logger.info("*753* WSE-2-10A-S       = ({})", new String(wse210aSGrp.getWse210aS())); 
//  DISPLAY '*754* WSE-2-10A-T-GRP   = (' WSE-2-10A-T-GRP ')'
          logger.info("*754* WSE-2-10A-T-GRP   = ({})", wse210aTGrp.toString()); 
//  DISPLAY '*755* WSE-2-10A-T       = (' WSE-2-10A-T ')'
          logger.info("*755* WSE-2-10A-T       = ({})", wse210aTGrp.getWse210aT().toString()); 
//  DISPLAY '*756*   WSE-2-10A-T-FLD1= (' WSE-2-10A-T-FLD1 ')'
          logger.info("*756*   WSE-2-10A-T-FLD1= ({})", new String(wse210aT.getWse210aTFld1())); 
  
//  DISPLAY '*757*   WSE-2-10A-T-FLD2= (' WSE-2-10A-T-FLD2 ')'
          logger.info("*757*   WSE-2-10A-T-FLD2= ({})", new String(wse210aT.getWse210aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-10B-S WSE-2-10B-T
          wse210bSGrp.setWse210bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse210bTGrp.getWse210bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-10B-S
          wse210bSGrp.setWse210bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-10B-T-FLD3
          wse210bT.setWse210bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-10B-S ( WS-ONE : LENGTH OF WSE-2-10B-S ) TO WSE-2-10B-T ( WS-ONE : LENGTH OF WSE-2-10B-T )
          wse210bTGrp.replace(wse210bSGrp/*parent*/,3+work.getOne() - 1/*fromOffset - (wse210bT) */,WSE_210B_S_LENGTH/*fromLen*/,5+work.getOne() - 1/*toOffset - (wse210bS) */,Wse210bT.getWse210bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*758* WSE-2-10B-S-GRP   = (' WSE-2-10B-S-GRP ')'
          logger.info("*758* WSE-2-10B-S-GRP   = ({})", wse210bSGrp.toString()); 
//  DISPLAY '*759* WSE-2-10B-S       = (' WSE-2-10B-S ')'
          logger.info("*759* WSE-2-10B-S       = ({})", new String(wse210bSGrp.getWse210bS())); 
//  DISPLAY '*760* WSE-2-10B-T-GRP   = (' WSE-2-10B-T-GRP ')'
          logger.info("*760* WSE-2-10B-T-GRP   = ({})", wse210bTGrp.toString()); 
//  DISPLAY '*761* WSE-2-10B-T       = (' WSE-2-10B-T ')'
          logger.info("*761* WSE-2-10B-T       = ({})", wse210bTGrp.getWse210bT().toString()); 
//  DISPLAY '*762*   WSE-2-10B-T-FLD1= (' WSE-2-10B-T-FLD1 ')'
          logger.info("*762*   WSE-2-10B-T-FLD1= ({})", new String(wse210bT.getWse210bTFld1())); 
  
//  DISPLAY '*763*   WSE-2-10B-T-FLD2= (' WSE-2-10B-T-FLD2 ')'
          logger.info("*763*   WSE-2-10B-T-FLD2= ({})", new String(wse210bT.getWse210bTFld2())); 
  
//  DISPLAY '*764*   WSE-2-10B-T-FLD3= (' WSE-2-10B-T-FLD3 ')'
          logger.info("*764*   WSE-2-10B-T-FLD3= ({})", new String(wse210bT.getWse210bTFld3())); 
  

// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-11A-S WSE-2-11A-T
          wse211aS.initialize();
          wse211aTGrp.getWse211aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-11A-S-FLD1
          wse211aS.setWse211aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-11A-S-FLD2
          wse211aS.setWse211aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-11A-S TO WSE-2-11A-T ( WS-ONE : LENGTH OF WSE-2-11A-T )
          wse211aTGrp.getWse211aT().replace(wse211aS.getCharArray(),0,wse211aS.length(), (wse211aTGrp.getWse211aT().begin + (work.getOne()-1)) ,Wse211aT.getWse211aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*765* WSE-2-11A-S       = (' WSE-2-11A-S ')'
          logger.info("*765* WSE-2-11A-S       = ({})", wse211aS.toString()); 
//  DISPLAY '*766*   WSE-2-11A-S-FLD1= (' WSE-2-11A-S-FLD1 ')'
          logger.info("*766*   WSE-2-11A-S-FLD1= ({})", new String(wse211aS.getWse211aSFld1())); 
      
      }
      /**
      * mainlineSplit27 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT27 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse211aSFld2                   COBOL Name: WSE-2-11A-S-FLD2
      * - wse211aTGrp                    COBOL Name: WSE-2-11A-T-GRP
      * - wse211aT                       COBOL Name: WSE-2-11A-T
      * - wse211aTFld1                   COBOL Name: WSE-2-11A-T-FLD1
      * - wse211aTFld2                   COBOL Name: WSE-2-11A-T-FLD2
      * - wse211bTGrp                    COBOL Name: WSE-2-11B-T-GRP
      * - wse212aTGrp                    COBOL Name: WSE-2-12A-T-GRP
      * - wse212bTGrp                    COBOL Name: WSE-2-12B-T-GRP
      * - wse213aSGrp                    COBOL Name: WSE-2-13A-S-GRP
      * - wse213aTGrp                    COBOL Name: WSE-2-13A-T-GRP
      *
      * Output :  

      * - wse211bS                       COBOL Name: WSE-2-11B-S
      * - wse211bT                       COBOL Name: WSE-2-11B-T
      * - wse211bSFld1                   COBOL Name: WSE-2-11B-S-FLD1
      * - wse211bSFld2                   COBOL Name: WSE-2-11B-S-FLD2
      * - wse211bTFld3                   COBOL Name: WSE-2-11B-T-FLD3
      * - wse211bTFld1                   COBOL Name: WSE-2-11B-T-FLD1
      * - wse211bTFld2                   COBOL Name: WSE-2-11B-T-FLD2
      * - wse212aS                       COBOL Name: WSE-2-12A-S
      * - wse212aT                       COBOL Name: WSE-2-12A-T
      * - wse212aTFld1                   COBOL Name: WSE-2-12A-T-FLD1
      * - wse212aTFld2                   COBOL Name: WSE-2-12A-T-FLD2
      * - wse212bS                       COBOL Name: WSE-2-12B-S
      * - wse212bT                       COBOL Name: WSE-2-12B-T
      * - wse212bTFld3                   COBOL Name: WSE-2-12B-T-FLD3
      * - wse212bTFld1                   COBOL Name: WSE-2-12B-T-FLD1
      * - wse212bTFld2                   COBOL Name: WSE-2-12B-T-FLD2
      * - wse213aS                       COBOL Name: WSE-2-13A-S
      * - wse213aT                       COBOL Name: WSE-2-13A-T
      * - wse213aSFld1                   COBOL Name: WSE-2-13A-S-FLD1
      * - wse213aSFld2                   COBOL Name: WSE-2-13A-S-FLD2
      * - wse213aTFld1                   COBOL Name: WSE-2-13A-T-FLD1
      * - wse213aTFld2                   COBOL Name: WSE-2-13A-T-FLD2
      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bT                       COBOL Name: WSE-2-13B-T
      * - wse213bSFld1                   COBOL Name: WSE-2-13B-S-FLD1
      * - wse213bSFld2                   COBOL Name: WSE-2-13B-S-FLD2
      *
      * @throws CFException
      */
      private void mainlineSplit27() throws Exception {
			// Declare local variables used in the method
			Wse211aT wse211aT = wse211aTGrp.getWse211aT();
			Wse211bT wse211bT = wse211bTGrp.getWse211bT();
			Wse212aT wse212aT = wse212aTGrp.getWse212aT();
			Wse212bT wse212bT = wse212bTGrp.getWse212bT();
			Wse213aS wse213aS = wse213aSGrp.getWse213aS();
			Wse213aT wse213aT = wse213aTGrp.getWse213aT();
			Wse213bS wse213bS = wse213bSGrp.getWse213bS();
			// End of variable declaration

//  DISPLAY '*767*   WSE-2-11A-S-FLD2= (' WSE-2-11A-S-FLD2 ')'
          logger.info("*767*   WSE-2-11A-S-FLD2= ({})", new String(wse211aS.getWse211aSFld2())); 
//  DISPLAY '*768* WSE-2-11A-T-GRP   = (' WSE-2-11A-T-GRP ')'
          logger.info("*768* WSE-2-11A-T-GRP   = ({})", wse211aTGrp.toString()); 
//  DISPLAY '*769* WSE-2-11A-T       = (' WSE-2-11A-T ')'
          logger.info("*769* WSE-2-11A-T       = ({})", wse211aTGrp.getWse211aT().toString()); 
//  DISPLAY '*770*   WSE-2-11A-T-FLD1= (' WSE-2-11A-T-FLD1 ')'
          logger.info("*770*   WSE-2-11A-T-FLD1= ({})", new String(wse211aT.getWse211aTFld1())); 
  
//  DISPLAY '*771*   WSE-2-11A-T-FLD2= (' WSE-2-11A-T-FLD2 ')'
          logger.info("*771*   WSE-2-11A-T-FLD2= ({})", new String(wse211aT.getWse211aTFld2())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-11B-S WSE-2-11B-T
          wse211bS.initialize();
          wse211bTGrp.getWse211bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-11B-S-FLD1
          wse211bS.setWse211bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-11B-S-FLD2
          wse211bS.setWse211bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-11B-T-FLD3
          wse211bT.setWse211bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-11B-S TO WSE-2-11B-T ( WS-ONE : LENGTH OF WSE-2-11B-T )
          wse211bTGrp.getWse211bT().replace(wse211bS.getCharArray(),0,wse211bS.length(), (wse211bTGrp.getWse211bT().begin + (work.getOne()-1)) ,Wse211bT.getWse211bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*772* WSE-2-11B-S       = (' WSE-2-11B-S ')'
          logger.info("*772* WSE-2-11B-S       = ({})", wse211bS.toString()); 
//  DISPLAY '*773*   WSE-2-11B-S-FLD1= (' WSE-2-11B-S-FLD1 ')'
          logger.info("*773*   WSE-2-11B-S-FLD1= ({})", new String(wse211bS.getWse211bSFld1())); 
//  DISPLAY '*774*   WSE-2-11B-S-FLD2= (' WSE-2-11B-S-FLD2 ')'
          logger.info("*774*   WSE-2-11B-S-FLD2= ({})", new String(wse211bS.getWse211bSFld2())); 
//  DISPLAY '*775* WSE-2-11B-T-GRP   = (' WSE-2-11B-T-GRP ')'
          logger.info("*775* WSE-2-11B-T-GRP   = ({})", wse211bTGrp.toString()); 
//  DISPLAY '*776* WSE-2-11B-T       = (' WSE-2-11B-T ')'
          logger.info("*776* WSE-2-11B-T       = ({})", wse211bTGrp.getWse211bT().toString()); 
//  DISPLAY '*777*   WSE-2-11B-T-FLD1= (' WSE-2-11B-T-FLD1 ')'
          logger.info("*777*   WSE-2-11B-T-FLD1= ({})", new String(wse211bT.getWse211bTFld1())); 
  
//  DISPLAY '*778*   WSE-2-11B-T-FLD2= (' WSE-2-11B-T-FLD2 ')'
          logger.info("*778*   WSE-2-11B-T-FLD2= ({})", new String(wse211bT.getWse211bTFld2())); 
  
//  DISPLAY '*779*   WSE-2-11B-T-FLD3= (' WSE-2-11B-T-FLD3 ')'
          logger.info("*779*   WSE-2-11B-T-FLD3= ({})", new String(wse211bT.getWse211bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-12A-S WSE-2-12A-T
          work.setWse212aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse212aTGrp.getWse212aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-12A-S
          work.setWse212aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-12A-S TO WSE-2-12A-T ( WS-ONE : LENGTH OF WSE-2-12A-T )
          wse212aTGrp.setWse212aT(work.getWse212aS(),0,work.getWse212aS().length,(work.getOne()-1),Wse212aT.getWse212aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*780* WSE-2-12A-S       = (' WSE-2-12A-S ')'
          logger.info("*780* WSE-2-12A-S       = ({})", new String(work.getWse212aS())); 
//  DISPLAY '*781* WSE-2-12A-T-GRP   = (' WSE-2-12A-T-GRP ')'
          logger.info("*781* WSE-2-12A-T-GRP   = ({})", wse212aTGrp.toString()); 
//  DISPLAY '*782* WSE-2-12A-T       = (' WSE-2-12A-T ')'
          logger.info("*782* WSE-2-12A-T       = ({})", wse212aTGrp.getWse212aT().toString()); 
//  DISPLAY '*783*   WSE-2-12A-T-FLD1= (' WSE-2-12A-T-FLD1 ')'
          logger.info("*783*   WSE-2-12A-T-FLD1= ({})", new String(wse212aT.getWse212aTFld1())); 
  
//  DISPLAY '*784*   WSE-2-12A-T-FLD2= (' WSE-2-12A-T-FLD2 ')'
          logger.info("*784*   WSE-2-12A-T-FLD2= ({})", new String(wse212aT.getWse212aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-12B-S WSE-2-12B-T
          work.setWse212bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse212bTGrp.getWse212bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-12B-S
          work.setWse212bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-12B-T-FLD3
          wse212bT.setWse212bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-12B-S TO WSE-2-12B-T ( WS-ONE : LENGTH OF WSE-2-12B-T )
          wse212bTGrp.setWse212bT(work.getWse212bS(),0,work.getWse212bS().length,(work.getOne()-1),Wse212bT.getWse212bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*785* WSE-2-12B-S       = (' WSE-2-12B-S ')'
          logger.info("*785* WSE-2-12B-S       = ({})", new String(work.getWse212bS())); 
//  DISPLAY '*786* WSE-2-12B-T-GRP   = (' WSE-2-12B-T-GRP ')'
          logger.info("*786* WSE-2-12B-T-GRP   = ({})", wse212bTGrp.toString()); 
//  DISPLAY '*787* WSE-2-12B-T       = (' WSE-2-12B-T ')'
          logger.info("*787* WSE-2-12B-T       = ({})", wse212bTGrp.getWse212bT().toString()); 
//  DISPLAY '*788*   WSE-2-12B-T-FLD1= (' WSE-2-12B-T-FLD1 ')'
          logger.info("*788*   WSE-2-12B-T-FLD1= ({})", new String(wse212bT.getWse212bTFld1())); 
  
//  DISPLAY '*789*   WSE-2-12B-T-FLD2= (' WSE-2-12B-T-FLD2 ')'
          logger.info("*789*   WSE-2-12B-T-FLD2= ({})", new String(wse212bT.getWse212bTFld2())); 
  
//  DISPLAY '*790*   WSE-2-12B-T-FLD3= (' WSE-2-12B-T-FLD3 ')'
          logger.info("*790*   WSE-2-12B-T-FLD3= ({})", new String(wse212bT.getWse212bTFld3())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-13A-S WSE-2-13A-T
          wse213aSGrp.getWse213aS().initialize();
          wse213aTGrp.getWse213aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-13A-S-FLD1
          wse213aS.setWse213aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-13A-S-FLD2
          wse213aS.setWse213aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE WSE-2-13A-S ( WS-THREE : LENGTH OF WSE-2-13A-S - 3 ) TO WSE-2-13A-T ( WS-FIVE : LENGTH OF WSE-2-13A-T - 5)
          wse213aTGrp.replace(wse213aSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse213aT) */,Wse213aS.getWse213aSFieldLength() - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (wse213aS) */,Wse213aT.getWse213aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*791* WSE-2-13A-S-GRP   = (' WSE-2-13A-S-GRP ')'
          logger.info("*791* WSE-2-13A-S-GRP   = ({})", wse213aSGrp.toString()); 
//  DISPLAY '*792* WSE-2-13A-S       = (' WSE-2-13A-S ')'
          logger.info("*792* WSE-2-13A-S       = ({})", wse213aSGrp.getWse213aS().toString()); 
//  DISPLAY '*793*   WSE-2-13A-S-FLD1= (' WSE-2-13A-S-FLD1 ')'
          logger.info("*793*   WSE-2-13A-S-FLD1= ({})", new String(wse213aS.getWse213aSFld1())); 
  
//  DISPLAY '*794*   WSE-2-13A-S-FLD2= (' WSE-2-13A-S-FLD2 ')'
          logger.info("*794*   WSE-2-13A-S-FLD2= ({})", new String(wse213aS.getWse213aSFld2())); 
  
//  DISPLAY '*795* WSE-2-13A-T-GRP   = (' WSE-2-13A-T-GRP ')'
          logger.info("*795* WSE-2-13A-T-GRP   = ({})", wse213aTGrp.toString()); 
//  DISPLAY '*796* WSE-2-13A-T       = (' WSE-2-13A-T ')'
          logger.info("*796* WSE-2-13A-T       = ({})", wse213aTGrp.getWse213aT().toString()); 
//  DISPLAY '*797*   WSE-2-13A-T-FLD1= (' WSE-2-13A-T-FLD1 ')'
          logger.info("*797*   WSE-2-13A-T-FLD1= ({})", new String(wse213aT.getWse213aTFld1())); 
  
//  DISPLAY '*798*   WSE-2-13A-T-FLD2= (' WSE-2-13A-T-FLD2 ')'
          logger.info("*798*   WSE-2-13A-T-FLD2= ({})", new String(wse213aT.getWse213aTFld2())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-13B-S WSE-2-13B-T
          wse213bSGrp.getWse213bS().initialize();
          wse213bTGrp.getWse213bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-13B-S-FLD1
          wse213bS.setWse213bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-13B-S-FLD2
          wse213bS.setWse213bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
      
      }
      /**
      * mainlineSplit28 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT28 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bSGrp                    COBOL Name: WSE-2-13B-S-GRP
      * - wse213bTGrp                    COBOL Name: WSE-2-13B-T-GRP
      * - wse214aSGrp                    COBOL Name: WSE-2-14A-S-GRP
      * - wse214aTGrp                    COBOL Name: WSE-2-14A-T-GRP
      * - wse214bSGrp                    COBOL Name: WSE-2-14B-S-GRP
      * - wse214bTGrp                    COBOL Name: WSE-2-14B-T-GRP
      * - wse215aSGrp                    COBOL Name: WSE-2-15A-S-GRP
      * - wse215bSGrp                    COBOL Name: WSE-2-15B-S-GRP
      *
      * Output :  

      * - wse213bTFld3                   COBOL Name: WSE-2-13B-T-FLD3
      * - wse213bT                       COBOL Name: WSE-2-13B-T
      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bSFld1                   COBOL Name: WSE-2-13B-S-FLD1
      * - wse213bSFld2                   COBOL Name: WSE-2-13B-S-FLD2
      * - wse213bTFld1                   COBOL Name: WSE-2-13B-T-FLD1
      * - wse213bTFld2                   COBOL Name: WSE-2-13B-T-FLD2
      * - wse214aS                       COBOL Name: WSE-2-14A-S
      * - wse214aT                       COBOL Name: WSE-2-14A-T
      * - wse214aTFld1                   COBOL Name: WSE-2-14A-T-FLD1
      * - wse214aTFld2                   COBOL Name: WSE-2-14A-T-FLD2
      * - wse214bS                       COBOL Name: WSE-2-14B-S
      * - wse214bT                       COBOL Name: WSE-2-14B-T
      * - wse214bTFld3                   COBOL Name: WSE-2-14B-T-FLD3
      * - wse214bTFld1                   COBOL Name: WSE-2-14B-T-FLD1
      * - wse214bTFld2                   COBOL Name: WSE-2-14B-T-FLD2
      * - wse215aS                       COBOL Name: WSE-2-15A-S
      * - wse215aT                       COBOL Name: WSE-2-15A-T
      * - wse215aSFld1                   COBOL Name: WSE-2-15A-S-FLD1
      * - wse215aSFld2                   COBOL Name: WSE-2-15A-S-FLD2
      * - wse215aTFld1                   COBOL Name: WSE-2-15A-T-FLD1
      * - wse215aTFld2                   COBOL Name: WSE-2-15A-T-FLD2
      * - wse215bS                       COBOL Name: WSE-2-15B-S
      * - wse215bT                       COBOL Name: WSE-2-15B-T
      * - wse215bSFld1                   COBOL Name: WSE-2-15B-S-FLD1
      * - wse215bSFld2                   COBOL Name: WSE-2-15B-S-FLD2
      * - wse215bTFld3                   COBOL Name: WSE-2-15B-T-FLD3
      *
      * @throws CFException
      */
      private void mainlineSplit28() throws Exception {
			// Declare local variables used in the method
			Wse213bT wse213bT = wse213bTGrp.getWse213bT();
			Wse213bS wse213bS = wse213bSGrp.getWse213bS();
			 final int WSE_214A_S_LENGTH = 60;
			 final int WSE_214B_S_LENGTH = 60;
			Wse214aT wse214aT = wse214aTGrp.getWse214aT();
			Wse214bT wse214bT = wse214bTGrp.getWse214bT();
			Wse215aS wse215aS = wse215aSGrp.getWse215aS();
			Wse215bS wse215bS = wse215bSGrp.getWse215bS();
			// End of variable declaration

//  MOVE ALL 'MNOP' TO WSE-2-13B-T-FLD3
          wse213bT.setWse213bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-13B-S ( WS-THREE : LENGTH OF WSE-2-13B-S - 3 ) TO WSE-2-13B-T ( WS-FIVE : LENGTH OF WSE-2-13B-T - 5)
          wse213bTGrp.replace(wse213bSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse213bT) */,Wse213bS.getWse213bSFieldLength() - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (wse213bS) */,Wse213bT.getWse213bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*799* WSE-2-13B-S-GRP   = (' WSE-2-13B-S-GRP ')'
          logger.info("*799* WSE-2-13B-S-GRP   = ({})", wse213bSGrp.toString()); 
//  DISPLAY '*800* WSE-2-13B-S       = (' WSE-2-13B-S ')'
          logger.info("*800* WSE-2-13B-S       = ({})", wse213bSGrp.getWse213bS().toString()); 
//  DISPLAY '*801*   WSE-2-13B-S-FLD1= (' WSE-2-13B-S-FLD1 ')'
          logger.info("*801*   WSE-2-13B-S-FLD1= ({})", new String(wse213bS.getWse213bSFld1())); 
  
//  DISPLAY '*802*   WSE-2-13B-S-FLD2= (' WSE-2-13B-S-FLD2 ')'
          logger.info("*802*   WSE-2-13B-S-FLD2= ({})", new String(wse213bS.getWse213bSFld2())); 
  
//  DISPLAY '*803* WSE-2-13B-T-GRP   = (' WSE-2-13B-T-GRP ')'
          logger.info("*803* WSE-2-13B-T-GRP   = ({})", wse213bTGrp.toString()); 
//  DISPLAY '*804* WSE-2-13B-T       = (' WSE-2-13B-T ')'
          logger.info("*804* WSE-2-13B-T       = ({})", wse213bTGrp.getWse213bT().toString()); 
//  DISPLAY '*805*   WSE-2-13B-T-FLD1= (' WSE-2-13B-T-FLD1 ')'
          logger.info("*805*   WSE-2-13B-T-FLD1= ({})", new String(wse213bT.getWse213bTFld1())); 
  
//  DISPLAY '*806*   WSE-2-13B-T-FLD2= (' WSE-2-13B-T-FLD2 ')'
          logger.info("*806*   WSE-2-13B-T-FLD2= ({})", new String(wse213bT.getWse213bTFld2())); 
  
//  DISPLAY '*807*   WSE-2-13B-T-FLD3= (' WSE-2-13B-T-FLD3 ')'
          logger.info("*807*   WSE-2-13B-T-FLD3= ({})", new String(wse213bT.getWse213bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-14A-S WSE-2-14A-T
          wse214aSGrp.setWse214aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse214aTGrp.getWse214aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-14A-S
          wse214aSGrp.setWse214aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-14A-S ( WS-THREE : LENGTH OF WSE-2-14A-S - 3 ) TO WSE-2-14A-T ( WS-FIVE : LENGTH OF WSE-2-14A-T - 5)
          wse214aTGrp.replace(wse214aSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse214aT) */,WSE_214A_S_LENGTH - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (wse214aS) */,Wse214aT.getWse214aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*808* WSE-2-14A-S-GRP   = (' WSE-2-14A-S-GRP ')'
          logger.info("*808* WSE-2-14A-S-GRP   = ({})", wse214aSGrp.toString()); 
//  DISPLAY '*809* WSE-2-14A-S       = (' WSE-2-14A-S ')'
          logger.info("*809* WSE-2-14A-S       = ({})", new String(wse214aSGrp.getWse214aS())); 
//  DISPLAY '*810* WSE-2-14A-T-GRP   = (' WSE-2-14A-T-GRP ')'
          logger.info("*810* WSE-2-14A-T-GRP   = ({})", wse214aTGrp.toString()); 
//  DISPLAY '*811* WSE-2-14A-T       = (' WSE-2-14A-T ')'
          logger.info("*811* WSE-2-14A-T       = ({})", wse214aTGrp.getWse214aT().toString()); 
//  DISPLAY '*812*   WSE-2-14A-T-FLD1= (' WSE-2-14A-T-FLD1 ')'
          logger.info("*812*   WSE-2-14A-T-FLD1= ({})", new String(wse214aT.getWse214aTFld1())); 
  
//  DISPLAY '*813*   WSE-2-14A-T-FLD2= (' WSE-2-14A-T-FLD2 ')'
          logger.info("*813*   WSE-2-14A-T-FLD2= ({})", new String(wse214aT.getWse214aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-14B-S WSE-2-14B-T
          wse214bSGrp.setWse214bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse214bTGrp.getWse214bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-14B-S
          wse214bSGrp.setWse214bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-14B-T-FLD3
          wse214bT.setWse214bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-14B-S ( WS-THREE : LENGTH OF WSE-2-14B-S - 3 ) TO WSE-2-14B-T ( WS-FIVE : LENGTH OF WSE-2-14B-T - 5)
          wse214bTGrp.replace(wse214bSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse214bT) */,WSE_214B_S_LENGTH - 3/*fromLen*/,5+work.getFive() - 1/*toOffset - (wse214bS) */,Wse214bT.getWse214bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*814* WSE-2-14B-S-GRP   = (' WSE-2-14B-S-GRP ')'
          logger.info("*814* WSE-2-14B-S-GRP   = ({})", wse214bSGrp.toString()); 
//  DISPLAY '*815* WSE-2-14B-S       = (' WSE-2-14B-S ')'
          logger.info("*815* WSE-2-14B-S       = ({})", new String(wse214bSGrp.getWse214bS())); 
//  DISPLAY '*816* WSE-2-14B-T-GRP   = (' WSE-2-14B-T-GRP ')'
          logger.info("*816* WSE-2-14B-T-GRP   = ({})", wse214bTGrp.toString()); 
//  DISPLAY '*817* WSE-2-14B-T       = (' WSE-2-14B-T ')'
          logger.info("*817* WSE-2-14B-T       = ({})", wse214bTGrp.getWse214bT().toString()); 
//  DISPLAY '*818*   WSE-2-14B-T-FLD1= (' WSE-2-14B-T-FLD1 ')'
          logger.info("*818*   WSE-2-14B-T-FLD1= ({})", new String(wse214bT.getWse214bTFld1())); 
  
//  DISPLAY '*819*   WSE-2-14B-T-FLD2= (' WSE-2-14B-T-FLD2 ')'
          logger.info("*819*   WSE-2-14B-T-FLD2= ({})", new String(wse214bT.getWse214bTFld2())); 
  
//  DISPLAY '*820*   WSE-2-14B-T-FLD3= (' WSE-2-14B-T-FLD3 ')'
          logger.info("*820*   WSE-2-14B-T-FLD3= ({})", new String(wse214bT.getWse214bTFld3())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-15A-S WSE-2-15A-T
          wse215aSGrp.getWse215aS().initialize();
          wse215aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-15A-S-FLD1
          wse215aS.setWse215aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-15A-S-FLD2
          wse215aS.setWse215aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE WSE-2-15A-S ( WS-THREE : LENGTH OF WSE-2-15A-S - 3 ) TO WSE-2-15A-T ( WS-FIVE : LENGTH OF WSE-2-15A-T - 5)
          wse215aT.replace(wse215aSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse215aT) */,Wse215aS.getWse215aSFieldLength() - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (wse215aS) */,Wse215aT.getWse215aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*821* WSE-2-15A-S-GRP   = (' WSE-2-15A-S-GRP ')'
          logger.info("*821* WSE-2-15A-S-GRP   = ({})", wse215aSGrp.toString()); 
//  DISPLAY '*822* WSE-2-15A-S       = (' WSE-2-15A-S ')'
          logger.info("*822* WSE-2-15A-S       = ({})", wse215aSGrp.getWse215aS().toString()); 
//  DISPLAY '*823*   WSE-2-15A-S-FLD1= (' WSE-2-15A-S-FLD1 ')'
          logger.info("*823*   WSE-2-15A-S-FLD1= ({})", new String(wse215aS.getWse215aSFld1())); 
  
//  DISPLAY '*824*   WSE-2-15A-S-FLD2= (' WSE-2-15A-S-FLD2 ')'
          logger.info("*824*   WSE-2-15A-S-FLD2= ({})", new String(wse215aS.getWse215aSFld2())); 
  
//  DISPLAY '*825* WSE-2-15A-T       = (' WSE-2-15A-T ')'
          logger.info("*825* WSE-2-15A-T       = ({})", wse215aT.toString()); 
//  DISPLAY '*826*   WSE-2-15A-T-FLD1= (' WSE-2-15A-T-FLD1 ')'
          logger.info("*826*   WSE-2-15A-T-FLD1= ({})", new String(wse215aT.getWse215aTFld1())); 
//  DISPLAY '*827*   WSE-2-15A-T-FLD2= (' WSE-2-15A-T-FLD2 ')'
          logger.info("*827*   WSE-2-15A-T-FLD2= ({})", new String(wse215aT.getWse215aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-15B-S WSE-2-15B-T
          wse215bSGrp.getWse215bS().initialize();
          wse215bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-15B-S-FLD1
          wse215bS.setWse215bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
  
//  MOVE ALL 'ZYXW' TO WSE-2-15B-S-FLD2
          wse215bS.setWse215bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
  
//  MOVE ALL 'MNOP' TO WSE-2-15B-T-FLD3
          wse215bT.setWse215bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-15B-S ( WS-THREE : LENGTH OF WSE-2-15B-S - 3 ) TO WSE-2-15B-T ( WS-FIVE : LENGTH OF WSE-2-15B-T - 5)
          wse215bT.replace(wse215bSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse215bT) */,Wse215bS.getWse215bSFieldLength() - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (wse215bS) */,Wse215bT.getWse215bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*828* WSE-2-15B-S-GRP   = (' WSE-2-15B-S-GRP ')'
          logger.info("*828* WSE-2-15B-S-GRP   = ({})", wse215bSGrp.toString()); 
//  DISPLAY '*829* WSE-2-15B-S       = (' WSE-2-15B-S ')'
          logger.info("*829* WSE-2-15B-S       = ({})", wse215bSGrp.getWse215bS().toString()); 
//  DISPLAY '*830*   WSE-2-15B-S-FLD1= (' WSE-2-15B-S-FLD1 ')'
          logger.info("*830*   WSE-2-15B-S-FLD1= ({})", new String(wse215bS.getWse215bSFld1())); 
  
//  DISPLAY '*831*   WSE-2-15B-S-FLD2= (' WSE-2-15B-S-FLD2 ')'
          logger.info("*831*   WSE-2-15B-S-FLD2= ({})", new String(wse215bS.getWse215bSFld2())); 
  
      
      }
      /**
      * mainlineSplit29 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT29 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse215bT                       COBOL Name: WSE-2-15B-T
      * - wse215bTFld1                   COBOL Name: WSE-2-15B-T-FLD1
      * - wse215bTFld2                   COBOL Name: WSE-2-15B-T-FLD2
      * - wse215bTFld3                   COBOL Name: WSE-2-15B-T-FLD3
      * - wse216aSGrp                    COBOL Name: WSE-2-16A-S-GRP
      * - wse216bSGrp                    COBOL Name: WSE-2-16B-S-GRP
      * - wse217aTGrp                    COBOL Name: WSE-2-17A-T-GRP
      * - wse217bTGrp                    COBOL Name: WSE-2-17B-T-GRP
      * - wse218aTGrp                    COBOL Name: WSE-2-18A-T-GRP
      *
      * Output :  

      * - wse216aS                       COBOL Name: WSE-2-16A-S
      * - wse216aT                       COBOL Name: WSE-2-16A-T
      * - wse216aTFld1                   COBOL Name: WSE-2-16A-T-FLD1
      * - wse216aTFld2                   COBOL Name: WSE-2-16A-T-FLD2
      * - wse216bS                       COBOL Name: WSE-2-16B-S
      * - wse216bT                       COBOL Name: WSE-2-16B-T
      * - wse216bTFld3                   COBOL Name: WSE-2-16B-T-FLD3
      * - wse216bTFld1                   COBOL Name: WSE-2-16B-T-FLD1
      * - wse216bTFld2                   COBOL Name: WSE-2-16B-T-FLD2
      * - wse217aS                       COBOL Name: WSE-2-17A-S
      * - wse217aT                       COBOL Name: WSE-2-17A-T
      * - wse217aSFld1                   COBOL Name: WSE-2-17A-S-FLD1
      * - wse217aSFld2                   COBOL Name: WSE-2-17A-S-FLD2
      * - wse217aTFld1                   COBOL Name: WSE-2-17A-T-FLD1
      * - wse217aTFld2                   COBOL Name: WSE-2-17A-T-FLD2
      * - wse217bS                       COBOL Name: WSE-2-17B-S
      * - wse217bT                       COBOL Name: WSE-2-17B-T
      * - wse217bSFld1                   COBOL Name: WSE-2-17B-S-FLD1
      * - wse217bSFld2                   COBOL Name: WSE-2-17B-S-FLD2
      * - wse217bTFld3                   COBOL Name: WSE-2-17B-T-FLD3
      * - wse217bTFld1                   COBOL Name: WSE-2-17B-T-FLD1
      * - wse217bTFld2                   COBOL Name: WSE-2-17B-T-FLD2
      * - wse218aS                       COBOL Name: WSE-2-18A-S
      * - wse218aT                       COBOL Name: WSE-2-18A-T
      *
      * @throws CFException
      */
      private void mainlineSplit29() throws Exception {
			// Declare local variables used in the method
			 final int WSE_216A_S_LENGTH = 60;
			 final int WSE_216B_S_LENGTH = 60;
			 final int WSE_218A_S_LENGTH = 60;
			Wse217aT wse217aT = wse217aTGrp.getWse217aT();
			Wse217bT wse217bT = wse217bTGrp.getWse217bT();
			// End of variable declaration

//  DISPLAY '*832* WSE-2-15B-T       = (' WSE-2-15B-T ')'
          logger.info("*832* WSE-2-15B-T       = ({})", wse215bT.toString()); 
//  DISPLAY '*833*   WSE-2-15B-T-FLD1= (' WSE-2-15B-T-FLD1 ')'
          logger.info("*833*   WSE-2-15B-T-FLD1= ({})", new String(wse215bT.getWse215bTFld1())); 
//  DISPLAY '*834*   WSE-2-15B-T-FLD2= (' WSE-2-15B-T-FLD2 ')'
          logger.info("*834*   WSE-2-15B-T-FLD2= ({})", new String(wse215bT.getWse215bTFld2())); 
//  DISPLAY '*835*   WSE-2-15B-T-FLD3= (' WSE-2-15B-T-FLD3 ')'
          logger.info("*835*   WSE-2-15B-T-FLD3= ({})", new String(wse215bT.getWse215bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-16A-S WSE-2-16A-T
          wse216aSGrp.setWse216aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse216aT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-16A-S
          wse216aSGrp.setWse216aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-16A-S ( WS-THREE : LENGTH OF WSE-2-16A-S - 3 ) TO WSE-2-16A-T ( WS-FIVE : LENGTH OF WSE-2-16A-T - 5)
          wse216aT.replace(wse216aSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse216aT) */,WSE_216A_S_LENGTH - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (wse216aS) */,Wse216aT.getWse216aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*836* WSE-2-16A-S-GRP   = (' WSE-2-16A-S-GRP ')'
          logger.info("*836* WSE-2-16A-S-GRP   = ({})", wse216aSGrp.toString()); 
//  DISPLAY '*837* WSE-2-16A-S       = (' WSE-2-16A-S ')'
          logger.info("*837* WSE-2-16A-S       = ({})", new String(wse216aSGrp.getWse216aS())); 
//  DISPLAY '*838* WSE-2-16A-T       = (' WSE-2-16A-T ')'
          logger.info("*838* WSE-2-16A-T       = ({})", wse216aT.toString()); 
//  DISPLAY '*839*   WSE-2-16A-T-FLD1= (' WSE-2-16A-T-FLD1 ')'
          logger.info("*839*   WSE-2-16A-T-FLD1= ({})", new String(wse216aT.getWse216aTFld1())); 
//  DISPLAY '*840*   WSE-2-16A-T-FLD2= (' WSE-2-16A-T-FLD2 ')'
          logger.info("*840*   WSE-2-16A-T-FLD2= ({})", new String(wse216aT.getWse216aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-16B-S WSE-2-16B-T
          wse216bSGrp.setWse216bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse216bT.initialize();
//  MOVE ALL 'ABCD' TO WSE-2-16B-S
          wse216bSGrp.setWse216bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-16B-T-FLD3
          wse216bT.setWse216bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-16B-S ( WS-THREE : LENGTH OF WSE-2-16B-S - 3 ) TO WSE-2-16B-T ( WS-FIVE : LENGTH OF WSE-2-16B-T - 5)
          wse216bT.replace(wse216bSGrp/*parent*/,3+work.getThree() - 1/*fromOffset - (wse216bT) */,WSE_216B_S_LENGTH - 3/*fromLen*/,0+work.getFive() - 1/*toOffset - (wse216bS) */,Wse216bT.getWse216bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*841* WSE-2-16B-S-GRP   = (' WSE-2-16B-S-GRP ')'
          logger.info("*841* WSE-2-16B-S-GRP   = ({})", wse216bSGrp.toString()); 
//  DISPLAY '*842* WSE-2-16B-S       = (' WSE-2-16B-S ')'
          logger.info("*842* WSE-2-16B-S       = ({})", new String(wse216bSGrp.getWse216bS())); 
//  DISPLAY '*843* WSE-2-16B-T       = (' WSE-2-16B-T ')'
          logger.info("*843* WSE-2-16B-T       = ({})", wse216bT.toString()); 
//  DISPLAY '*844*   WSE-2-16B-T-FLD1= (' WSE-2-16B-T-FLD1 ')'
          logger.info("*844*   WSE-2-16B-T-FLD1= ({})", new String(wse216bT.getWse216bTFld1())); 
//  DISPLAY '*845*   WSE-2-16B-T-FLD2= (' WSE-2-16B-T-FLD2 ')'
          logger.info("*845*   WSE-2-16B-T-FLD2= ({})", new String(wse216bT.getWse216bTFld2())); 
//  DISPLAY '*846*   WSE-2-16B-T-FLD3= (' WSE-2-16B-T-FLD3 ')'
          logger.info("*846*   WSE-2-16B-T-FLD3= ({})", new String(wse216bT.getWse216bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-17A-S WSE-2-17A-T
          wse217aS.initialize();
          wse217aTGrp.getWse217aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-17A-S-FLD1
          wse217aS.setWse217aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-17A-S-FLD2
          wse217aS.setWse217aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-17A-S ( WS-THREE : LENGTH OF WSE-2-17A-S - 3 ) TO WSE-2-17A-T ( WS-FIVE : LENGTH OF WSE-2-17A-T - 5)
          wse217aTGrp.getWse217aT().replace(wse217aS,(work.getThree()-1),Wse217aS.getWse217aSFieldLength() - 3, (wse217aTGrp.getWse217aT().begin + (work.getFive()-1)) ,Wse217aT.getWse217aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*847* WSE-2-17A-S       = (' WSE-2-17A-S ')'
          logger.info("*847* WSE-2-17A-S       = ({})", wse217aS.toString()); 
//  DISPLAY '*848*   WSE-2-17A-S-FLD1= (' WSE-2-17A-S-FLD1 ')'
          logger.info("*848*   WSE-2-17A-S-FLD1= ({})", new String(wse217aS.getWse217aSFld1())); 
//  DISPLAY '*849*   WSE-2-17A-S-FLD2= (' WSE-2-17A-S-FLD2 ')'
          logger.info("*849*   WSE-2-17A-S-FLD2= ({})", new String(wse217aS.getWse217aSFld2())); 
//  DISPLAY '*850* WSE-2-17A-T-GRP   = (' WSE-2-17A-T-GRP ')'
          logger.info("*850* WSE-2-17A-T-GRP   = ({})", wse217aTGrp.toString()); 
//  DISPLAY '*851* WSE-2-17A-T       = (' WSE-2-17A-T ')'
          logger.info("*851* WSE-2-17A-T       = ({})", wse217aTGrp.getWse217aT().toString()); 
//  DISPLAY '*852*   WSE-2-17A-T-FLD1= (' WSE-2-17A-T-FLD1 ')'
          logger.info("*852*   WSE-2-17A-T-FLD1= ({})", new String(wse217aT.getWse217aTFld1())); 
  
//  DISPLAY '*853*   WSE-2-17A-T-FLD2= (' WSE-2-17A-T-FLD2 ')'
          logger.info("*853*   WSE-2-17A-T-FLD2= ({})", new String(wse217aT.getWse217aTFld2())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-17B-S WSE-2-17B-T
          wse217bS.initialize();
          wse217bTGrp.getWse217bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-17B-S-FLD1
          wse217bS.setWse217bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-17B-S-FLD2
          wse217bS.setWse217bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-17B-T-FLD3
          wse217bT.setWse217bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-17B-S ( WS-THREE : LENGTH OF WSE-2-17B-S - 3 ) TO WSE-2-17B-T ( WS-FIVE : LENGTH OF WSE-2-17B-T - 5)
          wse217bTGrp.getWse217bT().replace(wse217bS,(work.getThree()-1),Wse217bS.getWse217bSFieldLength() - 3, (wse217bTGrp.getWse217bT().begin + (work.getFive()-1)) ,Wse217bT.getWse217bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*854* WSE-2-17B-S       = (' WSE-2-17B-S ')'
          logger.info("*854* WSE-2-17B-S       = ({})", wse217bS.toString()); 
//  DISPLAY '*855*   WSE-2-17B-S-FLD1= (' WSE-2-17B-S-FLD1 ')'
          logger.info("*855*   WSE-2-17B-S-FLD1= ({})", new String(wse217bS.getWse217bSFld1())); 
//  DISPLAY '*856*   WSE-2-17B-S-FLD2= (' WSE-2-17B-S-FLD2 ')'
          logger.info("*856*   WSE-2-17B-S-FLD2= ({})", new String(wse217bS.getWse217bSFld2())); 
//  DISPLAY '*857* WSE-2-17B-T-GRP   = (' WSE-2-17B-T-GRP ')'
          logger.info("*857* WSE-2-17B-T-GRP   = ({})", wse217bTGrp.toString()); 
//  DISPLAY '*858* WSE-2-17B-T       = (' WSE-2-17B-T ')'
          logger.info("*858* WSE-2-17B-T       = ({})", wse217bTGrp.getWse217bT().toString()); 
//  DISPLAY '*859*   WSE-2-17B-T-FLD1= (' WSE-2-17B-T-FLD1 ')'
          logger.info("*859*   WSE-2-17B-T-FLD1= ({})", new String(wse217bT.getWse217bTFld1())); 
  
//  DISPLAY '*860*   WSE-2-17B-T-FLD2= (' WSE-2-17B-T-FLD2 ')'
          logger.info("*860*   WSE-2-17B-T-FLD2= ({})", new String(wse217bT.getWse217bTFld2())); 
  
//  DISPLAY '*861*   WSE-2-17B-T-FLD3= (' WSE-2-17B-T-FLD3 ')'
          logger.info("*861*   WSE-2-17B-T-FLD3= ({})", new String(wse217bT.getWse217bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-18A-S WSE-2-18A-T
          work.setWse218aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse218aTGrp.getWse218aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-18A-S
          work.setWse218aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-18A-S ( WS-THREE : LENGTH OF WSE-2-18A-S - 3 ) TO WSE-2-18A-T ( WS-FIVE : LENGTH OF WSE-2-18A-T - 5)
          wse218aTGrp.setWse218aT(work.getWse218aS(),(work.getThree()-1)/* wse218aS */ ,WSE_218A_S_LENGTH - 3,(work.getFive()-1),Wse218aT.getWse218aTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*862* WSE-2-18A-S       = (' WSE-2-18A-S ')'
          logger.info("*862* WSE-2-18A-S       = ({})", new String(work.getWse218aS())); 
//  DISPLAY '*863* WSE-2-18A-T-GRP   = (' WSE-2-18A-T-GRP ')'
          logger.info("*863* WSE-2-18A-T-GRP   = ({})", wse218aTGrp.toString()); 
      
      }
      /**
      * mainlineSplit30 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT30 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse218aT                       COBOL Name: WSE-2-18A-T
      * - wse218aTFld1                   COBOL Name: WSE-2-18A-T-FLD1
      * - wse218aTFld2                   COBOL Name: WSE-2-18A-T-FLD2
      * - wse218bTGrp                    COBOL Name: WSE-2-18B-T-GRP
      * - wse219aTGrp                    COBOL Name: WSE-2-19A-T-GRP
      * - wse219bTGrp                    COBOL Name: WSE-2-19B-T-GRP
      * - wse220aTGrp                    COBOL Name: WSE-2-20A-T-GRP
      * - wse220bTGrp                    COBOL Name: WSE-2-20B-T-GRP
      *
      * Output :  

      * - wse218bS                       COBOL Name: WSE-2-18B-S
      * - wse218bT                       COBOL Name: WSE-2-18B-T
      * - wse218bTFld3                   COBOL Name: WSE-2-18B-T-FLD3
      * - wse218bTFld1                   COBOL Name: WSE-2-18B-T-FLD1
      * - wse218bTFld2                   COBOL Name: WSE-2-18B-T-FLD2
      * - wse219aS                       COBOL Name: WSE-2-19A-S
      * - wse219aT                       COBOL Name: WSE-2-19A-T
      * - wse219aSFld1                   COBOL Name: WSE-2-19A-S-FLD1
      * - wse219aSFld2                   COBOL Name: WSE-2-19A-S-FLD2
      * - wse219aTFld1                   COBOL Name: WSE-2-19A-T-FLD1
      * - wse219aTFld2                   COBOL Name: WSE-2-19A-T-FLD2
      * - wse219bS                       COBOL Name: WSE-2-19B-S
      * - wse219bT                       COBOL Name: WSE-2-19B-T
      * - wse219bSFld1                   COBOL Name: WSE-2-19B-S-FLD1
      * - wse219bSFld2                   COBOL Name: WSE-2-19B-S-FLD2
      * - wse219bTFld3                   COBOL Name: WSE-2-19B-T-FLD3
      * - wse219bTFld1                   COBOL Name: WSE-2-19B-T-FLD1
      * - wse219bTFld2                   COBOL Name: WSE-2-19B-T-FLD2
      * - wse220aS                       COBOL Name: WSE-2-20A-S
      * - wse220aT                       COBOL Name: WSE-2-20A-T
      * - wse220aTFld1                   COBOL Name: WSE-2-20A-T-FLD1
      * - wse220aTFld2                   COBOL Name: WSE-2-20A-T-FLD2
      * - wse220bS                       COBOL Name: WSE-2-20B-S
      * - wse220bT                       COBOL Name: WSE-2-20B-T
      * - wse220bTFld3                   COBOL Name: WSE-2-20B-T-FLD3
      *
      * @throws CFException
      */
      private void mainlineSplit30() throws Exception {
			// Declare local variables used in the method
			Wse218aT wse218aT = wse218aTGrp.getWse218aT();
			Wse218bT wse218bT = wse218bTGrp.getWse218bT();
			 final int WSE_218B_S_LENGTH = 60;
			Wse219aT wse219aT = wse219aTGrp.getWse219aT();
			Wse219bT wse219bT = wse219bTGrp.getWse219bT();
			Wse220aT wse220aT = wse220aTGrp.getWse220aT();
			Wse220bT wse220bT = wse220bTGrp.getWse220bT();
			// End of variable declaration

//  DISPLAY '*864* WSE-2-18A-T       = (' WSE-2-18A-T ')'
          logger.info("*864* WSE-2-18A-T       = ({})", wse218aTGrp.getWse218aT().toString()); 
//  DISPLAY '*865*   WSE-2-18A-T-FLD1= (' WSE-2-18A-T-FLD1 ')'
          logger.info("*865*   WSE-2-18A-T-FLD1= ({})", new String(wse218aT.getWse218aTFld1())); 
  
//  DISPLAY '*866*   WSE-2-18A-T-FLD2= (' WSE-2-18A-T-FLD2 ')'
          logger.info("*866*   WSE-2-18A-T-FLD2= ({})", new String(wse218aT.getWse218aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-18B-S WSE-2-18B-T
          work.setWse218bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse218bTGrp.getWse218bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-18B-S
          work.setWse218bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-18B-T-FLD3
          wse218bT.setWse218bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-18B-S ( WS-THREE : LENGTH OF WSE-2-18B-S - 3 ) TO WSE-2-18B-T ( WS-FIVE : LENGTH OF WSE-2-18B-T - 5)
          wse218bTGrp.setWse218bT(work.getWse218bS(),(work.getThree()-1)/* wse218bS */ ,WSE_218B_S_LENGTH - 3,(work.getFive()-1),Wse218bT.getWse218bTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*867* WSE-2-18B-S       = (' WSE-2-18B-S ')'
          logger.info("*867* WSE-2-18B-S       = ({})", new String(work.getWse218bS())); 
//  DISPLAY '*868* WSE-2-18B-T-GRP   = (' WSE-2-18B-T-GRP ')'
          logger.info("*868* WSE-2-18B-T-GRP   = ({})", wse218bTGrp.toString()); 
//  DISPLAY '*869* WSE-2-18B-T       = (' WSE-2-18B-T ')'
          logger.info("*869* WSE-2-18B-T       = ({})", wse218bTGrp.getWse218bT().toString()); 
//  DISPLAY '*870*   WSE-2-18B-T-FLD1= (' WSE-2-18B-T-FLD1 ')'
          logger.info("*870*   WSE-2-18B-T-FLD1= ({})", new String(wse218bT.getWse218bTFld1())); 
  
//  DISPLAY '*871*   WSE-2-18B-T-FLD2= (' WSE-2-18B-T-FLD2 ')'
          logger.info("*871*   WSE-2-18B-T-FLD2= ({})", new String(wse218bT.getWse218bTFld2())); 
  
//  DISPLAY '*872*   WSE-2-18B-T-FLD3= (' WSE-2-18B-T-FLD3 ')'
          logger.info("*872*   WSE-2-18B-T-FLD3= ({})", new String(wse218bT.getWse218bTFld3())); 
  

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-19A-S WSE-2-19A-T
          wse219aS.initialize();
          wse219aTGrp.getWse219aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-19A-S-FLD1
          wse219aS.setWse219aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-19A-S-FLD2
          wse219aS.setWse219aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-19A-S TO WSE-2-19A-T ( WS-FIVE : LENGTH OF WSE-2-19A-T - 5)
          wse219aTGrp.getWse219aT().replace(wse219aS.getCharArray(),0,wse219aS.length(), (wse219aTGrp.getWse219aT().begin + (work.getFive()-1)) ,Wse219aT.getWse219aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*873* WSE-2-19A-S       = (' WSE-2-19A-S ')'
          logger.info("*873* WSE-2-19A-S       = ({})", wse219aS.toString()); 
//  DISPLAY '*874*   WSE-2-19A-S-FLD1= (' WSE-2-19A-S-FLD1 ')'
          logger.info("*874*   WSE-2-19A-S-FLD1= ({})", new String(wse219aS.getWse219aSFld1())); 
//  DISPLAY '*875*   WSE-2-19A-S-FLD2= (' WSE-2-19A-S-FLD2 ')'
          logger.info("*875*   WSE-2-19A-S-FLD2= ({})", new String(wse219aS.getWse219aSFld2())); 
//  DISPLAY '*876* WSE-2-19A-T-GRP   = (' WSE-2-19A-T-GRP ')'
          logger.info("*876* WSE-2-19A-T-GRP   = ({})", wse219aTGrp.toString()); 
//  DISPLAY '*877* WSE-2-19A-T       = (' WSE-2-19A-T ')'
          logger.info("*877* WSE-2-19A-T       = ({})", wse219aTGrp.getWse219aT().toString()); 
//  DISPLAY '*878*   WSE-2-19A-T-FLD1= (' WSE-2-19A-T-FLD1 ')'
          logger.info("*878*   WSE-2-19A-T-FLD1= ({})", new String(wse219aT.getWse219aTFld1())); 
  
//  DISPLAY '*879*   WSE-2-19A-T-FLD2= (' WSE-2-19A-T-FLD2 ')'
          logger.info("*879*   WSE-2-19A-T-FLD2= ({})", new String(wse219aT.getWse219aTFld2())); 
  

// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-19B-S WSE-2-19B-T
          wse219bS.initialize();
          wse219bTGrp.getWse219bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-19B-S-FLD1
          wse219bS.setWse219bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-19B-S-FLD2
          wse219bS.setWse219bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-19B-T-FLD3
          wse219bT.setWse219bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-19B-S TO WSE-2-19B-T ( WS-FIVE : LENGTH OF WSE-2-19B-T - 5)
          wse219bTGrp.getWse219bT().replace(wse219bS.getCharArray(),0,wse219bS.length(), (wse219bTGrp.getWse219bT().begin + (work.getFive()-1)) ,Wse219bT.getWse219bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*880* WSE-2-19B-S       = (' WSE-2-19B-S ')'
          logger.info("*880* WSE-2-19B-S       = ({})", wse219bS.toString()); 
//  DISPLAY '*881*   WSE-2-19B-S-FLD1= (' WSE-2-19B-S-FLD1 ')'
          logger.info("*881*   WSE-2-19B-S-FLD1= ({})", new String(wse219bS.getWse219bSFld1())); 
//  DISPLAY '*882*   WSE-2-19B-S-FLD2= (' WSE-2-19B-S-FLD2 ')'
          logger.info("*882*   WSE-2-19B-S-FLD2= ({})", new String(wse219bS.getWse219bSFld2())); 
//  DISPLAY '*883* WSE-2-19B-T-GRP   = (' WSE-2-19B-T-GRP ')'
          logger.info("*883* WSE-2-19B-T-GRP   = ({})", wse219bTGrp.toString()); 
//  DISPLAY '*884* WSE-2-19B-T       = (' WSE-2-19B-T ')'
          logger.info("*884* WSE-2-19B-T       = ({})", wse219bTGrp.getWse219bT().toString()); 
//  DISPLAY '*885*   WSE-2-19B-T-FLD1= (' WSE-2-19B-T-FLD1 ')'
          logger.info("*885*   WSE-2-19B-T-FLD1= ({})", new String(wse219bT.getWse219bTFld1())); 
  
//  DISPLAY '*886*   WSE-2-19B-T-FLD2= (' WSE-2-19B-T-FLD2 ')'
          logger.info("*886*   WSE-2-19B-T-FLD2= ({})", new String(wse219bT.getWse219bTFld2())); 
  
//  DISPLAY '*887*   WSE-2-19B-T-FLD3= (' WSE-2-19B-T-FLD3 ')'
          logger.info("*887*   WSE-2-19B-T-FLD3= ({})", new String(wse219bT.getWse219bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-20A-S WSE-2-20A-T
          work.setWse220aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse220aTGrp.getWse220aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-20A-S
          work.setWse220aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-20A-S TO WSE-2-20A-T ( WS-FIVE : LENGTH OF WSE-2-20A-T - 5)
          wse220aTGrp.setWse220aT(work.getWse220aS(),0,work.getWse220aS().length,(work.getFive()-1),Wse220aT.getWse220aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*888* WSE-2-20A-S       = (' WSE-2-20A-S ')'
          logger.info("*888* WSE-2-20A-S       = ({})", new String(work.getWse220aS())); 
//  DISPLAY '*889* WSE-2-20A-T-GRP   = (' WSE-2-20A-T-GRP ')'
          logger.info("*889* WSE-2-20A-T-GRP   = ({})", wse220aTGrp.toString()); 
//  DISPLAY '*890* WSE-2-20A-T       = (' WSE-2-20A-T ')'
          logger.info("*890* WSE-2-20A-T       = ({})", wse220aTGrp.getWse220aT().toString()); 
//  DISPLAY '*891*   WSE-2-20A-T-FLD1= (' WSE-2-20A-T-FLD1 ')'
          logger.info("*891*   WSE-2-20A-T-FLD1= ({})", new String(wse220aT.getWse220aTFld1())); 
  
//  DISPLAY '*892*   WSE-2-20A-T-FLD2= (' WSE-2-20A-T-FLD2 ')'
          logger.info("*892*   WSE-2-20A-T-FLD2= ({})", new String(wse220aT.getWse220aTFld2())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-20B-S WSE-2-20B-T
          work.setWse220bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          wse220bTGrp.getWse220bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-20B-S
          work.setWse220bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-20B-T-FLD3
          wse220bT.setWse220bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
  
//  MOVE WSE-2-20B-S TO WSE-2-20B-T ( WS-FIVE : LENGTH OF WSE-2-20B-T - 5)
          wse220bTGrp.setWse220bT(work.getWse220bS(),0,work.getWse220bS().length,(work.getFive()-1),Wse220bT.getWse220bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*893* WSE-2-20B-S       = (' WSE-2-20B-S ')'
          logger.info("*893* WSE-2-20B-S       = ({})", new String(work.getWse220bS())); 
//  DISPLAY '*894* WSE-2-20B-T-GRP   = (' WSE-2-20B-T-GRP ')'
          logger.info("*894* WSE-2-20B-T-GRP   = ({})", wse220bTGrp.toString()); 
      
      }
      /**
      * mainlineSplit31 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT31 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse220bT                       COBOL Name: WSE-2-20B-T
      * - wse220bTFld1                   COBOL Name: WSE-2-20B-T-FLD1
      * - wse220bTFld2                   COBOL Name: WSE-2-20B-T-FLD2
      * - wse220bTFld3                   COBOL Name: WSE-2-20B-T-FLD3
      * - wse220cSGrp                    COBOL Name: WSE-2-20C-S-GRP
      * - dplJulianDate                  COBOL Name: DPL-JULIAN-DATE
      *
      * Output :  

      * - wse220cS                       COBOL Name: WSE-2-20C-S
      * - wse220cT                       COBOL Name: WSE-2-20C-T
      * - wse220cSFld1                   COBOL Name: WSE-2-20C-S-FLD1
      * - wse220cSFld2                   COBOL Name: WSE-2-20C-S-FLD2
      * - wse220cSFld3                   COBOL Name: WSE-2-20C-S-FLD3
      * - adRptDate7Juln                 COBOL Name: AD-RPT-DATE7-JULN
      * - dplJulianDate                  COBOL Name: DPL-JULIAN-DATE
      * - var1                           COBOL Name: WS-VAR1
      *
      * @throws CFException
      */
      private void mainlineSplit31() throws Exception {
			// Declare local variables used in the method
			Wse220bT wse220bT = wse220bTGrp.getWse220bT();
			Wse220cS wse220cS = wse220cSGrp.getWse220cS();
			char[] var1 = null;
			// End of variable declaration

//  DISPLAY '*895* WSE-2-20B-T       = (' WSE-2-20B-T ')'
          logger.info("*895* WSE-2-20B-T       = ({})", wse220bTGrp.getWse220bT().toString()); 
//  DISPLAY '*896*   WSE-2-20B-T-FLD1= (' WSE-2-20B-T-FLD1 ')'
          logger.info("*896*   WSE-2-20B-T-FLD1= ({})", new String(wse220bT.getWse220bTFld1())); 
  
//  DISPLAY '*897*   WSE-2-20B-T-FLD2= (' WSE-2-20B-T-FLD2 ')'
          logger.info("*897*   WSE-2-20B-T-FLD2= ({})", new String(wse220bT.getWse220bTFld2())); 
  
//  DISPLAY '*898*   WSE-2-20B-T-FLD3= (' WSE-2-20B-T-FLD3 ')'
          logger.info("*898*   WSE-2-20B-T-FLD3= ({})", new String(wse220bT.getWse220bTFld3())); 
  

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 5  ;
// *
//  INITIALIZE WSE-2-20C-S WSE-2-20C-T
          wse220cSGrp.getWse220cS().initialize();
          work.setWse220cT(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
//  MOVE ALL 'ABCD' TO WSE-2-20C-S-FLD1
          wse220cS.setWse220cSFld1(CONSTANTS.LITERAL_ABCDABCDABCD);
  
//  MOVE ALL 'MNOP' TO WSE-2-20C-S-FLD2
          wse220cS.setWse220cSFld2(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOP);
  
//  MOVE ALL 'VXYZ' TO WSE-2-20C-S-FLD3
          wse220cS.setWse220cSFld3(CONSTANTS.LITERAL_VXYZVXYZVXYZVXYZVXYZVXYZVXYZVXYZ);
  
//  MOVE WSE-2-20C-S ( WS-ONE : LENGTH OF WSE-2-20C-S ) TO WSE-2-20C-T
          work.setWse220cT(substring(wse220cSGrp.getWse220cS().toCharArray(),(work.getOne()-1), (Wse220cS.getWse220cSFieldLength() + (work.getOne() - 1)) ));

// *
//  DISPLAY '*899* WSE-2-20C-S-GRP   = (' WSE-2-20C-S-GRP ')'
          logger.info("*899* WSE-2-20C-S-GRP   = ({})", wse220cSGrp.toString()); 
//  DISPLAY '*900* WSE-2-20C-S       = (' WSE-2-20C-S ')'
          logger.info("*900* WSE-2-20C-S       = ({})", wse220cSGrp.getWse220cS().toString()); 
//  DISPLAY '*901*   WSE-2-20C-S-FLD1= (' WSE-2-20C-S-FLD1 ')'
          logger.info("*901*   WSE-2-20C-S-FLD1= ({})", new String(wse220cS.getWse220cSFld1())); 
  
//  DISPLAY '*902*   WSE-2-20C-S-FLD2= (' WSE-2-20C-S-FLD2 ')'
          logger.info("*902*   WSE-2-20C-S-FLD2= ({})", new String(wse220cS.getWse220cSFld2())); 
  
//  DISPLAY '*903*   WSE-2-20C-S-FLD3= (' WSE-2-20C-S-FLD3 ')'
          logger.info("*903*   WSE-2-20C-S-FLD3= ({})", new String(wse220cS.getWse220cSFld3())); 
  
//  DISPLAY '*904* WSE-2-20C-T       = (' WSE-2-20C-T ')'
          logger.info("*904* WSE-2-20C-T       = ({})", new String(work.getWse220cT())); 

// *
          // MOVE DPL-JULIAN-DATE TO AD-RPT-DATE7-JULN (3 : 5)
          adRptDate7JulnGroup.setAdRptDate7Juln(replace(adRptDate7JulnGroup.getAdRptDate7JulnString(),work.getDplJulianDateString(),2,7));
//  DISPLAY '*905* AD-RPT-DATE7-JULN = (' AD-RPT-DATE7-JULN ')'
          logger.info("*905* AD-RPT-DATE7-JULN = ({})", String.valueOf(adRptDate7JulnGroup.getAdRptDate7Juln())); 

// *
          // MOVE SPACES TO WS-VAR1
          work.setVar1(CONSTANTS.SPACE_50);
          var1 = work.getVar1();
//  IF WS-VAR1 (43 : 1) NOT EQUAL SPACES
          if (var1[42] != ' ') { 
//  DISPLAY '*906* WS-VAR1 NOT SPACE  : ' WS-VAR1
              logger.info("*906* WS-VAR1 NOT SPACE  : {}", new String(work.getVar1())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*907* WS-VAR1 IS  SPACE  : ' WS-VAR1
              logger.info("*907* WS-VAR1 IS  SPACE  : {}", new String(work.getVar1())); 
          }
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
