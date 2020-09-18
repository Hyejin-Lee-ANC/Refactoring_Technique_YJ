package replace.loop.with.pipeline;

import java.util.Objects;

public class OfficeInfo {
    final String city;
    final String phoneNumber;

    public OfficeInfo(String city, String phoneNumber) {
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeInfo that = (OfficeInfo) o;
        return Objects.equals(city, that.city) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, phoneNumber);
    }
}
