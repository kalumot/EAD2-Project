// Entity Framework Core

using Microsoft.EntityFrameworkCore;                   
using System;
using System.Linq;

// NuGet Package Manager Console:
// Install-Package Microsoft.EntityFrameworkCore.SqlServer
// Install-Package Microsoft.EntityFrameworkCore.Tools                  - migrations
// Add-Migration InitialCreate
// Update-Database                                                      - to create initial database with specified name

// migrate/update ..

namespace EFCoreCA2
{
    // a Student entity
    public class Team                                // POCO
    {
        public int ID { get; set; }                     // PK and identity
        public string Name { get; set; }                // null        
    }
    public class Match                                // POCO
    {
        public int ID { get; set; }                     // PK and identity
        public Team Home { get; set; }                // null
        public Team Away { get; set; }
    }
    // Students table with column names corresponding to property names

    // context of connection to database 
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
    

    // table names are pluralised based on entity name by default in generated db

    class Program
    {
        static void Main()
        {
            using (FootballContext footballContext = new FootballContext())       // DbContext : IDisposable
            {
                
                Team t1 = new Team() { Name = "Cork City"};
                Team t2 = new Team() { Name = "UCD"};
                Team t3 = new Team() { Name = "Shamrock Rovers" };
                Team t4 = new Team() { Name = "Galway United" };

                footballContext.Teams.Add(t1);
                footballContext.Teams.Add(t2);
                footballContext.Teams.Add(t3);
                footballContext.Teams.Add(t4);
                footballContext.SaveChanges();


                Match m1 = new Match() {Home = t1, Away = t2 };
                Match m2 = new Match() { Home = t1, Away = t3 };
                Match m3 = new Match() { Home = t1, Away = t4 };
                Match m4 = new Match() { Home = t2, Away = t3 };
                Match m5 = new Match() { Home = t2, Away = t4 };
                Match m6 = new Match() { Home = t3, Away = t4 };


                footballContext.Matches.Add(m1);
                footballContext.Matches.Add(m2);
                footballContext.Matches.Add(m3);
                footballContext.Matches.Add(m4);
                footballContext.Matches.Add(m5);
                footballContext.Matches.Add(m6);
                footballContext.SaveChanges();

                // query students in order of ascending student number
                // LINQ to entities
                var teamsQueryInOrder = footballContext.Teams.OrderBy(team => team.ID);
                foreach (var team in teamsQueryInOrder)
                {
                    Console.WriteLine(team.ID + " " + " " + team.Name);
                }
                Console.ReadLine();
            }

            // using disposes of unmanaged resources correctly
            // is try / finally with Dispose called on resource in finally
        }
    }
}

/*
Conventions:
Primary Key - property called ID or <classname>ID, int or GUID makes it identity column also
*/

/*
create initial migration (cf migrations folder, code to create, metadata, snapshot)
update database (creates the database initially e.g. StudentDB1.mdf in c:\users\gary
*/

