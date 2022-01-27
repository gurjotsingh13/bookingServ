import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.paypal.bfs.test.bookingserv.BookingRepo;
import com.paypal.bfs.test.bookingserv.BookingService;
import com.paypal.bfs.test.bookingserv.api.Entities.Address;
import com.paypal.bfs.test.bookingserv.api.Entities.Booking;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class BookingResourceImplTest {

    @Mock
    BookingRepo BookingRepo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllBookingsTest(){
        List<Booking> arr= new ArrayList<Booking>();
        Address a1 = new Address("street 123","panipat","haryana",132103);
        Booking b1 = new Booking("xyz","asdf",new Date(System.currentTimeMillis()), LocalDateTime.now(), LocalDateTime.now(),500,100,a1);
        Booking b2 = new Booking("abcd","singh",new Date(System.currentTimeMillis()), LocalDateTime.now(), LocalDateTime.now(),500,100,a1);
        Booking b3 = new Booking("gurjot","singh",new Date(System.currentTimeMillis()), LocalDateTime.now(), LocalDateTime.now(),500,100,a1);
        Booking b4 = new Booking("ests","yrdyrd",new Date(System.currentTimeMillis()), LocalDateTime.now(), LocalDateTime.now(),500,100,a1);
        arr.add(b1);
        arr.add(b2);
        arr.add(b3);
        arr.add(b4);
        when(BookingRepo.findAll()).thenReturn(arr);
        List<Booking> lt = BookingRepo.findAll();
        assertEquals(4, lt.size());
    }
}