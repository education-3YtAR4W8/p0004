package education.p0004.reservation;

import education.p0004.common.Const;
import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

@Getter
public class OneHourDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    public Map<Integer, String> reservationClassificationMap = new TreeMap<>();

    public OneHourDetail() {
        for (int min : Const.MINUTES) {
            reservationClassificationMap.put(min, Const.RESERVATION_KIND_NONE);
        }
    }

    public void setReservationClassification(int min, String reservationClassification) {
        reservationClassificationMap.put(min, reservationClassification);
    }

    public List<String> getReservationClassificationList() {
        return new ArrayList<>(reservationClassificationMap.values());
    }
}
