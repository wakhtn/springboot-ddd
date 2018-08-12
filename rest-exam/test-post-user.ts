import * as axios from 'axios';

(async () => {
   try {
      let rs = await axios.default({
         url: 'http://localhost:8080/v1/user',
         method: 'post',
         data: {
            userName: 'Hatano',
            mailAddr: 'hatano@hatano.co.jp',
            password: 'P@ssw0rd'
         }
      });
      console.log(rs.data);

   } catch (error) {
      console.log(error);
   }
})()