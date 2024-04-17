package com.cydeo.entiity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment_details")
@NoArgsConstructor
@Data
public class PaymentDetails
{
  @Id
  private String id;
  private BigDecimal commissionAmount;
  private BigDecimal merchantPayoutAmount;
  private LocalDate payoutDate;

}
