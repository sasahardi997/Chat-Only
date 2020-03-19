package com.myappcompany.hardi.chatonly.notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {

    // ProjectOverview->Project Settings   Authorization:key = AAAAxnWXQKQ:APA91bECnnuBy_FIgI0BhFEH7hC2fZADONQj8hcifUrttXBjULSkdXZhyRdLtkB8SylDRWbGXbUZZv1RVOT3mjZb4ErOAS7b-B15X5U3pGWKThQv5audEpSkbEu4ObbbcSno5zE2qiWP

    @Headers(
            {
                    "Content-Type: application/json",
                    "Authorization:key = AAAAxnWXQKQ:APA91bECnnuBy_FIgI0BhFEH7hC2fZADONQj8hcifUrttXBjULSkdXZhyRdLtkB8SylDRWbGXbUZZv1RVOT3mjZb4ErOAS7b-B15X5U3pGWKThQv5audEpSkbEu4ObbbcSno5zE2qiWP"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
