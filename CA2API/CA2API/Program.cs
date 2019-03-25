using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using Microsoft.EntityFrameworkCore;
using HelloWorldWebAPI.Models;

namespace HelloWorldWebAPI
{
    public class Program
    {
        public class FootballContext : DbContext       // System.Data.Entity.DbContext        
        {
            public DbSet<Team> Teams { get; set; }
            public DbSet<Match> Matches { get; set; }

            // localDB connection string
            // c:\users\gary\StudentDB1.mdf
            protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
            {
                optionsBuilder.UseSqlServer(@"Server=tcp:footballca2.database.windows.net,1433;Initial Catalog=FootballCa2;Persist Security Info=False;User ID=kalum;Password=Tallaght1;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;");
            }
        }
        public static List<Team> QueryAllTeams()
        {
            using (FootballContext db = new FootballContext())
            {
                // LINQ to entities
                var query = db.Teams.OrderBy(team => team.Name).ToList();
                return query;
            }
        }
        public static List<Match> QueryTeam(int n)
        {
            using (FootballContext db = new FootballContext())
            {
                // LINQ to entities
                var query = db.Teams.Where(team => team.ID == n).First();
                var query2 = db.Matches.Where(match => match.Home == query || match.Away == query).ToList();
                return query2;
            }
        }
        public static void Main(string[] args)
        {
            CreateWebHostBuilder(args).Build().Run();
        }

        public static IWebHostBuilder CreateWebHostBuilder(string[] args) =>
            WebHost.CreateDefaultBuilder(args)
                .UseStartup<Startup>();

        
    }
}
